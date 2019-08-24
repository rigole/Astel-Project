package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class AspirateurViewAdapter extends RecyclerView.ViewHolder {

    ImageView mImageViewaspirateur;
    TextView descaspirateur,nameaspirateur;
    TextView refeaspirateur;
    Button commandeaspirateur;

    public AspirateurViewAdapter(@NonNull View itemView) {
        super(itemView);

        mImageViewaspirateur= itemView.findViewById(R.id.item_image_aspirateur);
        descaspirateur = itemView.findViewById(R.id.item_desc_aspirateur);
        nameaspirateur = itemView.findViewById(R.id.item_name_aspirateur);
        refeaspirateur = itemView.findViewById(R.id.refe_aspirateur);
        commandeaspirateur = itemView.findViewById(R.id.btn_commande_aspirateur);
    }
}
