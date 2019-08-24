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
import e.plass.acceuilwayfinding.model.AspirateurViewAdapter;
import e.plass.acceuilwayfinding.model.AutoViewAdapter;

public class AspirateurAdapter extends RecyclerView.Adapter<AspirateurViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public AspirateurAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public AspirateurViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_aspirateur,viewGroup,false);
        return new AspirateurViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AspirateurViewAdapter aspirateurViewAdapter, int i) {
        MyData current = mMyData.get(i);
        aspirateurViewAdapter.refeaspirateur.setText(current.getRefe());
        aspirateurViewAdapter.nameaspirateur.setText(current.getNom());
        aspirateurViewAdapter.descaspirateur.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(aspirateurViewAdapter.mImageViewaspirateur);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
