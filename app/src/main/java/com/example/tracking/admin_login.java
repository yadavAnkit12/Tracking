package com.example.tracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class admin_login extends AppCompatActivity {
EditText name,pass;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("Ankit") && pass.getText().toString().equals("12345"))
                {
                    name.setText("");
                    pass.setText("");
                    Intent intent=new Intent(admin_login.this,admin.class);
                    startActivity(intent);
                }
            }
        });

    }
}