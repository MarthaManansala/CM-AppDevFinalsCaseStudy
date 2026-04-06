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
    ArrayList<String> ItemList;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dbHelper = new SQLiteDatabaseHelper(this);
        boolean viewAll2026Records = getIntent().getBooleanExtra("viewAll2026Records", false);

        if(viewAll2026Records) {
            ItemList = dbHelper.getAll2026Records();
        } else {
            String pickedMonth = getIntent().getStringExtra("PickedMonth");
            int pickedDay = getIntent().getIntExtra("PickedDay", 0);
            ItemList = dbHelper.getAllRecords(pickedMonth, pickedDay);
        }

        if (ItemList != null && !ItemList.isEmpty()) {
            RecordAdapter adapter = new RecordAdapter(this, ItemList);
            setListAdapter(adapter);
        } else {
            Toast.makeText(this, "No Records Found!", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        boolean viewAll2026Records = getIntent().getBooleanExtra("viewAll2026Records", false);
        boolean isEditMode = getIntent().getBooleanExtra("isEditMode", false);
        boolean isDeleteMode = getIntent().getBooleanExtra("isDeleteMode", false);

        if(viewAll2026Records && !isEditMode && !isDeleteMode) {
            return;
        }

        String fullRecord = ItemList.get(position);
        if(fullRecord.contains(".")) {
            String eventID = fullRecord.split("\\.")[0];

            if(isEditMode) {
                intent = new Intent(RecordsActivity.this, AddEvent.class);
                intent.putExtra("eventID", eventID);
                intent.putExtra("editEvent", true);
                intent.putExtra("PickedMonth", getIntent().getStringExtra("PickedMonth"));
                intent.putExtra("PickedDay", getIntent().getIntExtra("PickedDay", 0));
                startActivity(intent);
                finish();
            } else if(isDeleteMode) {
                new AlertDialog.Builder(this)
                        .setTitle("Confirm Delete")
                        .setMessage("Are you sure you want to delete this event?")
                        .setPositiveButton("Yes", (dialog, which) -> {
                            if(dbHelper.deleteRecord(eventID)) {
                                Toast.makeText(this, "EVENT DELETED!", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        }
    }
}
