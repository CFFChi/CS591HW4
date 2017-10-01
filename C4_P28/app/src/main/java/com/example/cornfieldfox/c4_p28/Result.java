package com.example.cornfieldfox.c4_p28;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView unitUpper = (TextView)findViewById(R.id.InputUnit);
        TextView unitLower = (TextView)findViewById(R.id.OutputUnit);
        flag = getIntent().getExtras().getString("type");
        if(flag.equals("ktom"))
        {
            unitUpper.setText("kilometers");
            unitLower.setText("miles");
        }
        else
        {
            unitLower.setText("kilometers");
            unitUpper.setText("miles");
        }

        EditText input = (EditText) findViewById(R.id.InputET);
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!editable.toString().equals("")){
                    double input = Double.parseDouble(editable.toString());
                    double output;
                    if(flag.equals("ktom"))
                    {
                        output = ktom(input);
                    }
                    else
                    {
                        output = mtok(input);
                    }
                    TextView result = (TextView)findViewById(R.id.ResultTx);
                    result.setText(String.format("%.2f",output));
                }
                else
                {
                    TextView result = (TextView)findViewById(R.id.ResultTx);
                    result.setText("0");
                }
            }
        });

        Button back  = (Button)findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(b);
            }
        });
    }

    public double ktom(double input)
    {
        return input/1.61;
    }

    public double mtok(double input)
    {
        return input*1.61;
    }
}
