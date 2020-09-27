package com.Shikkhamulok.shikkhamulokghotonaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button zak1,zak2,zak3,zak4,zak5,zak6,zak7,zak8,zak9,zak10,zak11,zak12,zak13,zak14,zak15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("ঘটনাসমূহ");

        zak1=(Button)findViewById(R.id.btn1);
        zak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona1.class);
                startActivity(i);
            }
        });
        zak2=(Button)findViewById(R.id.btn2);
        zak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona2.class);
                startActivity(i);
            }
        });

        zak3=(Button)findViewById(R.id.btn3);
        zak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona3.class);
                startActivity(i);
            }
        });

        zak4=(Button)findViewById(R.id.btn4);
        zak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona4.class);
                startActivity(i);
            }
        });

        zak5=(Button)findViewById(R.id.btn5);
        zak5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona5.class);
                startActivity(i);
            }
        });

        zak6=(Button)findViewById(R.id.btn6);
        zak6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona6.class);
                startActivity(i);
            }
        });

        zak7=(Button)findViewById(R.id.btn7);
        zak7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona7.class);
                startActivity(i);
            }
        });
        zak8=(Button)findViewById(R.id.btn8);
        zak8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona8.class);
                startActivity(i);
            }
        });
        zak9=(Button)findViewById(R.id.btn9);
        zak9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona9.class);
                startActivity(i);
            }
        });

        zak10=(Button)findViewById(R.id.btn10);
        zak10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona10.class);
                startActivity(i);
            }
        });

        zak11=(Button)findViewById(R.id.btn11);
        zak11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona11.class);
                startActivity(i);
            }
        });

        zak12=(Button)findViewById(R.id.btn12);
        zak12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona12.class);
                startActivity(i);
            }
        });

        zak13=(Button)findViewById(R.id.btn13);
        zak13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona13.class);
                startActivity(i);
            }
        });

        zak14=(Button)findViewById(R.id.btn14);
        zak14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona14.class);
                startActivity(i);
            }
        });
        zak15=(Button)findViewById(R.id.btn15);
        zak15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(menu.this,ghotona15.class);
                startActivity(i);
            }
        });

    }
}
