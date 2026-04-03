package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtonsDecember extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons_december);

        TextView DecemberSelectedDay = findViewById(R.id.DecemberSelectedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        DecemberSelectedDay.setText(formattedDate);

        Button btnAddEventDecember = findViewById(R.id.btnAddEventDecember);
        btnAddEventDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsDecember.this, AddEvent.class);
                startActivity(intent);
            }
        });

        Button btnViewEventDecember = findViewById(R.id.btnViewEventDecember);
        btnViewEventDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* View Events Function */
            }
        });

        Button btnEditEventDecember = findViewById(R.id.btnEditEventDecember);
        btnEditEventDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Edit Events Function */
            }
        });

        Button btnDeleteEventDecember = findViewById(R.id.btnDeleteEventDecember);
        btnDeleteEventDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Delete Events Function */
            }
        });

        Button btnReturnDecember = findViewById(R.id.btnReturnDecember);
        btnReturnDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtonsDecember.this, December.class);
                startActivity(intent);
            }
        });
    }
}
