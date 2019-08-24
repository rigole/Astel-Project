package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class DesktopViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewdesktop;
    TextView descdesktop,namedesktop;
    TextView refedesktop;
    Button commandedesktop;

    public DesktopViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewdesktop = itemView.findViewById(R.id.item_image_desktop);
        descdesktop = itemView.findViewById(R.id.item_desc_desktop);
        namedesktop = itemView.findViewById(R.id.item_name_desktop);
        refedesktop = itemView.findViewById(R.id.refe_desktop);
        commandedesktop = itemView.findViewById(R.id.btn_commande_desktop);
    }
}
