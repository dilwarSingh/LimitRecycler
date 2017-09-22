package koi.com.limitrecycler;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vibrant1 on 21-Sep-17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    static int limit = 30;
    static int clickes = 30;
    List<counteryListData> listData, allListData;

    public ListAdapter(List<counteryListData> listData) {
        this.allListData = listData;
        this.listData = listData;


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        counteryListData countery = listData.get(position);
        holder.countery.setText(countery.getCountery());
        holder.continent.setText(countery.getContinents());

        if (clickes - 1 == position) {
            holder.loadButton.setVisibility(View.VISIBLE);
        } else {
            holder.loadButton.setVisibility(View.GONE);
        }
        if (clickes == listData.size()) {
            holder.loadButton.setVisibility(View.GONE);
        }


        holder.loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickes + limit <= listData.size()) {

                    clickes += limit;
                } else {
                    clickes = listData.size();
                }
                notifyDataSetChanged();
                holder.loadButton.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public int getItemCount() {


        return clickes;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView countery, continent;
        Button loadButton;

        public MyViewHolder(View view) {
            super(view);
            countery = (TextView) view.findViewById(R.id.country);
            continent = (TextView) view.findViewById(R.id.continent);
            loadButton = (Button) view.findViewById(R.id.button2);
        }
    }


}
