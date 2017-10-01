package com.example.cornfieldfox.c3_p23;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public int flag = 0;
    private TrafficLightView trafficView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int side = size.y/4;
        ButtonHolder bh = new ButtonHolder();
        trafficView = new TrafficLightView(this,bh,side);
        setContentView(trafficView);
    }
    private class ButtonHolder implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            flag = (flag+1)%3;
            trafficView.changeColor(flag);

        }
    }
}
