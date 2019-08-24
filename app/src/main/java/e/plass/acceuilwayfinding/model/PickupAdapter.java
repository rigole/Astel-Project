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

public class PickupAdapter extends RecyclerView.Adapter<PickViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public PickupAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public PickViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_pickup,viewGroup,false);
        return new PickViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PickViewAdapter pickViewAdapter, int i) {
        MyData current = mMyData.get(i);
        pickViewAdapter.refePick.setText(current.getRefe());
        pickViewAdapter.namePick.setText(current.getNom());
        pickViewAdapter.descPick.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(pickViewAdapter.mImageViewPick);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
