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

public class InfoAdapter extends RecyclerView.Adapter<InfoViewAdapter>   {

    public InfoAdapter(){}

    @NonNull
    @Override
    public InfoViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_informatique,viewGroup,false);
        return new InfoViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewAdapter infoViewAdapter, int i) {
        MyData current = mMyData.get(i);
        infoViewAdapter.descinfo.setText(current.getDescription());
        infoViewAdapter.refeinfo.setText(current.getRefe());
        infoViewAdapter.nameinfo.setText(current.getNom());
        Picasso.get().load(current.getImage()).into(infoViewAdapter.mImageViewinfo);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }

    public InfoAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    ArrayList<MyData> mMyData;
    Context context;
}
