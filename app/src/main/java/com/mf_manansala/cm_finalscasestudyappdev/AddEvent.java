package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddEvent extends Activity {
    SQLiteDatabaseHelper dbHelper;
    TextView addEventPickedDay;
    Boolean isEditEvent = false;
    String existingEventID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_event);

        dbHelper = new SQLiteDatabaseHelper(this);
        EditText addEventTitle = findViewById(R.id.addEventTitle);
        EditText addEventTime = findViewById(R.id.addEventTime);
        EditText addEventLocation = findViewById(R.id.addEventLocation);
        EditText addEventNotes = findViewById(R.id.addEventNotes);
        Button addEventReturn = findViewById(R.id.addEventReturn);
        Button addEventSubmit = findViewById(R.id.addEventSubmit);

        isEditEvent = getIntent().getBooleanExtra("editEvent", false);
        existingEventID = getIntent().getStringExtra("eventID");

        if (isEditEvent) {
            addEventSubmit.setText("EDIT EVENT");
        }

        addEventPickedDay = findViewById(R.id.addEventPickedDay);
        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);
        String formattedDate = getString(R.string.date_display_format, month, day);
        addEventPickedDay.setText(formattedDate);

        addEventSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEventTitle = addEventTitle.getText().toString().trim();
                String getEventTime = addEventTime.getText().toString().trim();
                String getEventLocation = addEventLocation.getText().toString().trim();
                String getEventNotes = addEventNotes.getText().toString().trim();

                if (getEventTitle.isEmpty()){
                    addEventTitle.setError("Please enter a title");
                    Toast.makeText(AddEvent.this, "Please enter a title", Toast.LENGTH_SHORT).show();
                } else if (!getEventTime.matches("^[0-9:PMAMampm ]+$")) {
                    addEventTime.setError("Format must be 00:00 AM/PM");
                    Toast.makeText(AddEvent.this, "Format must be 00:00 AM/PM", Toast.LENGTH_SHORT).show();
                } else {
                    if (isEditEvent) {    /*TO BE FIXED*/
                        boolean isUpdatedEvent = dbHelper.editEvent(
                                existingEventID,
                                getEventTitle,
                                month,
                                day,
                                getEventTime,
                                getEventLocation,
                                getEventNotes
                        );

                        if (isUpdatedEvent) {
                            Toast.makeText(AddEvent.this, "EVENT UPDATED SUCCESSFULLY!", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(AddEvent.this, "ERROR ON SAVING EVENT...", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        boolean isAdded = dbHelper.AddRecord(
                                getEventTitle,
                                month,
                                day,
                                getEventTime,
                                getEventLocation,
                                getEventNotes
                        );

                        if (isAdded) {
                            Toast.makeText(AddEvent.this, "EVENT ADDED SUCCESSFULLY!", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(AddEvent.this, "ERROR ON SAVING EVENT...", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        addEventReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
