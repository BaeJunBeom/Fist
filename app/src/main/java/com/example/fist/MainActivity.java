package com.example.fist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this,"읽어오는 중", Toast.LENGTH_LONG).show();
        Button button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);


                setContentView(R.layout.btn);
                View.OnClickListener listener = new View.OnClickListener() {
                    Button btn1 = (Button) findViewById(R.id.btn1);
                    Button btn2 = (Button) findViewById(R.id.btn2);
                    Button btn3 = (Button) findViewById(R.id.btn3);
                    Button btn4 = (Button) findViewById(R.id.btn4);
                    Button btn5 = (Button) findViewById(R.id.btn5);
                    Button btn6 = (Button) findViewById(R.id.btn6);

                    public void onClick(View v) {
                        switch (v.getId()) {
                            case R.id.btn1:
                               break;
                            case R.id.btn2:
                                break;
                            case R.id.btn3:
                                break;
                            case R.id.btn4:
                                break;
                            case R.id.btn5:
                                break;
                            case  R.id.btn6:
                                break;
                        }
                    }
                };
            }
        });
    }
}


