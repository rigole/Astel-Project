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

public class TvAdapter  extends RecyclerView.Adapter<TvViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public TvAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public TvViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_tv,viewGroup,false);
        return new TvViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvViewAdapter tvViewAdapter, int i) {
        MyData current = mMyData.get(i);
        tvViewAdapter.refetv.setText(current.getRefe());
        tvViewAdapter.nametv.setText(current.getNom());
        tvViewAdapter.desctv.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(tvViewAdapter.mImageViewtv);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
