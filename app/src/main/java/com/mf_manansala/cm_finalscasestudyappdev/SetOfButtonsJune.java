package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsJune extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_june);

        TextView JuneSelectedDay = findViewById(R.id.JuneSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        JuneSelectedDay.setText(formattedDate);

        Button btnAddEventJune = findViewById(R.id.btnAddEventJune);
        btnAddEventJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        Button btnViewEventJune = findViewById(R.id.btnViewEventJune);
        btnViewEventJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventJune = findViewById(R.id.btnEditEventJune);
        btnEditEventJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventJune = findViewById(R.id.btnDeleteEventJune);
        btnDeleteEventJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnJune = findViewById(R.id.btnReturnJune);
        btnReturnJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsJune.this, June.class);
                startActivity(intent);
            }
        });
    }
}
