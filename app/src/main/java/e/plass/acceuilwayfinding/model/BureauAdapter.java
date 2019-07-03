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

public class BureauAdapter  extends RecyclerView.Adapter<BureauViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;
      public BureauAdapter(){}
    public BureauAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public BureauViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_bureau,viewGroup,false);
        return new BureauViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BureauViewAdapter bureauViewAdapter, int i) {
        MyData current = mMyData.get(i);
        bureauViewAdapter.refebureau.setText(current.getRefe());
        bureauViewAdapter.namebureau.setText(current.getNom());
        bureauViewAdapter.descbureau.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(bureauViewAdapter.mImageViewbureau);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
