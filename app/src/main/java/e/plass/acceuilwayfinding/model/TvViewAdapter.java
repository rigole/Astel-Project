package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class TvViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewtv;
    TextView desctv,nametv;
    TextView refetv;
    Button commandetv;

    public TvViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewtv = itemView.findViewById(R.id.item_image_tv);
        desctv  = itemView.findViewById(R.id.item_desc_tv);
        nametv = itemView.findViewById(R.id.item_name_tv);
        refetv = itemView.findViewById(R.id.refe_tv);
        commandetv = itemView.findViewById(R.id.btn_commande_tv);
    }
}
