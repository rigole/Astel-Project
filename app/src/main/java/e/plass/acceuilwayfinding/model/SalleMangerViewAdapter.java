package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class SalleMangerViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewSalleManger;
    TextView descSalleManger,nameSalleManger;
    TextView refeSalleManger;
    Button commandeSalleManger;
    public SalleMangerViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewSalleManger = itemView.findViewById(R.id.item_image_salle_manger);
        descSalleManger = itemView.findViewById(R.id.item_desc_salle_manger);
        nameSalleManger = itemView.findViewById(R.id.item_name_salle_manger);
        refeSalleManger = itemView.findViewById(R.id.refe_salle_manger);
        commandeSalleManger = itemView.findViewById(R.id.btn_commande_salle_manger);
    }
}
