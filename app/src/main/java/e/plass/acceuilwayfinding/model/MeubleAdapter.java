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

public class MeubleAdapter extends RecyclerView.Adapter<MeubleViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public MeubleAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public MeubleViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_meuble,viewGroup,false);
        return new MeubleViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeubleViewAdapter meubleViewAdapter, int i) {
        MyData current = mMyData.get(i);
        meubleViewAdapter.refeMeuble.setText(current.getRefe());
        meubleViewAdapter.nameMeuble.setText(current.getNom());
        meubleViewAdapter.descMeuble.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(meubleViewAdapter.mImageViewMeuble);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
