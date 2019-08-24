package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class PickViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewPick;
    TextView descPick,namePick;
    TextView refePick;
    Button commandePick;
    public PickViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewPick = itemView.findViewById(R.id.item_image_pick);
        descPick = itemView.findViewById(R.id.item_desc_pick);
        namePick = itemView.findViewById(R.id.item_name_pick);
        refePick = itemView.findViewById(R.id.refe_pick);
        commandePick = itemView.findViewById(R.id.btn_commande_pick);
    }
}
