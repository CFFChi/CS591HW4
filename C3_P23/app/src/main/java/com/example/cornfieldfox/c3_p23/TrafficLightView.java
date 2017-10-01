package com.example.cornfieldfox.c3_p23;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Cornfieldfox on 9/30/17.
 */

public class TrafficLightView extends LinearLayout{
    private TextView redTx;
    private TextView yellowTx;
    private TextView greenTx;
    private Button changeBtn;

    public TrafficLightView(Context context, OnClickListener onClickListener, int side)
    {
        super(context);

        setOrientation(VERTICAL);

        redTx = new TextView(context);
        redTx.setBackgroundColor(0xFFFF0000);
        redTx.setHeight(side);
        redTx.setWidth(side);

        addView(redTx);

        yellowTx = new TextView(context);
        yellowTx.setBackgroundColor(000000000);
        yellowTx.setHeight(side);
        yellowTx.setWidth(side);
        addView(yellowTx);

        greenTx = new TextView(context);
        greenTx.setBackgroundColor(000000000);
        greenTx.setHeight(side);
        greenTx.setWidth(side);
        addView(greenTx);


        changeBtn = new Button(context);
        changeBtn.setText("Change");
        changeBtn.setOnClickListener(onClickListener);
        addView(changeBtn);
    }
    public void changeColor(int flag){
        if(flag == 0)
        {
            redTx.setBackgroundColor(0xFFFF0000);
            yellowTx.setBackgroundColor(000000000);
            greenTx.setBackgroundColor(000000000);

        }
        if(flag == 1)
        {
            redTx.setBackgroundColor(0x00FF0000);
            yellowTx.setBackgroundColor(0xFFFFFF00);
            greenTx.setBackgroundColor(0x0000FF00);

        }
        if(flag == 2)
        {
            redTx.setBackgroundColor(0x00FF0000);
            yellowTx.setBackgroundColor(0x00FFFF00);
            greenTx.setBackgroundColor(0xFF00FF00);

        }
    }

}
