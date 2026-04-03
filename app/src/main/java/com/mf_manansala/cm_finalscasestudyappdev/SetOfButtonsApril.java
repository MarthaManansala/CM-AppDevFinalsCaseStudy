package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsApril extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_april);

        TextView AprilSelectedDay = findViewById(R.id.AprilSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        AprilSelectedDay.setText(formattedDate);

        Button btnAddEventApril = findViewById(R.id.btnAddEventApril);
        btnAddEventApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsApril.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventApril = findViewById(R.id.btnViewEventApril);
        btnViewEventApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventApril = findViewById(R.id.btnEditEventApril);
        btnEditEventApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventApril = findViewById(R.id.btnDeleteEventApril);
        btnDeleteEventApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnApril = findViewById(R.id.btnReturnApril);
        btnReturnApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsApril.this, April.class);
                startActivity(intent);
            }
        });
    }
}
