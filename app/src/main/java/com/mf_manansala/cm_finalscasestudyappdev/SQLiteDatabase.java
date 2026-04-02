package com.mf_manansala.cm_finalscasestudyappdev;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class SQLiteDatabase extends SQLiteOpenHelper {
    static final String DATABASE_NAME="planIT.db"; //database name
    static final String EVENTS_TABLE="events_info"; //table name
    static final String EVENT_ID="event_id"; //column, primary key
    static final String EVENT_TITLE="event_title"; //column
    static final String EVENT_MONTH="event_month"; //column
    static final String EVENT_DAY="event_day"; //column
    static final String EVENT_LOCATION="event_location"; //column
    static final String EVENT_NOTES="event_notes"; //column
    ArrayList<String> ItemList;
    ContentValues VALUES;

    public SQLiteDatabase(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase conn) {
       String SQLEventRecords = "CREATE TABLE " + EVENTS_TABLE + " ("
               + EVENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
               + EVENT_TITLE + " TEXT , "
               + EVENT_MONTH + " TEXT , "
               + EVENT_DAY + " INTEGER , "
               + EVENT_LOCATION + " TEXT , "
               + EVENT_NOTES + " TEXT)";
       conn.execSQL(SQLEventRecords);
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase conn, int oldVersion, int newVersion) {
        conn.execSQL("DROP TABLE IF EXISTS " + EVENTS_TABLE);
        onCreate(conn);
    }

    public boolean AddRecord(String eventTitle, String eventMonth, int eventDay, String eventLoc, String eventNotes){
        android.database.sqlite.SQLiteDatabase conn = this.getWritableDatabase();
        VALUES = new ContentValues();
            VALUES.put(EVENT_TITLE, eventTitle);
            VALUES.put(EVENT_MONTH, eventMonth);
            VALUES.put(EVENT_DAY, eventDay);
            VALUES.put(EVENT_LOCATION, eventLoc);
            VALUES.put(EVENT_NOTES, eventNotes);

            long result = conn.insert(EVENTS_TABLE, null, VALUES);
            return result != -1;
    }
}
