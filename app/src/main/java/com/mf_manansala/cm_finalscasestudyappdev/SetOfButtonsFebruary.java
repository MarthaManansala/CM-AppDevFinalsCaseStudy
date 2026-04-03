package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsFebruary extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_february);

        TextView FebruarySelectedDay = findViewById(R.id.FebruarySelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        FebruarySelectedDay.setText(formattedDate);

        Button btnAddEventFebruary = findViewById(R.id.btnAddEventFebruary);
        btnAddEventFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        Button btnViewEventFebruary = findViewById(R.id.btnViewEventFebruary);
        btnViewEventFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventFebruary = findViewById(R.id.btnEditEventFebruary);
        btnEditEventFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventFebruary = findViewById(R.id.btnDeleteEventFebruary);
        btnDeleteEventFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnFebruary = findViewById(R.id.btnReturnFebruary);
        btnReturnFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsFebruary.this, February.class);
                startActivity(intent);
            }
        });
    }
}