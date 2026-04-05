package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddEvent extends Activity {
    TextView addEventPickedDay;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_event);

        addEventPickedDay = findViewById(R.id.addEventPickedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        addEventPickedDay.setText(formattedDate);

        Button addEventReturn = findViewById(R.id.addEventReturn);
        addEventReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button addEventSubmit = findViewById(R.id.addEventSubmit);
        addEventSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Submits record */
            }
        });
    }
}
