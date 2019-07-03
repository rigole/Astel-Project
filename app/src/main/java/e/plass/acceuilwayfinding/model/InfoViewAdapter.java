package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class InfoViewAdapter  extends RecyclerView.ViewHolder {

    ImageView mImageViewinfo;
    TextView descinfo,nameinfo;
    TextView refeinfo;
    Button commandeinfo;
    public InfoViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewinfo = itemView.findViewById(R.id.item_image_info);
        nameinfo = itemView.findViewById(R.id.item_name_info);
        descinfo = itemView.findViewById(R.id.item_desc_info);
        refeinfo = itemView.findViewById(R.id.refe_info);
        commandeinfo = itemView.findViewById(R.id.btn_commande_info);

    }
}
