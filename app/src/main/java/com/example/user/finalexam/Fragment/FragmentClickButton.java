package com.example.user.finalexam.Fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.user.finalexam.Adapter.MyAdapter;
import com.example.user.finalexam.Object.City;
import com.example.user.finalexam.Object.Event;
import com.example.user.finalexam.Object.Info;
import com.example.user.finalexam.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by User on 1/19/2018.
 */

public class FragmentClickButton extends Fragment{
    private ViewFlipper viewFlipper;
    private Animation fadeIn, fadeOut;
    private Button btnEat, btnPlay, btnSpecial, btnBack;
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_click_button, container, false);
        ViewFlipper viewFlipper = (ViewFlipper)view.findViewById(R.id.view_flipper);
        fadeIn= AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
        fadeOut=AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
        viewFlipper.setInAnimation(fadeIn);
        viewFlipper.setOutAnimation(fadeOut);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        btnEat=(Button)view.findViewById(R.id.btn_destination_eat);
        btnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentThird(view);
            }
        });
        btnPlay=(Button)view.findViewById(R.id.btn_destination_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentThird(view);
            }
        });
        btnSpecial=(Button)view.findViewById(R.id.btn_special);
        btnSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentThird(view);
            }
        });
        btnBack=(Button)view.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                fm.popBackStack();
            }
        });
        return view;
    }
    private void showFragmentThird(View view){
        FragmentManager fragmentManagerThird = getChildFragmentManager();
        FragmentTransaction fragmentTransactionThird = fragmentManagerThird.beginTransaction();
        FragmentThird fragmentThird = new FragmentThird();
        Bundle bundle = getArguments();
        if(bundle.getInt("param")==1) {
            if (view.getId() == btnEat.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param2", 11);
                fragmentThird.setArguments(bundleEvent);
            }
            if (view.getId() == btnPlay.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param2", 12);
                fragmentThird.setArguments(bundleEvent);
            }
            if (view.getId() == btnSpecial.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param2", 13);
                fragmentThird.setArguments(bundleEvent);
            }
        }
        if(bundle.getInt("param")==0){
            if (view.getId() == btnEat.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param3", 31);
                fragmentThird.setArguments(bundleEvent);
            }
            if (view.getId() == btnPlay.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param3", 32);
                fragmentThird.setArguments(bundleEvent);
            }
            if (view.getId() == btnSpecial.getId()) {
                Bundle bundleEvent = new Bundle();
                bundleEvent.putInt("param3", 33);
                fragmentThird.setArguments(bundleEvent);
            }
        }
        fragmentTransactionThird.replace(R.id.fragment_container_2, fragmentThird);
        fragmentTransactionThird.addToBackStack(null);
        fragmentTransactionThird.commit();
    }
}
