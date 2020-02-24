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
        Button ma_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edtusername= findViewById(R.id.edtusername);
        edtpassword=findViewById(R.id.edtpassword);
        signup=findViewById(R.id.btnsignup);
        btnlogin=findViewById(R.id.btnlogin);
        ma_btn=findViewById(R.id.ma_btn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","login");
                Intent intent=new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ma_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegistrationActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
    }
}
