package com.mf_manansala.cm_finalscasestudyappdev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RecordAdapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<String> records;

    public RecordAdapter(Context context, ArrayList<String> records){
        super(context, 0, records);
        this.context = context;
        this.records = records;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.event_item, parent, false);
        }

        TextView txtRecord = convertView.findViewById(R.id.txtRecordData);
        txtRecord.setText(records.get(position));
        return convertView;
    }
}
