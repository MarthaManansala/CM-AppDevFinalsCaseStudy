package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsMay extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_may);

        TextView MaySelectedDay = findViewById(R.id.MaySelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        MaySelectedDay.setText(formattedDate);

        Button btnAddEventMay = findViewById(R.id.btnAddEventMay);
        btnAddEventMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        Button btnViewEventMay = findViewById(R.id.btnViewEventMay);
        btnViewEventMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventMay = findViewById(R.id.btnEditEventMay);
        btnEditEventMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventMay = findViewById(R.id.btnDeleteEventMay);
        btnDeleteEventMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnMay = findViewById(R.id.btnReturnMay);
        btnReturnMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsMay.this, May.class);
                startActivity(intent);
            }
        });
    }
}
