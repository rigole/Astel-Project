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

public class ChaiseAdapter extends RecyclerView.Adapter<ChaiseViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public ChaiseAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public ChaiseViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_chaise,viewGroup,false);
        return new ChaiseViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChaiseViewAdapter chaiseViewAdapter, int i) {
        MyData current = mMyData.get(i);
        chaiseViewAdapter.refechaise.setText(current.getRefe());
        chaiseViewAdapter.namechaise.setText(current.getNom());
        chaiseViewAdapter.descchaise.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(chaiseViewAdapter.mImageViewchaise);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
