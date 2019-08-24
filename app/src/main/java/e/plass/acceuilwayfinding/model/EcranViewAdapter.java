package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class EcranViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewEcran;
    TextView descecran,nameEcran;
    TextView refeEcran;
    Button commandeEcran;

    public EcranViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewEcran = itemView.findViewById(R.id.item_image_ecran);
        descecran = itemView.findViewById(R.id.item_desc_ecran);
        nameEcran = itemView.findViewById(R.id.item_name_ecran);
        refeEcran= itemView.findViewById(R.id.refe_ecran);
        commandeEcran = itemView.findViewById(R.id.btn_commande_ecran);
    }
}
