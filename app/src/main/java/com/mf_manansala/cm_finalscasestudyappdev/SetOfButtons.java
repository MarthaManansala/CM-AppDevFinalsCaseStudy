package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetOfButtons extends Activity {
    Button btnAddEvent, btnViewEvent, btnEditEvent, btnDeleteEvent, btnReturn;
    TextView txtSelectedMonthAndDay;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_of_buttons);

        txtSelectedMonthAndDay = findViewById(R.id.txtSelectedMonthAndDay);
        int year = getIntent().getIntExtra("PickedYear", 0);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);

        String formattedDate = month + " " + day + ", " + year;
        txtSelectedMonthAndDay.setText(formattedDate);

        btnAddEvent = findViewById(R.id.btnAddEvent);
        btnAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtons.this, AddEvent.class);
                intent.putExtra("PickedYear", year);
                intent.putExtra("PickedMonth", month);
                intent.putExtra("PickedDay", day);
                startActivity(intent);
            }
        });

        btnViewEvent = findViewById(R.id.btnViewEvent);
        btnViewEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtons.this, RecordsActivity.class);
                intent.putExtra("PickedYear", year);
                intent.putExtra("PickedMonth", month);
                intent.putExtra("PickedDay", day);
                startActivity(intent);
            }
        });

        btnEditEvent = findViewById(R.id.btnEditEvent);
        btnEditEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtons.this, RecordsActivity.class);
                intent.putExtra("PickedYear", year);
                intent.putExtra("PickedMonth", month);
                intent.putExtra("PickedDay", day);
                intent.putExtra("isEditMode", true);
                startActivity(intent);
            }
        });

        btnDeleteEvent = findViewById(R.id.btnDeleteEvent);
        btnDeleteEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SetOfButtons.this, RecordsActivity.class);
                intent.putExtra("PickedYear", year);
                intent.putExtra("PickedMonth", month);
                intent.putExtra("PickedDay", day);
                intent.putExtra("isDeleteMode", true);
                startActivity(intent);
            }
        });

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}