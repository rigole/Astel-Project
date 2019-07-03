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

public class AutoAdapter extends RecyclerView.Adapter<AutoViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public AutoAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public AutoViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_automobile,viewGroup,false);
        return new AutoViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AutoViewAdapter autoViewAdapter, int i) {
        MyData current = mMyData.get(i);
        autoViewAdapter.nameauto.setText(current.getNom());
        autoViewAdapter.refeauto.setText(current.getRefe());
        autoViewAdapter.descauto.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(autoViewAdapter.mImageViewauto);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
