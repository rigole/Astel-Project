package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class BureauViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewbureau;
    TextView descbureau,namebureau;
    TextView refebureau;
    Button commandebureau;

    public BureauViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewbureau = itemView.findViewById(R.id.item_image_bureau);
        descbureau = itemView.findViewById(R.id.item_desc_bureau);
        namebureau = itemView.findViewById(R.id.item_name_bureau);
        refebureau = itemView.findViewById(R.id.refe_bureau);
        commandebureau = itemView.findViewById(R.id.btn_commande_bureau);
    }
}
