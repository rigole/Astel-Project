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

public class DesktopAdapter  extends RecyclerView.Adapter<DesktopViewAdapter> {

    ArrayList<MyData> mMyData;
    Context context;

    public DesktopAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public DesktopViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_desktop,viewGroup,false);
        return new DesktopViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DesktopViewAdapter desktopViewAdapter, int i) {
        MyData current = mMyData.get(i);
        desktopViewAdapter.refedesktop.setText(current.getRefe());
        desktopViewAdapter.namedesktop.setText(current.getNom());
        desktopViewAdapter.descdesktop.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(desktopViewAdapter.mImageViewdesktop);
    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
