package com.example.shrut.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Contact;
    private EditText Password;
    private Button Login;
    private Button New;
    private int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickListener();
        signupOnClick();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onClickListener() {
        Contact= findViewById(R.id.etPhone);
        Password= findViewById(R.id.etPassword);
        Login= findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Contact.getText().toString().equals("8177963943")) && (Password.getText().toString().equals("1234"))) {
                    Intent intent = new Intent("com.example.shrut.myapplication.Main2Activity");
                    startActivity(intent);
                }
                else
                {
                    count--;
                    if(count==0)
                    {
                        Login.setEnabled(false);
                    }
                }

            }
        });


    }
    public void signupOnClick() {
        New= findViewById(R.id.btnNew);
        New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent1);
            }
        });
    }
}

