package com.example.pengkodean;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity implements View.OnClickListener {
    EditText nilai;
    TextView nilai2;
    Button btn_AC , btn_7, btn_8, btn_9, btn_4, btn_5, btn_6,
            btn_1, btn_2 , btn_3, btnplus, btn_0, btnmin ,
            btnbtg, btnsmdgn, btnbagi, btntitik;
    float var1 , var2;
    boolean tambah,bagi,kali,kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        nilai = (EditText)findViewById(R.id.txt1);
        nilai2 = (TextView)findViewById(R.id.txt2);
        btn_AC = (Button)findViewById(R.id.btnAC);
        btn_AC.setOnClickListener(this);
        btn_0 = (Button)findViewById(R.id.btn0);
        btn_0.setOnClickListener(this);
        btn_1 = (Button)findViewById(R.id.btn1);
        btn_1.setOnClickListener(this);
        btn_2 = (Button)findViewById(R.id.btn2);
        btn_2.setOnClickListener(this);
        btn_3 = (Button)findViewById(R.id.btn3);
        btn_3.setOnClickListener(this);
        btn_4 = (Button)findViewById(R.id.btn4);
        btn_4.setOnClickListener(this);
        btn_5 = (Button)findViewById(R.id.btn5);
        btn_5.setOnClickListener(this);
        btn_6 = (Button)findViewById(R.id.btn6);
        btn_6.setOnClickListener(this);
        btn_7 = (Button)findViewById(R.id.btn7);
        btn_7.setOnClickListener(this);
        btn_8 = (Button)findViewById(R.id.btn8);
        btn_8.setOnClickListener(this);
        btn_9 = (Button)findViewById(R.id.btn9);
        btn_9.setOnClickListener(this);
        btntitik =(Button)findViewById(R.id.btnttk);
        btntitik.setOnClickListener(this);
        btnplus =(Button)findViewById(R.id.btntmbh);
        btnplus.setOnClickListener(this);
        btnmin =(Button)findViewById(R.id.btnkrg);
        btnmin.setOnClickListener(this);
        btnbagi =(Button)findViewById(R.id.btnbagi);
        btnbagi.setOnClickListener(this);
        btnbtg =(Button)findViewById(R.id.btnkali);
        btnbtg.setOnClickListener(this);
        btnsmdgn = (Button)findViewById(R.id.btnsamadgn);
        btnsmdgn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                nilai.setText(nilai.getText().toString().trim()+"0");
                break;
            case R.id.btn1:
                nilai.setText(nilai.getText().toString().trim()+"1");
                break;
            case R.id.btn2:
                nilai.setText(nilai.getText().toString().trim()+"2");
                break;
            case R.id.btn3:
                nilai.setText(nilai.getText().toString().trim()+"3");
                break;
            case R.id.btn4:
                nilai.setText(nilai.getText().toString().trim()+"4");
                break;
            case R.id.btn5:
                nilai.setText(nilai.getText().toString().trim()+"5");
                break;
            case R.id.btn6:
                nilai.setText(nilai.getText().toString().trim()+"6");
                break;
            case R.id.btn7:
                nilai.setText(nilai.getText().toString().trim()+"7");
                break;
            case R.id.btn8:
                nilai.setText(nilai.getText().toString().trim()+"8");
                break;
            case R.id.btn9:
                nilai.setText(nilai.getText().toString().trim()+"9");
                break;
            case R.id.btnAC:
                nilai.setText("");
                break;
            case R.id.btntmbh:
                nilai2.setText("Tambah");
                var1 = Float.parseFloat(nilai.getText().toString().trim());
                tambah = true;
                nilai.setText(null);
                break;
            case R.id.btnkrg:
                nilai2.setText("Kurang");
                var1 = Float.parseFloat(nilai.getText().toString().trim());
                kurang = true;
                nilai.setText(null);
                break;
            case R.id.btnkali:
                nilai2.setText("Kali");
                var1 = Float.parseFloat(nilai.getText().toString().trim());
                kali = true;
                nilai.setText(null);
                break;
            case R.id.btnbagi:
                nilai2.setText("Bagi");
                var1 = Float.parseFloat(nilai.getText().toString().trim());
                bagi = true;
                nilai.setText(null);
                break;
            case R.id.btnsamadgn:
                var2 = Float.parseFloat(nilai.getText().toString().trim());
                nilai2.setText(" ");
                if (tambah == true) {
                    nilai.setText(var1 + var2 +"");
                    tambah = false;
                }else if(kurang == true){
                    nilai.setText(var1 - var2 +"");
                    kurang = false;
                }else if(kali == true){
                    nilai.setText(var1 * var2 +"");
                    kali = false;
                }else if(bagi == true){
                    nilai.setText(var1 / var2 +"");
                    bagi = false;
                }

        }
    }
}