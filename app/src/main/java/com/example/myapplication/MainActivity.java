package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
//import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

EditText username ,password;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.loginbutton);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    //Intent myIntent = new Intent(MainActivity.this, DisplayImageActivity.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(new Intent(MainActivity.this, DisplayImageActivity.class));
                } else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials",Toast.LENGTH_SHORT).show();
                    }

            }
        });

    }

}
