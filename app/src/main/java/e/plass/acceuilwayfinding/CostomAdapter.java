package e.plass.acceuilwayfinding;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CostomAdapter extends RecyclerView.Adapter<CostomAdapter.ViewHolder>{

    private Context mContext;
    private List<MyData>mMyData;

    public CostomAdapter(Context context, List<MyData> myData) {
        mContext = context;
        mMyData = myData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_prod_item,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.description.setText(mMyData.get(position).getDescription());
        Glide.with(mContext).load(mMyData.get(position).getImage()).into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView description;
    public ImageView mImageView;
   // public TextView nom;

public ViewHolder(View itemView){

super(itemView);
description = itemView.findViewById(R.id.item_desc);
mImageView = itemView.findViewById(R.id.item_image);
//nom = itemView.findViewById(R.id.item_name);

}
}

}
