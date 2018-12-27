package com.example.stu.library;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btndenglu,btnzhuce,btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndenglu=findViewById(R.id.btn_main_denglu);
        btndenglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,dengluActivity.class);
                startActivity(intent);
            }
        });
        btnzhuce=findViewById(R.id.btn_main_zhuce);
        btnzhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ZhuceActivity.class);
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
