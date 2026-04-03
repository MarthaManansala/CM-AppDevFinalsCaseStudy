package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsJuly extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_july);

        TextView JulySelectedDay = findViewById(R.id.JulySelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        JulySelectedDay.setText(formattedDate);

        Button btnAddEventJuly = findViewById(R.id.btnAddEventJuly);
        btnAddEventJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsJuly.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventJuly = findViewById(R.id.btnViewEventJuly);
        btnViewEventJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventJuly = findViewById(R.id.btnEditEventJuly);
        btnEditEventJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventJuly = findViewById(R.id.btnDeleteEventJuly);
        btnDeleteEventJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnJuly = findViewById(R.id.btnReturnJuly);
        btnReturnJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsJuly.this, July.class);
                startActivity(intent);
            }
        });
    }
}
