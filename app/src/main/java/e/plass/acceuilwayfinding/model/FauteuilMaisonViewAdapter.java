package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class FauteuilMaisonViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewFauteuilMaison;
    TextView descFauteuilMaison,nameFauteuilMaison;
    TextView refeFauteuilMaison;
    Button commandeFauteuilMaison;
    public FauteuilMaisonViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewFauteuilMaison = itemView.findViewById(R.id.item_image_fauteuil_maison);
        descFauteuilMaison = itemView.findViewById(R.id.item_desc_fauteuil_maison);
        nameFauteuilMaison = itemView.findViewById(R.id.item_name_fauteuil_maison);
        refeFauteuilMaison = itemView.findViewById(R.id.refe_fauteuil_maison);
        commandeFauteuilMaison = itemView.findViewById(R.id.btn_commande_fauteuil_maison);
    }
}
