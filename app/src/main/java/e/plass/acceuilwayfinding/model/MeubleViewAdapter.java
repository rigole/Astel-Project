package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class MeubleViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewMeuble;
    TextView descMeuble,nameMeuble;
    TextView refeMeuble;
    Button commandeMeuble;
    public MeubleViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewMeuble = itemView.findViewById(R.id.item_image_meuble);
        descMeuble = itemView.findViewById(R.id.item_desc_meuble);
        nameMeuble = itemView.findViewById(R.id.item_name_meuble);
        refeMeuble = itemView.findViewById(R.id.refe_meuble);
        commandeMeuble = itemView.findViewById(R.id.btn_commande_meuble);
    }
}
