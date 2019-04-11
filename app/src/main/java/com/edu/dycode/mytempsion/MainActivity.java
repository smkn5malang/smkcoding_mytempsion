package com.edu.dycode.mytempsion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur;
    Button btn_konversi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celcius = findViewById (R.id.txtcelcius);
        kelvin = findViewById (R.id.txtkelvin);
        farenheit = findViewById (R.id.txtfarenheit);
        reamur = findViewById (R.id.txtreamur);
        btn_konversi = findViewById (R.id.button2);
    }
    public void konversisuhu (View view){
        try{
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius*273.15;
            double nfarenheit = ncelcius*1.8*32;
            double nreamur = ncelcius*6.8;
            kelvin.setText(String.valueOf(nkelvin));
            farenheit.setText(String.valueOf(nfarenheit));
            reamur.setText(String.valueOf(nreamur));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}