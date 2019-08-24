package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class ChaiseViewAdapter  extends RecyclerView.ViewHolder {
    ImageView mImageViewchaise;
    TextView descchaise,namechaise;
    TextView refechaise;
    Button commandechaise;

    public ChaiseViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewchaise= itemView.findViewById(R.id.item_image_chaise);
        descchaise = itemView.findViewById(R.id.item_desc_chaise);
        namechaise = itemView.findViewById(R.id.item_name_chaise);
        refechaise = itemView.findViewById(R.id.refe_chaise);
        commandechaise = itemView.findViewById(R.id.btn_commande_chaise);
    }
}
