package com.example.stu.library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Duzhe2Activity extends AppCompatActivity {
    EditText edtTxtzhanghao,edtTxtmima;
    Button btndenglu,btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duzhe2);
        edtTxtzhanghao=findViewById(R.id.edtTxt_duzhe2_zhanghao);
        edtTxtmima=findViewById(R.id.edtTxt_duzhe2_mima);
        btndenglu=findViewById(R.id.btn_duzhe2_denglu);
        btnexit=findViewById(R.id.btn_duzhe2_exit);

        btndenglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DuzheActivity.class);
                String zhanghao=edtTxtzhanghao.getText().toString().trim();
                String mima=edtTxtmima.getText().toString().trim();
                intent.putExtra("zhanghao",zhanghao);
                intent.putExtra("mima",mima);
                startActivity(intent);

            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}
