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

public class LaptopAdapter extends RecyclerView.Adapter<LaptopViewAdapter> {


    ArrayList<MyData> mMyData;
    Context context;

    public LaptopAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public LaptopViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_laptop,viewGroup,false);
        return new LaptopViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewAdapter laptopViewAdapter, int i) {
        MyData current = mMyData.get(i);
        laptopViewAdapter.refelaptop.setText(current.getRefe());
        laptopViewAdapter.namelaptop.setText(current.getNom());
        laptopViewAdapter.desclaptop.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(laptopViewAdapter.mImageViewlaptop);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
