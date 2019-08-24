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

public class BerlineAdapter extends RecyclerView.Adapter<BerlineViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public BerlineAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public BerlineViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_berline,viewGroup,false);
        return new BerlineViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BerlineViewAdapter berlineViewAdapter, int i) {
        MyData current = mMyData.get(i);
        berlineViewAdapter.refeBerline.setText(current.getRefe());
        berlineViewAdapter.nameBerline.setText(current.getNom());
        berlineViewAdapter.descBerline.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(berlineViewAdapter.mImageViewBerline);
    }



    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
