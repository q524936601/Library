package com.example.stu.library;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btntianjia,btnchaxun,btnexit,btnshanchu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntianjia=findViewById(R.id.btn_main_tianjia);
        btntianjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TJshujiActivity.class);
                startActivity(intent);
            }
        });
        btnchaxun=findViewById(R.id.btn_main_chaxun);
        btnchaxun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ChaxunActivity.class);
                startActivity(intent);
            }
        });
        btnshanchu=findViewById(R.id.btn_main_shanchu);
        btnshanchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ChaxunActivity.class);
                startActivity(intent);
            }
        });

       btnexit=findViewById(R.id.btn_main_exit);
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();
            }
        });



    }


}
