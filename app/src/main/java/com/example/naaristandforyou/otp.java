package com.example.naaristandforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class otp extends AppCompatActivity {

    private EditText otp;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
     button=findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            private Object Intent;

            @   Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Registration.class);
                startActivity(intent);

            }
        });
    }
}
