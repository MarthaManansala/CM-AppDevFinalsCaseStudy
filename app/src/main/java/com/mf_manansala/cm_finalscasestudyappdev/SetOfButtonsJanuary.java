package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsJanuary extends Activity {

    Button btnAddEvenJanuary, btnViewEventJanuary, btnEditEventJanuary, btnDeleteEventJanuary, btnReturn;
    TextView JanuarySelectedDay;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_january);

        JanuarySelectedDay = findViewById(R.id.JanuarySelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        JanuarySelectedDay.setText(formattedDate);

        btnAddEvenJanuary = findViewById(R.id.btnAddEventJanuary);
        btnAddEvenJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Add Event Function */
            }
        });

        btnViewEventJanuary = findViewById(R.id.btnViewEventJanuary);
        btnViewEventJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        btnEditEventJanuary = findViewById(R.id.btnEditEventJanuary);
        btnEditEventJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        btnDeleteEventJanuary = findViewById(R.id.btnDeleteEventJanuary);
        btnDeleteEventJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        btnReturn = findViewById(R.id.btnReturnJanuary);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsJanuary.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}