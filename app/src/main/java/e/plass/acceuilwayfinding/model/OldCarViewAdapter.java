package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class OldCarViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewOldCar;
    TextView descOldCar,nameOldCar;
    TextView refeOldCar;
    Button commandeOldCar;
    public OldCarViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewOldCar = itemView.findViewById(R.id.item_image_old_car);
        descOldCar = itemView.findViewById(R.id.item_desc_old_car);
        nameOldCar = itemView.findViewById(R.id.item_name_old_car);
        refeOldCar = itemView.findViewById(R.id.refe_old_car);
        commandeOldCar = itemView.findViewById(R.id.btn_commande_old_car);
    }
}
