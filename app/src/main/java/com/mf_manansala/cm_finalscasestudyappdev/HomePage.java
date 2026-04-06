package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;

public class HomePage extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        View upEvent2 = findViewById(R.id.upEvent2); View upEvent3 = findViewById(R.id.upEvent3);
        TextView eTitle1 = findViewById(R.id.eTitle1); TextView eDate1 = findViewById(R.id.eDate1); TextView eTime1 = findViewById(R.id.eTime1);
        TextView eTitle2 = findViewById(R.id.eTitle2); TextView eDate2 = findViewById(R.id.eDate2); TextView eTime2 = findViewById(R.id.eTime2);
        TextView eTitle3 = findViewById(R.id.eTitle3); TextView eDate3 = findViewById(R.id.eDate3); TextView eTime3 = findViewById(R.id.eTime3);

        SQLiteDatabaseHelper dbHelper = new SQLiteDatabaseHelper(this);

        Calendar calendar = Calendar.getInstance();
        String currentMonth = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        Cursor rs = dbHelper.getUpcomingEvents(currentMonth, currentDay);
        if(rs != null && rs.moveToFirst()) {
            eTitle1.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
            eDate1.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", 2026 • ");
            eTime1.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));

            if(rs.moveToNext()) {
                upEvent2.setVisibility(View.VISIBLE);
                eTitle2.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
                eDate2.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", 2026 • ");
                eTime2.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));
            } else {upEvent2.setVisibility(View.GONE);}

            if(rs.moveToNext()) {
                upEvent3.setVisibility(View.VISIBLE);
                eTitle3.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
                eDate3.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", 2026 • ");
                eTime3.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));
            } else {upEvent3.setVisibility(View.GONE);}
            rs.close();
        } else {
            eTitle1.setText("No Upcoming Events!");
            eDate1.setText("");
            eTime2.setText("");
            upEvent2.setVisibility(View.GONE);
            upEvent3.setVisibility(View.GONE);
        }

        Button btnViewFullCalendar = findViewById(R.id.btnViewFullCalendar);
        btnViewFullCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, RecordsActivity.class);
                intent.putExtra("viewAll2026Records", true);
                startActivity(intent);
            }
        });

        Button btnJumpJan = findViewById(R.id.btnJumpJan);
        btnJumpJan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnJumpFeb = findViewById(R.id.btnJumpFeb);
        btnJumpFeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, February.class);
                startActivity(intent);
            }
        });

        Button btnJumpMar = findViewById(R.id.btnJumpMar);
        btnJumpMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, March.class);
                startActivity(intent);
            }
        });

        Button btnJumpApr = findViewById(R.id.btnJumpApr);
        btnJumpApr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, April.class);
                startActivity(intent);
            }
        });

        Button btnJumpMay = findViewById(R.id.btnJumpMay);
        btnJumpMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, May.class);
                startActivity(intent);
            }
        });

        Button btnJumpJune = findViewById(R.id.btnJumpJune);
        btnJumpJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, June.class);
                startActivity(intent);
            }
        });

        Button btnJumpJuly = findViewById(R.id.btnJumpJuly);
        btnJumpJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, July.class);
                startActivity(intent);
            }
        });

        Button btnJumpAug = findViewById(R.id.btnJumpAug);
        btnJumpAug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, August.class);
                startActivity(intent);
            }
        });

        Button btnJumpSept = findViewById(R.id.btnJumpSept);
        btnJumpSept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, September.class);
                startActivity(intent);
            }
        });

        Button btnJumpOct = findViewById(R.id.btnJumpOct);
        btnJumpOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, October.class);
                startActivity(intent);
            }
        });

        Button btnJumpNov = findViewById(R.id.btnJumpNov);
        btnJumpNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, November.class);
                startActivity(intent);
            }
        });

        Button btnJumpDec = findViewById(R.id.btnJumpDec);
        btnJumpDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, December.class);
                startActivity(intent);
            }
        });
    }
}
