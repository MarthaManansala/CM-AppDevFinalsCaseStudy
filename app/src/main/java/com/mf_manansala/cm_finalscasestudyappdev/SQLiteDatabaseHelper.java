package com.mf_manansala.cm_finalscasestudyappdev;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class SQLiteDatabaseHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME="planIT.db"; //database name
    static final String EVENTS_TABLE="events_info"; //table name
    static final String EVENT_ID="event_id"; //column, primary key
    static final String EVENT_TITLE="event_title"; //column
    static final String EVENT_MONTH="event_month"; //column
    static final String EVENT_DAY="event_day"; //column
    static final String EVENT_TIME="event_time"; //column
    static final String EVENT_LOCATION="event_location"; //column
    static final String EVENT_NOTES="event_notes"; //column
    ArrayList<String> ItemList;
    ContentValues VALUES;
    Cursor rs;

    public SQLiteDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase conn) {
       String SQLEventRecords = "CREATE TABLE " + EVENTS_TABLE + " ("
               + EVENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
               + EVENT_TITLE + " TEXT , "
               + EVENT_MONTH + " TEXT , "
               + EVENT_DAY + " INTEGER , "
               + EVENT_TIME + " TEXT , "
               + EVENT_LOCATION + " TEXT , "
               + EVENT_NOTES + " TEXT)";
       conn.execSQL(SQLEventRecords);

        insertHoliday(conn, "New Year's Day", "January", 1);
        insertHoliday(conn, "Chinese New Year", "February", 17);
        insertHoliday(conn, "EDSA People Power Revolution", "February", 25);
        insertHoliday(conn, "Eid'l Fitr", "March", 20);
        insertHoliday(conn, "Maundy Thursday", "April", 2);
        insertHoliday(conn, "Good Friday", "April", 3);
        insertHoliday(conn, "Black Saturday", "April", 4);
        insertHoliday(conn, "Araw ng Kagitingan (Day of Valor)", "April", 9);
        insertHoliday(conn, "Labor Day", "May", 1);
        insertHoliday(conn, "Independence Day", "June", 12);
        insertHoliday(conn, "Ninoy Aquino Day", "August", 21);
        insertHoliday(conn, "National Heroes Day", "August", 31);
        insertHoliday(conn, "All Saints' Day", "November", 1);
        insertHoliday(conn, "All Souls' Day", "November", 2);
        insertHoliday(conn, "Bonifacio Day", "November", 30);
        insertHoliday(conn, "Feast of the Immaculate Conception", "December", 8);
        insertHoliday(conn, "Christmas Eve", "December", 24);
        insertHoliday(conn, "Christmas Day", "December", 25);
        insertHoliday(conn, "Rizal Day", "December", 30);
        insertHoliday(conn, "New Year's Eve", "December", 31);
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase conn, int oldVersion, int newVersion) {
        conn.execSQL("DROP TABLE IF EXISTS " + EVENTS_TABLE);
        onCreate(conn);
    }

    public boolean AddRecord(String eventTitle, String eventMonth, int eventDay, String eventTime, String eventLoc, String eventNotes){
        android.database.sqlite.SQLiteDatabase conn = this.getWritableDatabase();
        long result;

        try {
            conn.beginTransaction();
            VALUES = new ContentValues();
            VALUES.put(EVENT_TITLE, eventTitle);
            VALUES.put(EVENT_MONTH, eventMonth);
            VALUES.put(EVENT_DAY, eventDay);
            VALUES.put(EVENT_TIME, eventTime);
            VALUES.put(EVENT_LOCATION, eventLoc);
            VALUES.put(EVENT_NOTES, eventNotes);

            result = conn.insert(EVENTS_TABLE, null, VALUES);
            if (result != -1) {
                conn.setTransactionSuccessful();
                return true;
            }
        } finally {
            conn.endTransaction();
            close();
        }
        return result != -1;
    }

    public ArrayList<String> getAllRecords(String month, int day){
        android.database.sqlite.SQLiteDatabase conn = this.getReadableDatabase();
        ItemList = new ArrayList<>();
        String SQL = "SELECT * FROM " + EVENTS_TABLE + " WHERE " + EVENT_MONTH + "=? AND " + EVENT_DAY + "=?";

        rs = conn.rawQuery(SQL, new String[]{month, String.valueOf(day)});
        if(rs.moveToFirst()){
          do {
              String eID = rs.getString(rs.getColumnIndexOrThrow(EVENT_ID));
              String eTitle = rs.getString(rs.getColumnIndexOrThrow(EVENT_TITLE));
              String eMonth = rs.getString(rs.getColumnIndexOrThrow(EVENT_MONTH));
              int eDay = rs.getInt(rs.getColumnIndexOrThrow(EVENT_DAY));
              String eTime = rs.getString(rs.getColumnIndexOrThrow(EVENT_TIME));
              String eLoc = rs.getString(rs.getColumnIndexOrThrow(EVENT_LOCATION));
              String eNotes = rs.getString(rs.getColumnIndexOrThrow(EVENT_NOTES));

              StringBuilder entry = new StringBuilder();
              entry.append(eID).append(". ").append(eTitle).append("\n");
              entry.append(eMonth).append(" ").append(eDay).append(" | ").append(eTime);

              if(!eLoc.trim().isEmpty()) {
                  entry.append("\n").append(eLoc);
              }

              if(!eNotes.trim().isEmpty()) {
                  entry.append("\n").append(eNotes);
              }

              ItemList.add(entry.toString());
          } while (rs.moveToNext());
        }
        rs.close();
        conn.close();
        return ItemList;
    }

    public boolean updateRecord(String eventID, String eventTitle, String eventTime, String eventLocation, String eventNotes){
        android.database.sqlite.SQLiteDatabase conn = getWritableDatabase();
        VALUES = new ContentValues();
        VALUES.put(EVENT_TITLE, eventTitle);
        VALUES.put(EVENT_TIME, eventTime);
        VALUES.put(EVENT_LOCATION, eventLocation);
        VALUES.put(EVENT_NOTES, eventNotes);

        int result = conn.update(EVENTS_TABLE, VALUES, EVENT_ID + "=?", new String[]{eventID});
        return result > 0;
    }

    public Cursor getRecordByID(String eventID){
        android.database.sqlite.SQLiteDatabase conn = this.getReadableDatabase();
        return conn.rawQuery("SELECT * FROM " + EVENTS_TABLE + " WHERE " + EVENT_ID + "=?", new String[]{eventID});
    }

    public boolean deleteRecord(String eventID){
        android.database.sqlite.SQLiteDatabase conn = this.getWritableDatabase();

        int result = conn.delete(EVENTS_TABLE, EVENT_ID + "=?", new String[]{eventID});
        conn.close();
        return result > 0;
    }

    public ArrayList<String> getAll2026Records(){
        android.database.sqlite.SQLiteDatabase conn = this.getReadableDatabase();
        ItemList = new ArrayList<>();

        String SQL = "SELECT * FROM " + EVENTS_TABLE + " ORDER BY " + EVENT_ID + " ASC";

        rs = conn.rawQuery(SQL, null);
        if(rs.moveToFirst()){
            do {
                String eID = rs.getString(rs.getColumnIndexOrThrow(EVENT_ID));
                  String eTitle = rs.getString(rs.getColumnIndexOrThrow(EVENT_TITLE));
                  String eMonth = rs.getString(rs.getColumnIndexOrThrow(EVENT_MONTH));
                  int eDay = rs.getInt(rs.getColumnIndexOrThrow(EVENT_DAY));
                  String eTime = rs.getString(rs.getColumnIndexOrThrow(EVENT_TIME));
                  String eLoc = rs.getString(rs.getColumnIndexOrThrow(EVENT_LOCATION));
                  String eNotes = rs.getString(rs.getColumnIndexOrThrow(EVENT_NOTES));

                  StringBuilder entry = new StringBuilder();
                  entry.append(eID).append(". ").append(eTitle).append("\n");
                  entry.append(eMonth).append(" ").append(eDay).append(" | ").append(eTime);

                  if(!eLoc.trim().isEmpty()) {
                      entry.append("\n").append(eLoc);
                  }
                  if(!eNotes.trim().isEmpty()) {
                      entry.append("\n").append(eNotes);
                  } ItemList.add(entry.toString());
            } while (rs.moveToNext());
        }
        rs.close();
        conn.close();
        return ItemList;
    }

    public Cursor getUpcomingEvents(String currentMonth, int currentDay) {
        android.database.sqlite.SQLiteDatabase conn = this.getReadableDatabase();

        String SQL = "SELECT * FROM " + EVENTS_TABLE + " WHERE " + EVENT_MONTH + " =? AND " + EVENT_DAY + " >= ?"
                + " ORDER BY " + EVENT_DAY + " ASC LIMIT 3";

        return conn.rawQuery(SQL, new String[]{currentMonth, String.valueOf(currentDay)});
    }

    private void insertHoliday(android.database.sqlite.SQLiteDatabase db, String title, String month, int day){
        VALUES = new ContentValues();
        VALUES.put(EVENT_TITLE, "Holiday: " + title);
        VALUES.put(EVENT_MONTH, month);
        VALUES.put(EVENT_DAY, day);
        VALUES.put(EVENT_TIME, "Whole Day");
        VALUES.put(EVENT_LOCATION, "Philippines");
        db.insert(EVENTS_TABLE, null, VALUES);
    }
}
