package com.example.sinki.bai23checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAndroid,chkCShaph,chkJava;
    Button btnChon;
    TextView txtMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kq = "";
                if(chkAndroid.isChecked())
                {
                    kq+=chkAndroid.getText().toString() +"\n";
                }
                if(chkCShaph.isChecked())
                {
                    kq+=chkCShaph.getText().toString()+"\n";
                }
                if(chkJava.isChecked())
                {
                    kq+=chkJava.getText().toString();
                }
                txtMonHoc.setText(kq);
            }
        });
    }

    private void addControls() {
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkCShaph = (CheckBox) findViewById(R.id.chkCShaph);
        chkJava = (CheckBox) findViewById(R.id.chkJava);
        btnChon = (Button) findViewById(R.id.btnChon);
        txtMonHoc = (TextView) findViewById(R.id.txtMonHoc);

    }
}
