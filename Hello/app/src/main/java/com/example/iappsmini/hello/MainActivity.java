package com.example.iappsmini.hello;


import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Login = (Button) findViewById(R.id.btn_Login);
    }

    public void onClick(View view){

    }
}
