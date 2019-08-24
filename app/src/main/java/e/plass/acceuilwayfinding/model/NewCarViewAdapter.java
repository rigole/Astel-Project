package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class NewCarViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewNewCar;
    TextView descNewCar,nameNewCar;
    TextView refeNewCar;
    Button commandeNewCar;
    public NewCarViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewNewCar = itemView.findViewById(R.id.item_image_NewCar);
        descNewCar = itemView.findViewById(R.id.item_desc_NewCar);
        nameNewCar = itemView.findViewById(R.id.item_name_NewCar);
        refeNewCar = itemView.findViewById(R.id.refe_NewCar);
        commandeNewCar = itemView.findViewById(R.id.btn_commande_NewCar);
    }
}
