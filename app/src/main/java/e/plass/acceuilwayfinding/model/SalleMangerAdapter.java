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

public class SalleMangerAdapter extends RecyclerView.Adapter<SalleMangerViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public SalleMangerAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public SalleMangerViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_pickup,viewGroup,false);
        return new SalleMangerViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SalleMangerViewAdapter salleMangerViewAdapter, int i) {
        MyData current = mMyData.get(i);
        salleMangerViewAdapter.refeSalleManger.setText(current.getRefe());
        salleMangerViewAdapter.nameSalleManger.setText(current.getNom());
        salleMangerViewAdapter.descSalleManger.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(salleMangerViewAdapter.mImageViewSalleManger);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
