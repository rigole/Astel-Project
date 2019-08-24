package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class MachineViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewmachine;
    TextView descmachine,namemachine;
    TextView refemachine;
    Button commandemachine;

    public MachineViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewmachine = itemView.findViewById(R.id.item_image_machine);
        descmachine = itemView.findViewById(R.id.item_desc_machine);
        namemachine = itemView.findViewById(R.id.item_name_machine);
        refemachine= itemView.findViewById(R.id.refe_machine);
        commandemachine = itemView.findViewById(R.id.btn_commande_machine);
    }
}
