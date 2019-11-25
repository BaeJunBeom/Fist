package com.example.fist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;

public class B extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        }
    public void onClick_handler(View view){
        Intent intent = new Intent(B.this, C. class);
        startActivity(intent);
    }
}

