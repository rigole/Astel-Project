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

public class NewCarAdapter  extends RecyclerView.Adapter<NewCarViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public NewCarAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public NewCarViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_new_car,viewGroup,false);
        return new NewCarViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewCarViewAdapter newCarViewAdapter, int i) {
        MyData current = mMyData.get(i);
        newCarViewAdapter.refeNewCar.setText(current.getRefe());
        newCarViewAdapter.nameNewCar.setText(current.getNom());
        newCarViewAdapter.descNewCar.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(newCarViewAdapter.mImageViewNewCar);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
