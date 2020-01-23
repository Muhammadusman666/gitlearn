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
            ,btnzero,btnclr;
    TextView tv;
    EditText ed;
    float result1,result2;
    boolean add,subtract,multiply,divide;

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
        btnclr=(Button)findViewById(R.id.btnclr);

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

        btnclr.setOnClickListener(this);
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
                ed.setText(ed.getText()+"0");
                 break;

            case R.id.btnone:
                ed.setText(ed.getText()+"1");
                break;

            case R.id.btntwo:
                ed.setText(ed.getText()+"2");
                break;

            case R.id.btnthree:
                ed.setText(ed.getText()+"3");
                break;

            case R.id.btnfour:
                ed.setText(ed.getText()+"4");
                break;

            case R.id.btnfive:
                ed.setText(ed.getText()+"5");
                break;

            case R.id.btnsix:
                ed.setText(ed.getText()+"6");
                break;

            case R.id.btnseven:
                ed.setText(ed.getText()+"7");
                break;

            case R.id.btneight:
                ed.setText(ed.getText()+"8");
                break;

            case R.id.btnnine:
                ed.setText(ed.getText()+"9");
                break;

            case R.id.btndot:
                ed.setText(ed.getText()+".");
                break;


            case R.id.btnadd:
                if(ed==null) {
                    ed.setText("");
                }
                else{
                    result1=(Float.parseFloat(ed.getText()+""));
                    add=true;
                    ed.setText("");
                }
                break;

            case R.id.btnsubtract:
                if(ed==null) {
                    ed.setText("");
                }
                else {
                    result1 = (Float.parseFloat(ed.getText() + ""));
                    subtract = true;
                    ed.setText("");
                }
                break;

            case R.id.btnmultiply:
                if(ed==null) {
                    ed.setText("");
                }
                else {
                    result1 = (Float.parseFloat(ed.getText() + ""));
                    multiply = true;
                    ed.setText("");
                }
                break;

            case R.id.btndivide:
                if(ed==null) {
                    ed.setText("");
                }
                else {
                    result1 = (Float.parseFloat(ed.getText() +""));
                    divide = true;
                    ed.setText("");
                }
                break;

            case R.id.btnequal:

                 result2=(Float.parseFloat(ed.getText()+""));
                 if(add==true){
                     ed.setText(result1+result2+"");
                     add=false;
                 }
                if(subtract==true){
                    ed.setText(result1+result2+"");
                    subtract=false;
                }

                if(multiply==true){
                    ed.setText(result1+result2+"");
                    multiply=false;
                }
                if(divide==true){
                    ed.setText(result1+result2+"");
                    divide=false;
                }
                break;
            case R.id.btnclr:
                ed.setText("");
        }
    }
}
