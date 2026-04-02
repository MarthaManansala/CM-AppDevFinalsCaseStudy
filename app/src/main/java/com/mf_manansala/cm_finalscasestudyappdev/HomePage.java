package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Button btnViewFullCalendar = findViewById(R.id.btnViewFullCalendar);
        btnViewFullCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Database/Records Added by the User */
                intent = new Intent(HomePage.this, RecordsActivity.class);
                startActivity(intent);
            }
        });

        Button btnJumpJan = findViewById(R.id.btnJumpJan);
        btnJumpJan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnJumpFeb = findViewById(R.id.btnJumpFeb);
        btnJumpFeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, February.class);
                startActivity(intent);
            }
        });

        Button btnJumpMar = findViewById(R.id.btnJumpMar);
        btnJumpMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, March.class);
                startActivity(intent);
            }
        });

        Button btnJumpApr = findViewById(R.id.btnJumpApr);
        btnJumpApr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, April.class);
                startActivity(intent);
            }
        });

        Button btnJumpMay = findViewById(R.id.btnJumpMay);
        btnJumpMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, May.class);
                startActivity(intent);
            }
        });

        Button btnJumpJune = findViewById(R.id.btnJumpJune);
        btnJumpJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, June.class);
                startActivity(intent);
            }
        });

        Button btnJumpJuly = findViewById(R.id.btnJumpJuly);
        btnJumpJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, July.class);
                startActivity(intent);
            }
        });

        Button btnJumpAug = findViewById(R.id.btnJumpAug);
        btnJumpAug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, August.class);
                startActivity(intent);
            }
        });

        Button btnJumpSept = findViewById(R.id.btnJumpSept);
        btnJumpSept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, September.class);
                startActivity(intent);
            }
        });

        Button btnJumpOct = findViewById(R.id.btnJumpOct);
        btnJumpOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, October.class);
                startActivity(intent);
            }
        });

        Button btnJumpNov = findViewById(R.id.btnJumpNov);
        btnJumpNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, November.class);
                startActivity(intent);
            }
        });

        Button btnJumpDec = findViewById(R.id.btnJumpDec);
        btnJumpDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, December.class);
                startActivity(intent);
            }
        });
    }
}
