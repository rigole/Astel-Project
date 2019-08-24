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

public class MachineAdapter extends RecyclerView.Adapter<MachineViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public MachineAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public MachineViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_machine,viewGroup,false);
        return new MachineViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MachineViewAdapter machineViewAdapter, int i) {
        MyData current = mMyData.get(i);
        machineViewAdapter.refemachine.setText(current.getRefe());
        machineViewAdapter.namemachine.setText(current.getNom());
        machineViewAdapter.descmachine.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(machineViewAdapter.mImageViewmachine);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
