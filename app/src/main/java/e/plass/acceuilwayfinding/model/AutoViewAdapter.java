package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class AutoViewAdapter extends RecyclerView.ViewHolder{
    ImageView mImageViewauto;
    TextView descauto,nameauto;
    TextView refeauto;
    Button commandeauto;

    public AutoViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewauto = itemView.findViewById(R.id.item_image_auto);
        descauto = itemView.findViewById(R.id.item_desc_auto);
        nameauto = itemView.findViewById(R.id.item_name_auto);
        refeauto = itemView.findViewById(R.id.refe_auto);
        commandeauto = itemView.findViewById(R.id.btn_commande_auto);
    }
}
