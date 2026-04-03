package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEvent extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_event);

        Button btnReturnToSetOfButtons = findViewById(R.id.btnReturnToSetOfButtons);
        btnReturnToSetOfButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Returns to SetOfButtons layout */
            }
        });

        Button btnSubmitAddEvent = findViewById(R.id.btnSubmitAddEvent);
        btnSubmitAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Submits record */
            }
        });
    }
}
