package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsSeptember extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_september);

        TextView SeptemberSelectedDay = findViewById(R.id.SeptemberSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        SeptemberSelectedDay.setText(formattedDate);

        Button btnAddEventSeptember = findViewById(R.id.btnAddEventSeptember);
        btnAddEventSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsSeptember.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventSeptember = findViewById(R.id.btnViewEventSeptember);
        btnViewEventSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventSeptember = findViewById(R.id.btnEditEventSeptember);
        btnEditEventSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventSeptember = findViewById(R.id.btnDeleteEventSeptember);
        btnDeleteEventSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnSeptember = findViewById(R.id.btnReturnSeptember);
        btnReturnSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsSeptember.this, September.class);
                startActivity(intent);
            }
        });
    }
}
