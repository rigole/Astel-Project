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

public class FroidAdapter extends RecyclerView.Adapter<FroidViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public FroidAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public FroidViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_froid,viewGroup,false);
        return new FroidViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FroidViewAdapter froidViewAdapter, int i) {
        MyData current = mMyData.get(i);
        froidViewAdapter.refefroid.setText(current.getRefe());
        froidViewAdapter.namefroid.setText(current.getNom());
        froidViewAdapter.descfroid.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(froidViewAdapter.mImageViewfroid);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
