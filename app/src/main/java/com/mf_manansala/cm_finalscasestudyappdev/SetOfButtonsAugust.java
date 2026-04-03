package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsAugust extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_august);

        TextView AugustSelectedDay = findViewById(R.id.AugustSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        AugustSelectedDay.setText(formattedDate);

        Button btnAddEventAugust = findViewById(R.id.btnAddEventAugust);
        btnAddEventAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        Button btnViewEventAugust = findViewById(R.id.btnViewEventAugust);
        btnViewEventAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventAugust = findViewById(R.id.btnEditEventAugust);
        btnEditEventAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventAugust = findViewById(R.id.btnDeleteEventAugust);
        btnDeleteEventAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnAugust = findViewById(R.id.btnReturnAugust);
        btnReturnAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsAugust.this, August.class);
                startActivity(intent);
            }
        });
    }
}
