package com.example.user.finalexam.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.user.finalexam.Adapter.MyAdapter;
import com.example.user.finalexam.MainActivity;
import com.example.user.finalexam.Object.City;
import com.example.user.finalexam.Object.Event;
import com.example.user.finalexam.Object.Info;
import com.example.user.finalexam.R;
import com.google.gson.Gson;
import com.example.user.finalexam.Fragment.FragmentClickButton;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/20/2018.
 */

public class FragmentThird extends Fragment{
    private Button btnBackRv, btnMap;
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_recycle_view, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        Bundle bundleEvent = getArguments();
        Gson gson = new Gson();
        City city = gson.fromJson(loadJSONFromAsset(), City.class);
        try {
            if (bundleEvent.getInt("param2") == 11) {
                List<Info> infoArrayListEat = city.getHanoi().get(0).getEat();
                myAdapter = new MyAdapter(infoArrayListEat);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            if (bundleEvent.getInt("param2") == 12) {
                List<Info> infoArrayListPlay = city.getHanoi().get(0).getPlay();
                myAdapter = new MyAdapter(infoArrayListPlay);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            if (bundleEvent.getInt("param2") == 13) {
                List<Info> infoArrayListHoliday = city.getHanoi().get(0).getHoliday();
                myAdapter = new MyAdapter(infoArrayListHoliday);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            if (bundleEvent.getInt("param3") == 31) {
                List<Info> infoArrayListEat = city.getHcm().get(0).getEat();
                myAdapter = new MyAdapter(infoArrayListEat);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            if (bundleEvent.getInt("param3") == 32) {
                List<Info> infoArrayListPlay = city.getHcm().get(0).getPlay();
                myAdapter = new MyAdapter(infoArrayListPlay);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            if (bundleEvent.getInt("param3") == 33) {
                List<Info> infoArrayListHoliday = city.getHcm().get(0).getHoliday();
                myAdapter = new MyAdapter(infoArrayListHoliday);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(myAdapter);
            }
            btnMap = (Button)view.findViewById(R.id.btn_map);
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    android.app.FragmentManager fragmentManagerMap = getFragmentManager();
                    FragmentTransaction fragmentTransactionMap = fragmentManagerMap.beginTransaction();
                    MapsActivity mapsActivity = new MapsActivity();
                    fragmentTransactionMap.replace(R.id. fragment_container_3, mapsActivity);
                    fragmentTransactionMap.addToBackStack(null);
                    fragmentTransactionMap.commit();
                }
            });
            btnBackRv = (Button) view.findViewById(R.id.btn_back_rv);
            btnBackRv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    android.app.FragmentManager fm2 = getFragmentManager();
                    fm2.popBackStack();
                }
            });

        }catch(Exception E){
            E.printStackTrace();
        }
        return view;
    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getActivity().getAssets().open("data.json.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-16LE");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
