package com.example.pengkodean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhu extends AppCompatActivity {
    Button btn_konversi;
    EditText celcius,kelvin,farenheit,reamur;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konversi_layout);
        celcius = (EditText)findViewById(R.id.edtxt_celcius);
        kelvin = (EditText)findViewById(R.id.edtxt_kelvin);
        farenheit = (EditText)findViewById(R.id.edtxt_farenheit);
        reamur = (EditText)findViewById(R.id.edtxt_reamur);
        btn_konversi = (Button)findViewById(R.id.btn_konvert);
        btn_konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                konversisuhu();
            }
        });
    }
    public void konversisuhu (){
        try {
            int ncelcius = Integer.parseInt(celcius.getText().toString());

            double kelv = ncelcius*273.15;
            double faren = ncelcius*1.8*32;
            double rea = ncelcius*6.8;
            kelvin.setText(String.valueOf(kelv)+" K°");
            farenheit.setText(String.valueOf(faren)+" F°");
            reamur.setText(String.valueOf(rea)+" R°");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
