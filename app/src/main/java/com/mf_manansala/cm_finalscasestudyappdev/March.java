package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class March extends Activity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.march);

        Button d1 = findViewById(R.id.march1btn);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 1);
                startActivity(intent);
            }
        });

        Button d2 = findViewById(R.id.march2btn);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 2);
                startActivity(intent);
            }
        });

        Button d3 = findViewById(R.id.march3btn);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 3);
                startActivity(intent);
            }
        });

        Button d4 = findViewById(R.id.march4btn);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 4);
                startActivity(intent);
            }
        });

        Button d5 = findViewById(R.id.march5btn);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 5);
                startActivity(intent);
            }
        });

        Button d6 = findViewById(R.id.march6btn);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 6);
                startActivity(intent);
            }
        });

        Button d7 = findViewById(R.id.march7btn);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 7);
                startActivity(intent);
            }
        });

        Button d8 = findViewById(R.id.march8btn);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 8);
                startActivity(intent);
            }
        });

        Button d9 = findViewById(R.id.march9btn);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 9);
                startActivity(intent);
            }
        });

        Button d10 = findViewById(R.id.march10btn);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 10);
                startActivity(intent);
            }
        });

        Button d11 = findViewById(R.id.march11btn);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 11);
                startActivity(intent);
            }
        });

        Button d12 = findViewById(R.id.march12btn);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 12);
                startActivity(intent);
            }
        });

        Button d13 = findViewById(R.id.march13btn);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 13);
                startActivity(intent);
            }
        });

        Button d14 = findViewById(R.id.march14btn);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 14);
                startActivity(intent);
            }
        });

        Button d15 = findViewById(R.id.march15btn);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 15);
                startActivity(intent);
            }
        });

        Button d16 = findViewById(R.id.march16btn);
        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 16);
                startActivity(intent);
            }
        });

        Button d17 = findViewById(R.id.march17btn);
        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 17);
                startActivity(intent);
            }
        });

        Button d18 = findViewById(R.id.march18btn);
        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 18);
                startActivity(intent);
            }
        });

        Button d19 = findViewById(R.id.march19btn);
        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 19);
                startActivity(intent);
            }
        });

        Button d20 = findViewById(R.id.march20btn);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 20);
                startActivity(intent);
            }
        });

        Button d21 = findViewById(R.id.march21btn);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 21);
                startActivity(intent);
            }
        });

        Button d22 = findViewById(R.id.march22btn);
        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 22);
                startActivity(intent);
            }
        });

        Button d23 = findViewById(R.id.march23btn);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 23);
                startActivity(intent);
            }
        });

        Button d24 = findViewById(R.id.march24btn);
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 24);
                startActivity(intent);
            }
        });

        Button d25 = findViewById(R.id.march25btn);
        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 25);
                startActivity(intent);
            }
        });

        Button d26 = findViewById(R.id.march26btn);
        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 26);
                startActivity(intent);
            }
        });

        Button d27 = findViewById(R.id.march27btn);
        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 27);
                startActivity(intent);
            }
        });

        Button d28 = findViewById(R.id.march28btn);
        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 28);
                startActivity(intent);
            }
        });

        Button d29 = findViewById(R.id.march29btn);
        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 29);
                startActivity(intent);
            }
        });

        Button d30 = findViewById(R.id.march30btn);
        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 30);
                startActivity(intent);
            }
        });

        Button d31 = findViewById(R.id.march31btn);
        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, SetOfButtonsMarch.class);
                intent.putExtra("PickedMonth", "March");
                intent.putExtra("PickedDay", 31);
                startActivity(intent);
            }
        });

        Button btnReturnToFebruary = findViewById(R.id.btnReturnToFebruary);
        btnReturnToFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, February.class);
                startActivity(intent);
            }
        });

        Button btnToAprilLayout = findViewById(R.id.btnToAprilLayout);
        btnToAprilLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(March.this, April.class);
                startActivity(intent);
            }
        });

    }
}