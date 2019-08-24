package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class FroidViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewfroid;
    TextView descfroid,namefroid;
    TextView refefroid;
    Button commandefroid;
    public FroidViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewfroid = itemView.findViewById(R.id.item_image_froid);
        descfroid = itemView.findViewById(R.id.item_desc_froid);
        namefroid = itemView.findViewById(R.id.item_name_froid);
        refefroid= itemView.findViewById(R.id.refe_froid);
        commandefroid = itemView.findViewById(R.id.btn_commande_froid);
    }
}
