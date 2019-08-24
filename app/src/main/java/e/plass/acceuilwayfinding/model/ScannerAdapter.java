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

public class ScannerAdapter  extends RecyclerView.Adapter<ScannerViewAdapter>  {

    ArrayList<MyData> mMyData;
    Context context;

    public ScannerAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public ScannerViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_scanner,viewGroup,false);
        return new ScannerViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScannerViewAdapter scannerViewAdapter, int i) {

        MyData current = mMyData.get(i);
        scannerViewAdapter.refescanner.setText(current.getRefe());
        scannerViewAdapter.namescanner.setText(current.getNom());
        scannerViewAdapter.descscanner.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(scannerViewAdapter.mImageViewscanner);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
