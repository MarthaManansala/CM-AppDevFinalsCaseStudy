package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class April extends Activity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.april);

        Button d1 = findViewById(R.id.april1btn);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 1);
                startActivity(intent);
            }
        });

        Button d2 = findViewById(R.id.april2btn);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 2);
                startActivity(intent);
            }
        });

        Button d3 = findViewById(R.id.april3btn);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedDay", 3);
                startActivity(intent);
            }
        });

        Button d4 = findViewById(R.id.april4btn);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 4);
                startActivity(intent);
            }
        });

        Button d5 = findViewById(R.id.april5btn);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 5);
                startActivity(intent);
            }
        });

        Button d6 = findViewById(R.id.april6btn);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 6);
                startActivity(intent);
            }
        });

        Button d7 = findViewById(R.id.april7btn);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 7);
                startActivity(intent);
            }
        });

        Button d8 = findViewById(R.id.april8btn);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 8);
                startActivity(intent);
            }
        });

        Button d9 = findViewById(R.id.april9btn);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 9);
                startActivity(intent);
            }
        });

        Button d10 = findViewById(R.id.april10btn);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 10);
                startActivity(intent);
            }
        });

        Button d11 = findViewById(R.id.april11btn);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 11);
                startActivity(intent);
            }
        });

        Button d12 = findViewById(R.id.april12btn);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 12);
                startActivity(intent);
            }
        });

        Button d13 = findViewById(R.id.april13btn);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 13);
                startActivity(intent);
            }
        });

        Button d14 = findViewById(R.id.april14btn);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 14);
                startActivity(intent);
            }
        });

        Button d15 = findViewById(R.id.april15btn);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 15);
                startActivity(intent);
            }
        });

        Button d16 = findViewById(R.id.april16btn);
        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 16);
                startActivity(intent);
            }
        });

        Button d17 = findViewById(R.id.april17btn);
        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 17);
                startActivity(intent);
            }
        });

        Button d18 = findViewById(R.id.april18btn);
        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 18);
                startActivity(intent);
            }
        });

        Button d19 = findViewById(R.id.april19btn);
        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 19);
                startActivity(intent);
            }
        });

        Button d20 = findViewById(R.id.april20btn);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 20);
                startActivity(intent);
            }
        });

        Button d21 = findViewById(R.id.april21btn);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 21);
                startActivity(intent);
            }
        });

        Button d22 = findViewById(R.id.april22btn);
        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 22);
                startActivity(intent);
            }
        });

        Button d23 = findViewById(R.id.april23btn);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 23);
                startActivity(intent);
            }
        });

        Button d24 = findViewById(R.id.april24btn);
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 24);
                startActivity(intent);
            }
        });

        Button d25 = findViewById(R.id.april25btn);
        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 25);
                startActivity(intent);
            }
        });

        Button d26 = findViewById(R.id.april26btn);
        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 26);
                startActivity(intent);
            }
        });

        Button d27 = findViewById(R.id.april27btn);
        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 27);
                startActivity(intent);
            }
        });

        Button d28 = findViewById(R.id.april28btn);
        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 28);
                startActivity(intent);
            }
        });

        Button d29 = findViewById(R.id.april29btn);
        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 29);
                startActivity(intent);
            }
        });

        Button d30 = findViewById(R.id.april30btn);
        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, SetOfButtonsApril.class);
                intent.putExtra("PickedMonth", "April");
                intent.putExtra("PickedDay", 30);
                startActivity(intent);
            }
        });

        Button btnReturnToMarch = findViewById(R.id.btnReturnToMarch);
        btnReturnToMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, March.class);
                startActivity(intent);
            }
        });

        Button btnToMayLayout = findViewById(R.id.btnToMayLayout);
        btnToMayLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(April.this, May.class);
                startActivity(intent);
            }
        });

    }
}