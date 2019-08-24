package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class CuisiniereViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewcuisine;
    TextView desccuisine,namecuisine;
    TextView refecuisine;
    Button commandecuisine;
    public CuisiniereViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewcuisine= itemView.findViewById(R.id.item_image_aspirateur);
        desccuisine = itemView.findViewById(R.id.item_desc_aspirateur);
        namecuisine = itemView.findViewById(R.id.item_name_aspirateur);
        refecuisine = itemView.findViewById(R.id.refe_aspirateur);
        commandecuisine = itemView.findViewById(R.id.btn_commande_aspirateur);
    }
}
