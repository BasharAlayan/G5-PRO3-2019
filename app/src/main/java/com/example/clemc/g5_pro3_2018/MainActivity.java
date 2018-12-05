package com.example.clemc.g5_pro3_2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_addPerson;
    Button btn_trombinoscope;


    //Button btn2=new Button();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombinoscope=(Button) findViewById(R.id.btn_trombinoscope);

        btn_trombinoscope.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BIENVENUE AU TROMBINOSCOPE", Toast.LENGTH_LONG).show();
            }
        });

        btn_addPerson=(Button) findViewById(R.id.btn_addpersonredirect);
        btn_addPerson.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"BIENVENUE AU TROMBINOSCOPE",Toast.LENGTH_LONG).show();

            }
        });
    }
}

