package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
        Button addEventSubmit = findViewById(R.id.addEventSubmit);

        isEditEvent = getIntent().getBooleanExtra("editEvent", false);
        existingEventID = getIntent().getStringExtra("eventID");
        if(isEditEvent) {
            addEventSubmit.setText("UPDATE EVENT");
            android.database.Cursor rs = dbHelper.getRecordByID(existingEventID);

            if(rs != null && rs.moveToFirst()) {
                String eTitle = rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE));
                String eTime = rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME));
                String eLocation = rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_LOCATION));
                String eNotes = rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_NOTES));

                String defaultSLoc = eLocation.replace("Location: ", "");
                String defaultSNotes = eNotes.replace("Notes: ", "");

                addEventTitle.setText(eTitle);
                addEventTime.setText(eTime);
                addEventLocation.setText(defaultSLoc);
                addEventNotes.setText(defaultSNotes);
                rs.close();
            }
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
                String fixedSLoc = addEventLocation.getText().toString().trim();
                String fixedSNotes = addEventNotes.getText().toString().trim();
                String getEventLocation = fixedSLoc.isEmpty() ? "" : "Location: " + fixedSLoc;
                String getEventNotes = fixedSNotes.isEmpty() ? "" : "Notes: " + fixedSNotes;


                if (getEventTitle.isEmpty()) {
                    addEventTitle.setError("Please enter a title");
                    Toast.makeText(AddEvent.this, "Please enter a title", Toast.LENGTH_SHORT).show();
                } else if (!getEventTime.matches("^[0-9:PMAamp ]+$")) {
                    addEventTime.setError("Format must be 00:00 AM/PM");
                    Toast.makeText(AddEvent.this, "Format must be 00:00 AM/PM", Toast.LENGTH_SHORT).show();
                } else {
                    if(isEditEvent) {
                        boolean isUpdated = dbHelper.updateRecord(
                                existingEventID,
                                getEventTitle,
                                getEventTime,
                                getEventLocation,
                                getEventNotes
                        );

                        if(isUpdated){
                            Toast.makeText(AddEvent.this, "EVENT UPDATED!", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(AddEvent.this, "ERROR ON UPDATING EVENT", Toast.LENGTH_SHORT).show();
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

        Button addEventReturn = findViewById(R.id.addEventReturn);
        addEventReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

