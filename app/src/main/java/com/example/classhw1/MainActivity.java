package com.example.classhw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login,signup;
    TextView username,password;
    EditText un,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.button);
        login.setOnClickListener(this);
        signup = (Button) findViewById(R.id.button2);
        username = (TextView) findViewById(R.id.textView2);
        password = (TextView) findViewById(R.id.textView);
        un = (EditText) findViewById(R.id.editTextTextPersonName4);
        pw = (EditText) findViewById(R.id.editTextTextPersonName5);
    }

    @Override
    public void onClick(View view) {
        login.setText("LOGOUT");
    }
}