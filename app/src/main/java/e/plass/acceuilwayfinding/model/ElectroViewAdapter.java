package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class ElectroViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewelectro;
    TextView descelectro,nameelectro;
    TextView refeelectro;
    Button commandeelectro;

    public ElectroViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewelectro = itemView.findViewById(R.id.item_image_electro);
        descelectro  = itemView.findViewById(R.id.item_desc_electro);
        nameelectro = itemView.findViewById(R.id.item_name_electro);
        refeelectro = itemView.findViewById(R.id.refe_eletro);
        commandeelectro = itemView.findViewById(R.id.btn_commande_electro);

    }
}
