package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;

public class May extends Activity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.may);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Button d1 = findViewById(R.id.may1btn);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 1);
                startActivity(intent);
            }
        });

        Button d2 = findViewById(R.id.may2btn);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 2);
                startActivity(intent);
            }
        });

        Button d3 = findViewById(R.id.may3btn);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 3);
                startActivity(intent);
            }
        });

        Button d4 = findViewById(R.id.may4btn);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 4);
                startActivity(intent);
            }
        });

        Button d5 = findViewById(R.id.may5btn);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 5);
                startActivity(intent);
            }
        });

        Button d6 = findViewById(R.id.may6btn);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 6);
                startActivity(intent);
            }
        });

        Button d7 = findViewById(R.id.may7btn);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 7);
                startActivity(intent);
            }
        });

        Button d8 = findViewById(R.id.may8btn);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 8);
                startActivity(intent);
            }
        });

        Button d9 = findViewById(R.id.may9btn);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 9);
                startActivity(intent);
            }
        });

        Button d10 = findViewById(R.id.may10btn);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 10);
                startActivity(intent);
            }
        });

        Button d11 = findViewById(R.id.may11btn);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 11);
                startActivity(intent);
            }
        });

        Button d12 = findViewById(R.id.may12btn);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 12);
                startActivity(intent);
            }
        });

        Button d13 = findViewById(R.id.may13btn);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 13);
                startActivity(intent);
            }
        });

        Button d14 = findViewById(R.id.may14btn);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 14);
                startActivity(intent);
            }
        });

        Button d15 = findViewById(R.id.may15btn);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 15);
                startActivity(intent);
            }
        });

        Button d16 = findViewById(R.id.may16btn);
        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 16);
                startActivity(intent);
            }
        });

        Button d17 = findViewById(R.id.may17btn);
        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 17);
                startActivity(intent);
            }
        });

        Button d18 = findViewById(R.id.may18btn);
        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 18);
                startActivity(intent);
            }
        });

        Button d19 = findViewById(R.id.may19btn);
        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 19);
                startActivity(intent);
            }
        });

        Button d20 = findViewById(R.id.may20btn);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 20);
                startActivity(intent);
            }
        });

        Button d21 = findViewById(R.id.may21btn);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 21);
                startActivity(intent);
            }
        });

        Button d22 = findViewById(R.id.may22btn);
        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 22);
                startActivity(intent);
            }
        });

        Button d23 = findViewById(R.id.may23btn);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 23);
                startActivity(intent);
            }
        });

        Button d24 = findViewById(R.id.may24btn);
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 24);
                startActivity(intent);
            }
        });

        Button d25 = findViewById(R.id.may25btn);
        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 25);
                startActivity(intent);
            }
        });

        Button d26 = findViewById(R.id.may26btn);
        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 26);
                startActivity(intent);
            }
        });

        Button d27 = findViewById(R.id.may27btn);
        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 27);
                startActivity(intent);
            }
        });

        Button d28 = findViewById(R.id.may28btn);
        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 28);
                startActivity(intent);
            }
        });

        Button d29 = findViewById(R.id.may29btn);
        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 29);
                startActivity(intent);
            }
        });

        Button d30 = findViewById(R.id.may30btn);
        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 30);
                startActivity(intent);
            }
        });

        Button d31 = findViewById(R.id.may31btn);
        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "May");
                intent.putExtra("PickedDay", 31);
                startActivity(intent);
            }
        });

        Button btnReturnToApril = findViewById(R.id.btnReturnToApril);
        btnReturnToApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, April.class);
                startActivity(intent);
            }
        });

        Button btnToJuneLayout = findViewById(R.id.btnToJuneLayout);
        btnToJuneLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(May.this, June.class);
                startActivity(intent);
            }
        });
    }
}