package com.example.user.finalexam;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.finalexam.Fragment.FragmentClickButton;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private Button btnHaNoi, btnSaiGon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHaNoi=(Button)findViewById(R.id.btn_hanoi);
        btnHaNoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentClickButton(view);
            }
        });
        btnSaiGon=(Button)findViewById(R.id.btn_saigon);
        btnSaiGon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentClickButton(view);
            }
        });
    }
    private void showFragmentClickButton(View view){
        FragmentManager fragmentManagerClickButton = getFragmentManager();
        FragmentTransaction fragmentTransactionClickButton = fragmentManagerClickButton.beginTransaction();
        FragmentClickButton fragmentClickButton = new FragmentClickButton();
        if(view.getId() == btnHaNoi.getId()){
            Bundle bundle = new Bundle();
            bundle.putInt("param", 1);
            fragmentClickButton.setArguments(bundle);
        }
        else if(view.getId() == btnSaiGon.getId()){
            Bundle bundle = new Bundle();
            bundle.putInt("param", 0);
            fragmentClickButton.setArguments(bundle);
        }
        fragmentTransactionClickButton.replace(R.id.fragment_container_1, fragmentClickButton);
        fragmentTransactionClickButton.addToBackStack(null);
        fragmentTransactionClickButton.commit();
    }
}
