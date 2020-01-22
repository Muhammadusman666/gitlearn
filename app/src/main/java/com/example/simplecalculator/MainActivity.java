package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btnadd , btnsubtract , btnmultiply , btndivide , btndot ,
            btnone , btntwo, btnthree, btnfour, btnfive, btnsix, btnseven, btneight, btnnine, btnequal
            ,btnzero;
    TextView tv,tvresult;
    EditText ed;

    float number,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.btntv);
        ed=(EditText) findViewById(R.id.btned);

        btnadd=(Button)findViewById(R.id.btnadd);
        btndivide=(Button)findViewById(R.id.btndivide);
        btnmultiply=(Button)findViewById(R.id.btnmultiply);
        btnsubtract=(Button)findViewById(R.id.btnsubtract);

        btndot=(Button)findViewById(R.id.btndot);
        btnequal=(Button)findViewById(R.id.btnequal);

        btnzero=(Button)findViewById(R.id.btnzero);
        btnone=(Button)findViewById(R.id.btnone);
        btntwo=(Button)findViewById(R.id.btntwo);
        btnthree=(Button)findViewById(R.id.btnthree);
        btnfour=(Button)findViewById(R.id.btnfour);
        btnfive=(Button)findViewById(R.id.btnfive);
        btnsix=(Button)findViewById(R.id.btnsix);
        btnseven=(Button)findViewById(R.id.btnseven);
        btneight=(Button)findViewById(R.id.btneight);
        btnnine=(Button)findViewById(R.id.btnnine);


        btnequal.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);

        btnzero.setOnClickListener(this);
        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btnthree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);
        btnseven.setOnClickListener(this);
        btneight.setOnClickListener(this);
        btnnine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnzero:
                ed.setText("0");
                 break;

            case R.id.btnone:
                ed.setText("1");
                break;

            case R.id.btntwo:
                ed.setText("2");
                break;

            case R.id.btnthree:
                ed.setText("3");
                break;

            case R.id.btnfour:
                ed.setText("4");
                break;

            case R.id.btnfive:
                ed.setText("5");
                break;

            case R.id.btnsix:
                ed.setText("6");
                break;

            case R.id.btnseven:
                ed.setText("7");
                break;

            case R.id.btneight:
                ed.setText("8");
                break;

            case R.id.btnnine:
                ed.setText("9");
                break;

            case R.id.btnadd:
                ed.setText("+");
                break;

            case R.id.btnsubtract:
                ed.setText("-");
                break;

            case R.id.btnmultiply:
                ed.setText("*");
                break;

            case R.id.btndivide:
                ed.setText("/");
                break;

            case R.id.btndot:
                ed.setText(".");
                break;
        }
    }
}
