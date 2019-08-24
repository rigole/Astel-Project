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

public class OldCarAdapter extends RecyclerView.Adapter<OldCarViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public OldCarAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public OldCarViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_old_car,viewGroup,false);
        return new OldCarViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OldCarViewAdapter oldCarViewAdapter, int i) {
        MyData current = mMyData.get(i);
        oldCarViewAdapter.refeOldCar.setText(current.getRefe());
        oldCarViewAdapter.nameOldCar.setText(current.getNom());
        oldCarViewAdapter.descOldCar.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(oldCarViewAdapter.mImageViewOldCar);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
