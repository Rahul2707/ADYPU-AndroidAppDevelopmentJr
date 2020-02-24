package com.rahul.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Bundle bundle=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle=getIntent().getExtras();
        if(bundle!=null){
            Toast.makeText(this,bundle.getString("callFrom"),Toast.LENGTH_LONG).show();
        }
    }
}
