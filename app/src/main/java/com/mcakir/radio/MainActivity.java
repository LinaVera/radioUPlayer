package com.mcakir.radio;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.mcakir.radio.fragments.HojaProgramacionFragment;
import com.mcakir.radio.player.PlaybackStatus;
import com.mcakir.radio.player.RadioManager;
import com.mcakir.radio.views.MyAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.playTrigger)
    ImageButton trigger;
    @BindView(R.id.listview)
    ListView listView;
    @BindView(R.id.name)
    TextView textView;
    @BindView(R.id.sub_player)
    View subPlayer;
    RadioManager radioManager;
    String streamURL;


    //Variables de tablayout
    TabLayout tabs;
    ViewPager contenedor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*      // TABLAYOUT
        tabs = findViewById(R.id.tabs);
        contenedor = findViewById(R.id.contenedor);

        adapter = new MyAdapter(this, getSupportFragmentManager(), 2);
        contenedor.setAdapter(adapter);
        contenedor.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                                          @Override
                                          public void onTabSelected(TabLayout.Tab tab) {
                                              if(tab.getPosition() == 0){
                                                  tab.setCustomView(R.layout.fragment_hoja_programacion);
                                              }else if(tab.getPosition() == 1){
                                                  tab.setCustomView(R.layout.fragment_equipo);
                                              }if(tab.getPosition() == 2){
                                                  tab.setCustomView(R.layout.fragment_programas);
                                              }
                                              contenedor.setCurrentItem(tab.getPosition());

                                          }
                                          @Override
                                          public void onTabUnselected(TabLayout.Tab tab) {

                                          }

                                          @Override
                                          public void onTabReselected(TabLayout.Tab tab) {

                                          }
                                      });*/

        //RADIO
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        radioManager = RadioManager.with(this);
        streamURL = "https://apps.ufps.edu.co/emisoraufps";
        subPlayer.setVisibility(View.VISIBLE);
        //RADIO

      /*  binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/


    }
//    BOTONES DE RADIO
    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        radioManager.unbind();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        radioManager.bind();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Subscribe
    public void onEvent(String status){
        switch (status){
            case PlaybackStatus.LOADING:
                // loading
                break;
            case PlaybackStatus.ERROR:
                Toast.makeText(this, R.string.no_stream, Toast.LENGTH_SHORT).show();
                break;
        }
        trigger.setImageResource(status.equals(PlaybackStatus.PLAYING)
                ? R.drawable.ic_pause_black
                : R.drawable.ic_play_arrow_black);
    }

    @OnClick(R.id.playTrigger)
    public void onClicked(){
        if(TextUtils.isEmpty(streamURL)) return;
        radioManager.playOrPause(streamURL);
    }
    //    BOTONES DE RADIO

}
