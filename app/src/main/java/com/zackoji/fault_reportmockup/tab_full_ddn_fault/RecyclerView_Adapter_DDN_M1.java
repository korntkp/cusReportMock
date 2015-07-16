package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zackoji.fault_reportmockup.R;
import com.zackoji.fault_reportmockup.model.Full_DDN_Fault_Report_Model;

import java.util.List;

/**
 * Created by Zackoji on 15/7/2558.
 */
public class RecyclerView_Adapter_DDN_M1 extends RecyclerView.Adapter<RecyclerView_Adapter_DDN_M1.ViewHolder> {

    private List<Full_DDN_Fault_Report_Model> mReports;
    private Context mContext;

    public RecyclerView_Adapter_DDN_M1(Context context, List<Full_DDN_Fault_Report_Model> full_ddn_fault_report_models) {
        mReports = full_ddn_fault_report_models;
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_no;
        public TextView textView_circuit_id;
        public TextView textView_region;

        public ViewHolder(View view) {
            super(view);

            textView_no = (TextView) view.findViewById(R.id.full_ddn_fault_no_m1);
            textView_circuit_id  = (TextView) view.findViewById(R.id.full_ddn_fault_cir_id_m1);
            textView_region  = (TextView) view.findViewById(R.id.full_ddn_fault_region_m1);
        }
    }

    @Override
    public RecyclerView_Adapter_DDN_M1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.listview_full_ddn_fault_m1, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView_Adapter_DDN_M1.ViewHolder holder, int position) {
        Full_DDN_Fault_Report_Model report = mReports.get(position);

        holder.textView_no.setText("No.1");
        holder.textView_circuit_id.setText(report.getCirID());
        holder.textView_region.setText(report.getRegion());
    }

    @Override
    public int getItemCount() {
        return mReports.size();
    }


}
