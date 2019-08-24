package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class LaptopViewAdapter extends RecyclerView.ViewHolder {

    ImageView mImageViewlaptop;
    TextView desclaptop,namelaptop;
    TextView refelaptop;
    Button commandelaptop;
    public LaptopViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewlaptop = itemView.findViewById(R.id.item_image_laptop);
        desclaptop = itemView.findViewById(R.id.item_desc_laptop);
        namelaptop = itemView.findViewById(R.id.item_name_laptop);
        refelaptop = itemView.findViewById(R.id.refe_laptop);
        commandelaptop = itemView.findViewById(R.id.btn_commande_laptop);


    }
}
