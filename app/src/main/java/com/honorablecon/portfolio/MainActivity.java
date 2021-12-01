package com.honorablecon.portfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView sidebar_nav_code;
    private TextView sidebar_nav_scolary;
    private TextView sidebar_nav_realized;
    private TextView sidebar_nav_hobbies;
    private TextView sidebar_nav_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sidebar_nav_code = findViewById(R.id.sidebar_nav_code);
        sidebar_nav_scolary = findViewById(R.id.sidebar_nav_scolary);
        sidebar_nav_realized = findViewById(R.id.sidebar_nav_realized);
        sidebar_nav_hobbies = findViewById(R.id.sidebar_nav_hobbies);
        sidebar_nav_contact = findViewById(R.id.sidebar_nav_contact);

        sidebar_nav_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyServices.class));
            }
        });
        sidebar_nav_scolary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyEducation.class));
            }
        });
       sidebar_nav_realized.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyExperiences.class));
            }
        });
        sidebar_nav_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyContacts.class));
            }
        });
        sidebar_nav_hobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyHobbies.class));
            }
        });
    }
}