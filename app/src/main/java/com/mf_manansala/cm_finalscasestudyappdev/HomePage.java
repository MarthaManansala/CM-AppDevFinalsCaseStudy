package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class HomePage extends Activity {
    Intent intent;
    SQLiteDatabaseHelper dbHelper;
    TextView eTitle1, eDate1, eTime1, eTitle2, eDate2, eTime2, eTitle3, eDate3, eTime3;
    Button btnJumpJan, btnJumpFeb, btnJumpMar, btnJumpApr, btnJumpMay, btnJumpJune, btnJumpJuly, btnJumpAug, btnJumpSept, btnJumpOct, btnJumpNov, btnJumpDec;
    View upEvent2, upEvent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        upEvent2 = findViewById(R.id.upEvent2); upEvent3 = findViewById(R.id.upEvent3);
        eTitle1 = findViewById(R.id.eTitle1); eDate1 = findViewById(R.id.eDate1); eTime1 = findViewById(R.id.eTime1);
        eTitle2 = findViewById(R.id.eTitle2); eDate2 = findViewById(R.id.eDate2); eTime2 = findViewById(R.id.eTime2);
        eTitle3 = findViewById(R.id.eTitle3); eDate3 = findViewById(R.id.eDate3); eTime3 = findViewById(R.id.eTime3);

        dbHelper = new SQLiteDatabaseHelper(this);

        Button btnViewFullCalendar = findViewById(R.id.btnViewFullCalendar);
        btnViewFullCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, RecordsActivity.class);
                intent.putExtra("viewAll2026Records", true);
                startActivity(intent);
            }
        });

        btnJumpJan = findViewById(R.id.btnJumpJan);
        btnJumpJan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnJumpFeb = findViewById(R.id.btnJumpFeb);
        btnJumpFeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, February.class);
                startActivity(intent);
            }
        });

        btnJumpMar = findViewById(R.id.btnJumpMar);
        btnJumpMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, March.class);
                startActivity(intent);
            }
        });

        btnJumpApr = findViewById(R.id.btnJumpApr);
        btnJumpApr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, April.class);
                startActivity(intent);
            }
        });

        btnJumpMay = findViewById(R.id.btnJumpMay);
        btnJumpMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, May.class);
                startActivity(intent);
            }
        });

        btnJumpJune = findViewById(R.id.btnJumpJune);
        btnJumpJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, June.class);
                startActivity(intent);
            }
        });

        btnJumpJuly = findViewById(R.id.btnJumpJuly);
        btnJumpJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, July.class);
                startActivity(intent);
            }
        });

        btnJumpAug = findViewById(R.id.btnJumpAug);
        btnJumpAug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, August.class);
                startActivity(intent);
            }
        });

        btnJumpSept = findViewById(R.id.btnJumpSept);
        btnJumpSept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, September.class);
                startActivity(intent);
            }
        });

        btnJumpOct = findViewById(R.id.btnJumpOct);
        btnJumpOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, October.class);
                startActivity(intent);
            }
        });

        btnJumpNov = findViewById(R.id.btnJumpNov);
        btnJumpNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, November.class);
                startActivity(intent);
            }
        });

        btnJumpDec = findViewById(R.id.btnJumpDec);
        btnJumpDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomePage.this, December.class);
                startActivity(intent);
            }
        });

        View.OnClickListener monthListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class targetActivity = null;
                if (v.getId() == R.id.btnJumpJan) targetActivity = MainActivity.class;
                else if (v.getId() == R.id.btnJumpFeb) targetActivity = February.class;
                else if (v.getId() == R.id.btnJumpMar) targetActivity = March.class;
                else if (v.getId() == R.id.btnJumpApr) targetActivity = April.class;
                else if (v.getId() == R.id.btnJumpMay) targetActivity = May.class;
                else if (v.getId() == R.id.btnJumpJune) targetActivity = June.class;
                else if (v.getId() == R.id.btnJumpJuly) targetActivity = July.class;
                else if (v.getId() == R.id.btnJumpAug) targetActivity = August.class;
                else if (v.getId() == R.id.btnJumpSept) targetActivity = September.class;
                else if (v.getId() == R.id.btnJumpOct) targetActivity = October.class;
                else if (v.getId() == R.id.btnJumpNov) targetActivity = November.class;
                else if (v.getId() == R.id.btnJumpDec) targetActivity = December.class;

                if (targetActivity != null) {
                startActivity(new Intent(HomePage.this, targetActivity));
                }
            }
        };

        btnJumpJan.setOnClickListener(monthListener);
        btnJumpFeb.setOnClickListener(monthListener);
        btnJumpMar.setOnClickListener(monthListener);
        btnJumpApr.setOnClickListener(monthListener);
        btnJumpMay.setOnClickListener(monthListener);
        btnJumpJune.setOnClickListener(monthListener);
        btnJumpJuly.setOnClickListener(monthListener);
        btnJumpAug.setOnClickListener(monthListener);
        btnJumpSept.setOnClickListener(monthListener);
        btnJumpOct.setOnClickListener(monthListener);
        btnJumpNov.setOnClickListener(monthListener);
        btnJumpDec.setOnClickListener(monthListener);
    }

    @Override
    protected void onResume(){
        super.onResume();
        refreshUpcomingEvents();
    }

    private void refreshUpcomingEvents() {
        Calendar calendar = Calendar.getInstance();
        int  currentYear = calendar.get(Calendar.YEAR);
        TextView welcomeText = findViewById(R.id.welcomeText);
        welcomeText.setText("Welcome to " + currentYear);
        String currentMonth = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        Cursor rs = dbHelper.getUpcomingEvents(currentYear, currentMonth, currentDay);

        if (rs != null && rs.moveToFirst()) {
            eTitle1.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
            eDate1.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", " + currentYear + " • ");
            eTime1.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));

            if (rs.moveToNext()) {
                upEvent2.setVisibility(View.VISIBLE);
                eTitle2.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
                eDate2.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", " + currentYear + " • ");
                eTime2.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));
            } else {
                upEvent2.setVisibility(View.GONE);
            }

            if (rs.moveToNext()) {
                upEvent3.setVisibility(View.VISIBLE);
                eTitle3.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TITLE)));
                eDate3.setText(currentMonth + " " + rs.getInt(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_DAY)) + ", " + currentYear + " • ");
                eTime3.setText(rs.getString(rs.getColumnIndexOrThrow(SQLiteDatabaseHelper.EVENT_TIME)));
            } else {
                upEvent3.setVisibility(View.GONE);
            }
            rs.close();
        } else {
            eTitle1.setText("No Upcoming Events!");
            eDate1.setText("");
            eTime1.setText("");
            upEvent2.setVisibility(View.GONE);
            upEvent3.setVisibility(View.GONE);
        }
    }
}
