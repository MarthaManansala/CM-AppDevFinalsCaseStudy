package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsOctober extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_october);

        TextView OctoberSelectedDay = findViewById(R.id.OctoberSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        OctoberSelectedDay.setText(formattedDate);

        Button btnAddEventOctober = findViewById(R.id.btnAddEventOctober);
        btnAddEventOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        Button btnViewEventOctober = findViewById(R.id.btnViewEventOctober);
        btnViewEventOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventOctober = findViewById(R.id.btnEditEventOctober);
        btnEditEventOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventOctober = findViewById(R.id.btnDeleteEventOctober);
        btnDeleteEventOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnOctober = findViewById(R.id.btnReturnOctober);
        btnReturnOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsOctober.this, October.class);
                startActivity(intent);
            }
        });
    }
}
