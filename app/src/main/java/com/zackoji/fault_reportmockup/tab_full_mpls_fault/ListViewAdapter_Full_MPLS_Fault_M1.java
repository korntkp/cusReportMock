package com.zackoji.fault_reportmockup.tab_full_mpls_fault;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
//import android.support.v7.widget.RecyclerView;

import com.zackoji.fault_reportmockup.R;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class ListViewAdapter_Full_MPLS_Fault_M1 extends BaseAdapter {

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
    

    public ListViewAdapter_Full_MPLS_Fault_M1(Context mContext, String[] circuit_id, String[] region, String[] rcu, String[] location, String[] downtime, String[] uptime, String[] totaltime, String[] truetime, String[] cause, String[] notes, String[] groupcase) {
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

    /**
     * Only Item(each ListView) appear on Screen Will do this Method.
     *
     * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView = mInflater.inflate(R.layout.listview_full_mpls_fault_m1, parent, false);

        TextView textView_no = (TextView)convertView.findViewById(R.id.full_mpls_fault_no_m1);
        textView_no.setText("Event No. " + (position+1));

        TextView textView_circuit_id = (TextView)convertView.findViewById(R.id.full_mpls_fault_cir_id_m1);
        textView_circuit_id.setText(circuit_id[position]);

        TextView textView_region = (TextView)convertView.findViewById(R.id.full_mpls_fault_region_m1);
        textView_region.setText(region[position]);

        TextView textView_rcu = (TextView)convertView.findViewById(R.id.full_mpls_fault_rcu_m1);
        textView_rcu.setText(rcu[position]);

        TextView textView_location = (TextView)convertView.findViewById(R.id.full_mpls_fault_location_m1);
        textView_location.setText(location[position]);

        TextView textView_down = (TextView)convertView.findViewById(R.id.full_mpls_fault_downtime_m1);
        textView_down.setText(downtime[position]);

        TextView textView_up = (TextView)convertView.findViewById(R.id.full_mpls_fault_uptime_m1);
        textView_up.setText(uptime[position]);

        TextView textView_totaltime = (TextView)convertView.findViewById(R.id.full_mpls_fault_totaltime_m1);
        textView_totaltime.setText(totaltime[position]);

        TextView textView_truetime = (TextView)convertView.findViewById(R.id.full_mpls_fault_truetime_m1);
        textView_truetime.setText(truetime[position]);

        TextView textView_cause = (TextView)convertView.findViewById(R.id.full_mpls_fault_cause_m1);
        textView_cause.setText(cause[position]);

        TextView textView_notes = (TextView)convertView.findViewById(R.id.full_mpls_fault_notes_m1);
        textView_notes.setText(notes[position]);

        TextView textView_groupcase = (TextView)convertView.findViewById(R.id.full_mpls_fault_groupcase_m1);
        textView_groupcase.setText(groupcase[position]);

        return convertView;
    }
}
