package com.example.pengkodean;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HitungLuas extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitungluas);
        edtPanjang=(EditText)findViewById(R.id.edt_panjang);
        edtLebar=(EditText)findViewById(R.id.edt_lebar);
        txtLuas=(TextView)findViewById(R.id.txt_luas);
        btnHitung= (Button) findViewById(R.id.btn_hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang =edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p * l;

                txtLuas.setText("Luas "+luas);
            }
        });

    }
}
