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

public class CuisiniereAdapter extends RecyclerView.Adapter<CuisiniereViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public CuisiniereAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public CuisiniereViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_aspirateur,viewGroup,false);
        return new CuisiniereViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CuisiniereViewAdapter cuisiniereViewAdapter, int i) {
        MyData current = mMyData.get(i);
        cuisiniereViewAdapter.refecuisine.setText(current.getRefe());
        cuisiniereViewAdapter.namecuisine.setText(current.getNom());
        cuisiniereViewAdapter.refecuisine.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(cuisiniereViewAdapter.mImageViewcuisine);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
