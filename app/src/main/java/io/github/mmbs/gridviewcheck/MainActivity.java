package io.github.mmbs.gridviewcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;

    static final String[] STRINGS = new String[] {
            "AAAAAAA", "BBBBBBB", "CCCCCCC", "DDDDDDDD", "EEEEEEEEE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = (GridView) findViewById(R.id.gridView);
        mGridView.setAdapter(new MyGridViewAdapter(STRINGS, this));


//        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "ITEM Clicked", Toast.LENGTH_SHORT).show();
//                EditText editText= (EditText) view.findViewById(R.id.grid_item_label);
//            }
//        });
//
//        mGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "ITEM LONG CLICKED", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });




    }
}


