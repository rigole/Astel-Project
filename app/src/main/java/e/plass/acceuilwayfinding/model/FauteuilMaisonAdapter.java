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

public class FauteuilMaisonAdapter extends RecyclerView.Adapter<FauteuilMaisonViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public FauteuilMaisonAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public FauteuilMaisonViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_fauteuil_maison,viewGroup,false);
        return new FauteuilMaisonViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FauteuilMaisonViewAdapter fauteuilMaisonViewAdapter, int i) {
        MyData current = mMyData.get(i);
        fauteuilMaisonViewAdapter.refeFauteuilMaison.setText(current.getRefe());
        fauteuilMaisonViewAdapter.nameFauteuilMaison.setText(current.getNom());
        fauteuilMaisonViewAdapter.descFauteuilMaison.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(fauteuilMaisonViewAdapter.mImageViewFauteuilMaison);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
