package com.vaibhav.experiment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    int n1,n2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.first);
        e2=(EditText)findViewById(R.id.second);
        t1=(TextView)findViewById(R.id.result);
    }

    public void Plus(View view) {
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        result=n1+n2;
        t1.setText(""+result);
    }

    public void Minus(View view) {
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        result=n1-n2;
        t1.setText(""+result);
    }

    public void Multi(View view) {
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        result=n1*n2;
        t1.setText(""+result);
    }

    public void Div(View view) {
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        double resul=(double) n1/n2;
        t1.setText(""+resul);
    }
}
