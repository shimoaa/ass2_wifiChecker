package com.example.assi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ConnectionDetector cd;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cd = new ConnectionDetector(getApplicationContext());
        check = (Button) findViewById(R.id.checkstatus);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cd.hasInternetConnection()) {
                    Toast.makeText(getApplicationContext(),
                            "Connected To Internet", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Sorry Not Connected To Internet", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}