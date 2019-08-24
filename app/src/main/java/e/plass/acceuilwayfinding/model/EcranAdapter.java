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

public class EcranAdapter extends RecyclerView.Adapter<EcranViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public EcranAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public EcranViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_ecran,viewGroup,false);
        return new EcranViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EcranViewAdapter ecranViewAdapter, int i) {
        MyData current = mMyData.get(i);
        ecranViewAdapter.nameEcran.setText(current.getNom());
        ecranViewAdapter.descecran.setText(current.getDescription());
        ecranViewAdapter.refeEcran.setText(current.getRefe());
        Picasso.get().load(current.getImage()).into(ecranViewAdapter.mImageViewEcran);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
