package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class RecordsActivity extends ListActivity {
    SQLiteDatabaseHelper dbHelper;
    android.database.sqlite.SQLiteDatabase Conn;
    ArrayList<String> ItemList;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String month = getIntent().getStringExtra("PickedMonth");
        int day = getIntent().getIntExtra("PickedDay", 0);

        dbHelper = new SQLiteDatabaseHelper(this);
        Conn = dbHelper.getWritableDatabase();
        ItemList = dbHelper.getAll2026Records();
        ItemList = dbHelper.getAllRecords(month, day);

        if (ItemList != null && !ItemList.isEmpty()) {
            RecordAdapter adapter = new RecordAdapter(this, ItemList);
            setListAdapter(adapter);
        } else {
            Toast.makeText(this, "No Records Found!", Toast.LENGTH_SHORT).show();
            finish();
        }
    }


    /*TO BE FIXED (EDIT AND DELETE EVENT)*/
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String fullText = ItemList.get(position);
        String eventID = fullText.split(" \\|")[0];

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(eventID);
        builder.setItems(new CharSequence[]{"Edit Event", "Delete Event"}, (dialog, which) -> {
            if(which == 0) {
                intent = new Intent(this, AddEvent.class);
                intent.putExtra("editEvent", true);
                intent.putExtra("eventID", eventID);
                startActivity(intent);
            } else {
                if(dbHelper.deleteEvent(eventID)){
                    Toast.makeText(this, "EVENT DELETED!", Toast.LENGTH_SHORT).show();
                    recreate();
                }
            }
        });
        builder.show();
    }
}
