package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class BerlineViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewBerline;
    TextView descBerline,nameBerline;
    TextView refeBerline;
    Button commandeBerline;

    public BerlineViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewBerline = itemView.findViewById(R.id.item_image_berline);
        descBerline = itemView.findViewById(R.id.item_desc_berline);
        nameBerline = itemView.findViewById(R.id.item_name_berline);
        refeBerline = itemView.findViewById(R.id.refe_berline);
        commandeBerline = itemView.findViewById(R.id.btn_commande_berline);
    }
}
