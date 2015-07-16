package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.zackoji.fault_reportmockup.R;
import com.zackoji.fault_reportmockup.model.Full_DDN_Fault_Report_Model;

import java.util.List;

/**
 * Created by Zackoji on 15/7/2558.
 */
public class RecyclerView_Adapter_DDN_M1 extends RecyclerView.Adapter<RecyclerView_Adapter_DDN_M1.ViewHolder> {

    private Context mContext;
    private List<Full_DDN_Fault_Report_Model> mReports;

    /**
     * Constructor (getActivity(), dataModel)
     * */
    public RecyclerView_Adapter_DDN_M1(Context context, List<Full_DDN_Fault_Report_Model> full_ddn_fault_report_models) {
        mContext = context;
        mReports = full_ddn_fault_report_models;
    }

    /**
     * Inner Class
     * Bind with View
     * */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cv;
        public TextView textView_no;
        public TextView textView_circuit_id;
        public TextView textView_region;

        public ViewHolder(View view) {
            super(view);
            cv = (CardView)itemView.findViewById(R.id.cv1);
            textView_no = (TextView) view.findViewById(R.id.full_ddn_fault_no_m1);
            textView_circuit_id  = (TextView) view.findViewById(R.id.full_ddn_fault_cir_id_m1);
            textView_region  = (TextView) view.findViewById(R.id.full_ddn_fault_region_m1);
        }
    }

    /**
     * Create & Return ViewHolder
     * if(view == null) will create ViewHolder
     *
     * Create new views (invoked by the layout manager)
     * */
    @Override
    public RecyclerView_Adapter_DDN_M1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.listview_full_ddn_fault_m1, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext, "WOWW", Toast.LENGTH_SHORT).show();
//            }
//        });
//        view.setOnClickListener(new RecyclerItemClickListener
//                (mContext, new RecyclerItemClickListener.OnItemClickListener()
//                    {@Override public void onItemClick(View view, int position)
//                        {
//                            // do whatever
//                        }
//                    }
//                )
//        );
        return viewHolder;
    }

    /**
     * Set Value Dataset
     * setText() blah blah...
     *
     * พอ Scroll ถึงจุดที่ต้องใช้แล้วยังมี View เหลือเก็บไว้ ก็จะเอาสิ่งนั้นโยนให้ onBindViewHolder ไปยัดค่าทันที
     * (http://nuuneoi.com/blog/blog.php?read_id=758)
     *
     * Replace the contents of a view (invoked by the layout manager)
     * - get element from your dataset at this position
     * - replace the contents of the view with that element
     * */
    @Override
    public void onBindViewHolder(RecyclerView_Adapter_DDN_M1.ViewHolder holder, int position) {
        Full_DDN_Fault_Report_Model report = mReports.get(position);
        holder.cv.setContentPadding(20,10,5,5);
        holder.textView_no.setText("Event No. " + (position+1));
        holder.textView_circuit_id.setText(report.getCirID());
        holder.textView_region.setText(report.getRegion());
    }

    /**
     * Return the size of Dataset (invoked by the layout manager)
     * */
    @Override
    public int getItemCount() {
        return mReports.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
