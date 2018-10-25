package com.sunny.www.eventlongmain;//feat 연쌤

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener,View.OnClickListener {
    Button button1, button2, button3, button4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button1.setOnLongClickListener(this);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button2.setOnLongClickListener(this);

        button3=(Button)findViewById(R.id.button3);
        button3.setOnLongClickListener(this);
        button3.setOnLongClickListener(this);

        button4=(Button)findViewById(R.id.button4);
        button4.setOnLongClickListener(this);
        button4.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+((Button)v).getText());
                break;
            case R.id.button2:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+((Button)v).getText());
                break;
            case R.id.button3:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                textView.setText("OnLongClic"+((Button)v).getText());
                break;
            case R.id.button4:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                textView.setText("OnLongClick"+((Button)v).getText());
                break;
                default:
                    textView.setText("notthing");
                    break;
        }

    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId()==R.id.button1){
            textView.setText("OnLongClick"+((Button)v).getText());
        }
        else if (v.getId()==R.id.button2){
            textView.setText("OnLongClick"+((Button)v).getText());
        }
        else if (v.getId()==R.id.button3){
            textView.setText("OnLongClick"+((Button)v).getText());
        }
        else {
            textView.setText("OnLongClick"+((Button)v).getText());
        }
        return true;

    }
}
