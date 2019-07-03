package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class MaisonViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewmatmaison;
    TextView descmatmaison,namematmaison;
    TextView refematmaison;
    Button commandematmaison;

    public MaisonViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewmatmaison = itemView.findViewById(R.id.item_image_matmaison);
        descmatmaison = itemView.findViewById(R.id.item_desc_matmaison);
        namematmaison = itemView.findViewById(R.id.item_name_matmaison);
        refematmaison = itemView.findViewById(R.id.refe_matmaison);
        commandematmaison = itemView.findViewById(R.id.btn_commande_matmaison);
    }
}
