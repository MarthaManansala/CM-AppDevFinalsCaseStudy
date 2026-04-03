package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsNovember extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_november);

        TextView NovemberSelectedDay = findViewById(R.id.NovemberSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        NovemberSelectedDay.setText(formattedDate);

        Button btnAddEventNovember = findViewById(R.id.btnAddEventNovember);
        btnAddEventNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsNovember.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventNovember = findViewById(R.id.btnViewEventNovember);
        btnViewEventNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventNovember = findViewById(R.id.btnEditEventNovember);
        btnEditEventNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventNovember = findViewById(R.id.btnDeleteEventNovember);
        btnDeleteEventNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnNovember = findViewById(R.id.btnReturnNovember);
        btnReturnNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsNovember.this, November.class);
                startActivity(intent);
            }
        });
    }
}
