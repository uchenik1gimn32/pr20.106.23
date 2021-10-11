package com.example.pr2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myText1 = (TextView) findViewById(R.id.myText1);
        TextView myText2 = (TextView) findViewById(R.id.myText2);
        Button myBtn1 = (Button) findViewById(R.id.myBtn1);
        Button myBtn2 = (Button) findViewById(R.id.myBtn2);
        myBtn1.setText("Красный");
        myBtn2.setText("Зелёный");
        View.OnClickListener RedText = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myText1.setTextColor(0xffff0000);
                myText2.setTextColor(0xffff0000);
            }
        };
        View.OnClickListener BlueText = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myText1.setTextColor(0xff00ff00);
                myText2.setTextColor(0xff00ff00);
            }
        };
        myBtn1.setOnClickListener(RedText);
        myBtn2.setOnClickListener(BlueText);
    }
}