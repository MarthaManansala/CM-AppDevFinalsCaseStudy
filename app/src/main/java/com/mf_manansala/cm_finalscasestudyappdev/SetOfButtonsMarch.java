package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsMarch extends Activity{
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_march);

        TextView MarchSelectedDay = findViewById(R.id.MarchSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        MarchSelectedDay.setText(formattedDate);

        Button btnAddEventMarch = findViewById(R.id.btnAddEventMarch);
        btnAddEventMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsMarch.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventMarch = findViewById(R.id.btnViewEventMarch);
        btnViewEventMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventMarch = findViewById(R.id.btnEditEventMarch);
        btnEditEventMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventMarch = findViewById(R.id.btnDeleteEventMarch);
        btnDeleteEventMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnMarch = findViewById(R.id.btnReturnMarch);
        btnReturnMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsMarch.this, March.class);
                startActivity(intent);
            }
        });
    }
}
