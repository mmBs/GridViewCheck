package io.github.mmbs.gridviewcheck;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by michal on 25/05/2016.
 */

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private final String[] mValues;

    public MyGridViewAdapter(String[] values, Context context) {
        mValues = values;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridViewItem;

        if (convertView == null) {
            gridViewItem = new View(mContext);
            gridViewItem = layoutInflater.inflate(R.layout.grid_cell, null);
            TextView textView = (TextView)gridViewItem.findViewById(R.id.grid_item_number);
            EditText editText = (EditText)gridViewItem.findViewById(R.id.grid_item_label);
            textView.setText(mValues[position]);

        } else {
            gridViewItem = (View) convertView;
        }

        gridViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("GRID", "onClick: " );
            }
        });

        gridViewItem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.e("GRID", "onLongClick: " );
                return true;
            }
        });

        return gridViewItem;
    }

}
