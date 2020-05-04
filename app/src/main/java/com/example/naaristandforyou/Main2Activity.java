package com.example.naaristandforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button;
        final EditText phone;
        button=findViewById(R.id.button);
        phone=findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ph = phone.getText().toString();
                if (Ph.isEmpty()) {
                    phone.setError("Enter your phone number");
                } else {
                    Intent intent = new Intent(getApplicationContext(), otp.class);
                    startActivity(intent);
                }
            }
        });

}
}
