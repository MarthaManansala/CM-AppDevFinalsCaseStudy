package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31;
    Button btnToHome, btnToFebruaryLayout;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = findViewById(R.id.january1btn);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 1);
                startActivity(intent);
            }
        });

        d2 = findViewById(R.id.january2btn);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 2);
                startActivity(intent);
            }
        });

        d3 = findViewById(R.id.january3btn);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 3);
                startActivity(intent);
            }
        });

        d4 = findViewById(R.id.january4btn);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 4);
                startActivity(intent);
            }
        });

        d5 = findViewById(R.id.january5btn);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 5);
                startActivity(intent);
            }
        });

        d6 = findViewById(R.id.january6btn);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 6);
                startActivity(intent);
            }
        });

        d7 = findViewById(R.id.january7btn);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 7);
                startActivity(intent);
            }
        });

        d8 = findViewById(R.id.january8btn);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 8);
                startActivity(intent);
            }
        });

        d9 = findViewById(R.id.january9btn);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 9);
                startActivity(intent);
            }
        });

        d10 = findViewById(R.id.january10btn);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 10);
                startActivity(intent);
            }
        });

        d11 = findViewById(R.id.january11btn);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 11);
                startActivity(intent);
            }
        });

        d12 = findViewById(R.id.january12btn);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 12);
                startActivity(intent);
            }
        });

        d13 = findViewById(R.id.january13btn);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 13);
                startActivity(intent);
            }
        });

        d14 = findViewById(R.id.january14btn);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 14);
                startActivity(intent);
            }
        });

        d15 = findViewById(R.id.january15btn);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 15);
                startActivity(intent);
            }
        });

        d16 = findViewById(R.id.january16btn);
        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 16);
                startActivity(intent);
            }
        });

        d17 = findViewById(R.id.january17btn);
        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 17);
                startActivity(intent);
            }
        });

        d18 = findViewById(R.id.january18btn);
        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 18);
                startActivity(intent);
            }
        });

        d19 = findViewById(R.id.january19btn);
        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 19);
                startActivity(intent);
            }
        });

        d20 = findViewById(R.id.january20btn);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 20);
                startActivity(intent);
            }
        });

        d21 = findViewById(R.id.january21btn);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 21);
                startActivity(intent);
            }
        });

        d22 = findViewById(R.id.january22btn);
        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 22);
                startActivity(intent);
            }
        });

        d23 = findViewById(R.id.january23btn);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 23);
                startActivity(intent);
            }
        });

        d24 = findViewById(R.id.january24btn);
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 24);
                startActivity(intent);
            }
        });

        d25 = findViewById(R.id.january25btn);
        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 25);
                startActivity(intent);
            }
        });

        d26 = findViewById(R.id.january26btn);
        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 26);
                startActivity(intent);
            }
        });

        d27 = findViewById(R.id.january27btn);
        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 27);
                startActivity(intent);
            }
        });

        d28 = findViewById(R.id.january28btn);
        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 28);
                startActivity(intent);
            }
        });

        d29 = findViewById(R.id.january29btn);
        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 29);
                startActivity(intent);
            }
        });

        d30 = findViewById(R.id.january30btn);
        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 30);
                startActivity(intent);
            }
        });

        d31 = findViewById(R.id.january31btn);
        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SetOfButtonsJanuary.class);
                intent.putExtra("PickedMonth", "January");
                intent.putExtra("PickedDay", 31);
                startActivity(intent);
            }
        });

        btnToHome = findViewById(R.id.btnToHome);
        btnToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
            }
        });

        btnToFebruaryLayout = findViewById(R.id.btnToFebruaryLayout);
        btnToFebruaryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, February.class);
                startActivity(intent);
            }
        });
    }
}