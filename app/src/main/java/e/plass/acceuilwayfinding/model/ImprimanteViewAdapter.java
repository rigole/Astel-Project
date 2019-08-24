package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class ImprimanteViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewimpri;
    TextView descimpri,nameimpri;
    TextView refeimpri;
    Button commandeimpri;

    public ImprimanteViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewimpri = itemView.findViewById(R.id.item_image_imprimante);
        descimpri  = itemView.findViewById(R.id.item_desc_imprimante);
        nameimpri = itemView.findViewById(R.id.item_name_imprimante);
        refeimpri = itemView.findViewById(R.id.refe_imprimante);
        commandeimpri = itemView.findViewById(R.id.btn_commande_imprimante);
    }
}
