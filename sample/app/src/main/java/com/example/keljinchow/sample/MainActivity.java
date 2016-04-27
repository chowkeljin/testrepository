package com.example.keljinchow.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener  {

    Button btn_hello;
    TextView txt_hello;
    String hello;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hello = (Button)findViewById(R.id.btn_hello);
        txt_hello =(TextView)findViewById(R.id.txt_hello);

        hello="This is my first project @ iApps Asia";
        btn_hello.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        txt_hello.setText(hello);
    }
}
