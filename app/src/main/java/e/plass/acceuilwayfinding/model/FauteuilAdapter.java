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

public class FauteuilAdapter extends RecyclerView.Adapter<FauteuilViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public FauteuilAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public FauteuilViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_fauteuil,viewGroup,false);
        return new FauteuilViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FauteuilViewAdapter fauteuilViewAdapter, int i) {
        MyData current = mMyData.get(i);
        fauteuilViewAdapter.refeFauteuil.setText(current.getRefe());
        fauteuilViewAdapter.nameFauteuil.setText(current.getNom());
        fauteuilViewAdapter.descFauteuil.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(fauteuilViewAdapter.mImageViewFauteuil);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
