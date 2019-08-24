package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class ConferenceViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewConference;
    TextView descConference,nameConference;
    TextView refeConference;
    Button commandeConference;

    public ConferenceViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewConference = itemView.findViewById(R.id.item_image_conference);
        descConference  = itemView.findViewById(R.id.item_desc_conference);
        nameConference = itemView.findViewById(R.id.item_name_conference);
        refeConference = itemView.findViewById(R.id.refe_conference);
        commandeConference = itemView.findViewById(R.id.btn_commande_conference);
    }
}
