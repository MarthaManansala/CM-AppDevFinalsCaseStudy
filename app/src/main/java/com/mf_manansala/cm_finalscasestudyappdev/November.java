package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;

public class November extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.november);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Button d1 = findViewById(R.id.nov1btn);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 1);
                startActivity(intent);
            }
        });

        Button d2 = findViewById(R.id.nov2btn);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 2);
                startActivity(intent);
            }
        });

        Button d3 = findViewById(R.id.nov3btn);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 3);
                startActivity(intent);
            }
        });

        Button d4 = findViewById(R.id.nov4btn);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 4);
                startActivity(intent);
            }
        });

        Button d5 = findViewById(R.id.nov5btn);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 5);
                startActivity(intent);
            }
        });

        Button d6 = findViewById(R.id.nov6btn);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 6);
                startActivity(intent);
            }
        });

        Button d7 = findViewById(R.id.nov7btn);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 7);
                startActivity(intent);
            }
        });

        Button d8 = findViewById(R.id.nov8btn);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 8);
                startActivity(intent);
            }
        });

        Button d9 = findViewById(R.id.nov9btn);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 9);
                startActivity(intent);
            }
        });

        Button d10 = findViewById(R.id.nov10btn);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 10);
                startActivity(intent);
            }
        });

        Button d11 = findViewById(R.id.nov11btn);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 11);
                startActivity(intent);
            }
        });

        Button d12 = findViewById(R.id.nov12btn);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 12);
                startActivity(intent);
            }
        });

        Button d13 = findViewById(R.id.nov13btn);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 13);
                startActivity(intent);
            }
        });

        Button d14 = findViewById(R.id.nov14btn);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 14);
                startActivity(intent);
            }
        });

        Button d15 = findViewById(R.id.nov15btn);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 15);
                startActivity(intent);
            }
        });

        Button d16 = findViewById(R.id.nov16btn);
        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 16);
                startActivity(intent);
            }
        });

        Button d17 = findViewById(R.id.nov17btn);
        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 17);
                startActivity(intent);
            }
        });

        Button d18 = findViewById(R.id.nov18btn);
        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 18);
                startActivity(intent);
            }
        });

        Button d19 = findViewById(R.id.nov19btn);
        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 19);
                startActivity(intent);
            }
        });

        Button d20 = findViewById(R.id.nov20btn);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 20);
                startActivity(intent);
            }
        });

        Button d21 = findViewById(R.id.nov21btn);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 21);
                startActivity(intent);
            }
        });

        Button d22 = findViewById(R.id.nov22btn);
        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 22);
                startActivity(intent);
            }
        });

        Button d23 = findViewById(R.id.nov23btn);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 23);
                startActivity(intent);
            }
        });

        Button d24 = findViewById(R.id.nov24btn);
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 24);
                startActivity(intent);
            }
        });

        Button d25 = findViewById(R.id.nov25btn);
        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 25);
                startActivity(intent);
            }
        });

        Button d26 = findViewById(R.id.nov26btn);
        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 26);
                startActivity(intent);
            }
        });

        Button d27 = findViewById(R.id.nov27btn);
        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 27);
                startActivity(intent);
            }
        });

        Button d28 = findViewById(R.id.nov28btn);
        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 28);
                startActivity(intent);
            }
        });

        Button d29 = findViewById(R.id.nov29btn);
        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 29);
                startActivity(intent);
            }
        });

        Button d30 = findViewById(R.id.nov30btn);
        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, SetOfButtons.class);
                intent.putExtra("PickedYear", currentYear);
                intent.putExtra("PickedMonth", "November");
                intent.putExtra("PickedDay", 30);
                startActivity(intent);
            }
        });

        Button btnReturnToOctober = findViewById(R.id.btnReturnToOctober);
        btnReturnToOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, October.class);
                startActivity(intent);
            }
        });

        Button btnToDecemberLayout = findViewById(R.id.btnToDecemberLayout);
        btnToDecemberLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(November.this, December.class);
                startActivity(intent);
            }
        });
    }
}