package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zackoji.fault_reportmockup.R;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class ListViewAdapter_Full_DDN_Fault_M3 extends BaseAdapter {

    Context mContext;
    String[] circuit_id;
    String[] region;
    String[] rcu;
    String[] location;
    String[] downtime;
    String[] uptime;
    String[] totaltime;
    String[] truetime;
    String[] cause;
    String[] notes;
    String[] groupcase;

    public ListViewAdapter_Full_DDN_Fault_M3(Context mContext, String[] circuit_id, String[] region, String[] rcu, String[] location, String[] downtime, String[] uptime, String[] totaltime, String[] truetime, String[] cause, String[] notes, String[] groupcase) {
        this.mContext = mContext;
        this.circuit_id = circuit_id;
        this.region = region;
        this.rcu = rcu;
        this.location = location;
        this.downtime = downtime;
        this.uptime = uptime;
        this.totaltime = totaltime;
        this.truetime = truetime;
        this.cause = cause;
        this.notes = notes;
        this.groupcase = groupcase;
    }

    @Override
    public int getCount() {
        return circuit_id.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView = mInflater.inflate(R.layout.listview_full_ddn_fault_m3, parent, false);

        TextView textView_no = (TextView)convertView.findViewById(R.id.full_ddn_fault_no_m3);
        textView_no.setText("Event No. " + (position+1));

        TextView textView_circuit_id = (TextView)convertView.findViewById(R.id.full_ddn_fault_cir_id_m3);
        textView_circuit_id.setText(circuit_id[position]);

        TextView textView_region = (TextView)convertView.findViewById(R.id.full_ddn_fault_region_m3);
        textView_region.setText(region[position]);

        TextView textView_rcu = (TextView)convertView.findViewById(R.id.full_ddn_fault_rcu_m3);
        textView_rcu.setText(rcu[position]);

        TextView textView_location = (TextView)convertView.findViewById(R.id.full_ddn_fault_location_m3);
        textView_location.setText(location[position]);

        TextView textView_down = (TextView)convertView.findViewById(R.id.full_ddn_fault_downtime_m3);
        textView_down.setText(downtime[position]);

        TextView textView_up = (TextView)convertView.findViewById(R.id.full_ddn_fault_uptime_m3);
        textView_up.setText(uptime[position]);

        TextView textView_totaltime = (TextView)convertView.findViewById(R.id.full_ddn_fault_totaltime_m3);
        textView_totaltime.setText(totaltime[position]);

        TextView textView_truetime = (TextView)convertView.findViewById(R.id.full_ddn_fault_truetime_m3);
        textView_truetime.setText(truetime[position]);

        TextView textView_cause = (TextView)convertView.findViewById(R.id.full_ddn_fault_cause_m3);
        textView_cause.setText(cause[position]);

        TextView textView_notes = (TextView)convertView.findViewById(R.id.full_ddn_fault_notes_m3);
        textView_notes.setText(notes[position]);

        TextView textView_groupcase = (TextView)convertView.findViewById(R.id.full_ddn_fault_groupcase_m3);
        textView_groupcase.setText(groupcase[position]);

        return convertView;
    }
}
