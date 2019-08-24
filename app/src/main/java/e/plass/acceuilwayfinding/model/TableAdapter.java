package e.plass.acceuilwayfinding.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import e.plass.acceuilwayfinding.MyData;
import e.plass.acceuilwayfinding.R;

public class TableAdapter extends RecyclerView.Adapter<TableViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public TableAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public TableViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_table,viewGroup,false);
        return new TableViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableViewAdapter tableViewAdapter, int i) {
        MyData current = mMyData.get(i);
        tableViewAdapter.refeTable.setText(current.getRefe());
        tableViewAdapter.nameTable.setText(current.getNom());
        tableViewAdapter.descTable.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(tableViewAdapter.mImageViewTable);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
