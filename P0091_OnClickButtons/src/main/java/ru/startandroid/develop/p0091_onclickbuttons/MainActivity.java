package ru.startandroid.develop.p0091_onclickbuttons;


import androidx.appcompat.app.AppCompatActivity;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    EditText editTextTextEmailAddress;
    EditText editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        };
            public void onClick(View v) {
                String a= editTextTextEmailAddress.getText().toString();
                String b= editTextTextPassword.getText().toString();
                if (a== "admin" && b == "admin")
                {
                    tvOut.setText("Авторизация пройдена");
                }
                else
                {
                    tvOut.setText("Авторизация не пройдена");
                }



            }
        };











