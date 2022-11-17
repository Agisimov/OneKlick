package com.example.a163;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Boolean XO=true;
    Boolean isStarted=true;
    Boolean ret=true;
    Integer count =0;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonStart;
    TextView button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2= (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonStart = (Button)findViewById(R.id.buttonStart);
        button15 = (TextView) findViewById(R.id.button15);

    }
    public void onCLick(View v)
    {
        if (isStarted) {

            Button vv = (Button) v;
            if (XO) {
                vv.setText("X");
                button15.setText("ходит О");

            } else {
                vv.setText("O");
                button15.setText("ходит Х");
            }

            vv.setEnabled(false);
            XO = !XO;
            if ( count==8)
            {
                button15.setText("Ничья");

            }

            if (button1.getText().toString() == button2.getText().toString()&& button1.getText().toString()==button3.getText().toString()&&button1.getText().toString().length()!=0)
            {
                button15.setText(button1.getText().toString()+" Выиграл");
                button1.setBackgroundResource(R.color.white);
                button2.setBackgroundResource(R.color.white);
                button3.setBackgroundResource(R.color.white);
                isStarted=!isStarted;
            }
            if (button4.getText().toString() == button5.getText().toString()&& button4.getText().toString()==button6.getText().toString()&&button4.getText().toString().length()!=0)
            {
                button15.setText(button4.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button4.setBackgroundResource(R.color.white);
                button5.setBackgroundResource(R.color.white);
                button6.setBackgroundResource(R.color.white);
            }
            if (button7.getText().toString() == button8.getText().toString()&& button7.getText().toString()==button9.getText().toString()&&button7.getText().toString().length()!=0)
            {
                button15.setText(button7.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button7.setBackgroundResource(R.color.white);
                button8.setBackgroundResource(R.color.white);
                button9.setBackgroundResource(R.color.white);
            }//
            if (button1.getText().toString() == button4.getText().toString()&& button1.getText().toString()==button7.getText().toString()&&button1.getText().toString().length()!=0)
            {
                button15.setText(button1.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button1.setBackgroundResource(R.color.white);
                button4.setBackgroundResource(R.color.white);
                button7.setBackgroundResource(R.color.white);
            }
            if (button2.getText().toString() == button5.getText().toString()&& button2.getText().toString()==button8.getText().toString()&&button2.getText().toString().length()!=0)
            {
                button15.setText(button2.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button2.setBackgroundResource(R.color.white);
                button5.setBackgroundResource(R.color.white);
                button8.setBackgroundResource(R.color.white);
            }
            if (button3.getText().toString() == button6.getText().toString()&& button3.getText().toString()==button9.getText().toString()&&button3.getText().toString().length()!=0)
            {
                button15.setText(button3.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button3.setBackgroundResource(R.color.white);
                button6.setBackgroundResource(R.color.white);
                button9.setBackgroundResource(R.color.white);
            }//
            if (button1.getText().toString() == button5.getText().toString()&& button1.getText().toString()==button9.getText().toString()&&button1.getText().toString().length()!=0)
            {
                button15.setText(button1.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button1.setBackgroundResource(R.color.white);
                button5.setBackgroundResource(R.color.white);
                button9.setBackgroundResource(R.color.white);
            }
            if (button3.getText().toString() == button5.getText().toString()&& button3.getText().toString()==button7.getText().toString()&&button3.getText().toString().length()!=0)
            {
                button15.setText(button3.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                button3.setBackgroundResource(R.color.white);
                button5.setBackgroundResource(R.color.white);
                button7.setBackgroundResource(R.color.white);
            }

count++;
        }
    }

    public void onClickStart(View v)
    {

        Intent act = new Intent(this, MainActivity.class);
        startActivity(act);

    }

}