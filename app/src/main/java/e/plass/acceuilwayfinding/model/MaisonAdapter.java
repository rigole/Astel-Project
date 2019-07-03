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

public class MaisonAdapter  extends RecyclerView.Adapter<MaisonViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public MaisonAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public MaisonViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_materiel_maison,viewGroup,false);
        return new MaisonViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MaisonViewAdapter maisonViewAdapter, int i) {
        MyData current = mMyData.get(i);
        maisonViewAdapter.refematmaison.setText(current.getRefe());
        maisonViewAdapter.namematmaison.setText(current.getNom());
        maisonViewAdapter.descmatmaison.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(maisonViewAdapter.mImageViewmatmaison);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
