package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class FauteuilViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewFauteuil;
    TextView descFauteuil,nameFauteuil;
    TextView refeFauteuil;
    Button commandeFauteuil;
    public FauteuilViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewFauteuil = itemView.findViewById(R.id.item_image_fauteuil);
        descFauteuil  = itemView.findViewById(R.id.item_desc_fauteuil);
        nameFauteuil = itemView.findViewById(R.id.item_name_fauteuil);
        refeFauteuil = itemView.findViewById(R.id.refe_fauteuil);
        commandeFauteuil = itemView.findViewById(R.id.btn_commande_fauteuil);
    }
}
