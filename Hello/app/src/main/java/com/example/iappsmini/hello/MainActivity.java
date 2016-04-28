package com.example.iappsmini.hello;


import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn_Hello;
    TextView txt_Hello;
    String hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Hello = (Button) findViewById(R.id.btn_Hello);
        txt_Hello = (TextView) findViewById(R.id.txt_Hello);

        hello="Hello";
        btn_Hello.setOnClickListener(this);

    }

    public void onClick(View view){
        txt_Hello.setText(hello);
    }
}
