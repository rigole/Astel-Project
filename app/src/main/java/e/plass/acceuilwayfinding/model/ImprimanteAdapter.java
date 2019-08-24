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

public class ImprimanteAdapter  extends  RecyclerView.Adapter<ImprimanteViewAdapter>  {

    ArrayList<MyData> mMyData;
    Context context;

    public ImprimanteAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public ImprimanteViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_imprimante,viewGroup,false);
        return new ImprimanteViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImprimanteViewAdapter imprimanteViewAdapter, int i) {
        MyData current = mMyData.get(i);
        imprimanteViewAdapter.refeimpri.setText(current.getRefe());
        imprimanteViewAdapter.nameimpri.setText(current.getNom());
        imprimanteViewAdapter.descimpri.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(imprimanteViewAdapter.mImageViewimpri);

    }

    @Override
    public int getItemCount() {
         return mMyData.size();
    }
}
