package com.rahul.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
        EditText edtusername, edtpassword;
        TextView signup;
        Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edtusername= findViewById(R.id.edtusername);
        edtpassword=findViewById(R.id.edtpassword);
        signup=findViewById(R.id.btnsignup);
        btnlogin=findViewById(R.id.btnlogin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
