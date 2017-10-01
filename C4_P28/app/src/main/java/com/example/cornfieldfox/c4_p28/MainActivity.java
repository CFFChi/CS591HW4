package com.example.cornfieldfox.c4_p28;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup)findViewById(R.id.MKGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i==R.id.KiloToMileRBtn)
                {
                    flag = "ktom";

                }
                else{
                    flag = "mtok";
                }

            }
        });

        Button btn = (Button)findViewById(R.id.Calculate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Result.class);
                intent.putExtra("type",flag);
                startActivity(intent);


            }
        });

    }

}
