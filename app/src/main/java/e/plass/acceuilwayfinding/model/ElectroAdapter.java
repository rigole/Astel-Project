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

public class ElectroAdapter  extends RecyclerView.Adapter<ElectroViewAdapter>  {
    ArrayList<MyData> mMyData;
    Context context;

    public ElectroAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    public ElectroAdapter(){}
    @NonNull
    @Override
    public ElectroViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_electromenager,viewGroup,false);
        return new ElectroViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectroViewAdapter electroViewAdapter, int i) {
        MyData current = mMyData.get(i);
        electroViewAdapter.nameelectro.setText(current.getNom());
        electroViewAdapter.descelectro.setText(current.getDescription());
        electroViewAdapter.refeelectro.setText(current.getRefe());
        Picasso.get().load(current.getImage()).into(electroViewAdapter.mImageViewelectro);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
