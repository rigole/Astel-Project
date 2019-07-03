package e.plass.acceuilwayfinding.model;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

import static android.app.PendingIntent.getActivity;

public class HomeViewHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView desc;
    TextView refe;
    Button commande;
    public HomeViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.item_image);
        desc = itemView.findViewById(R.id.item_desc);
        refe = itemView.findViewById(R.id.refe);
        commande = itemView.findViewById(R.id.btn_commande);

        commande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reference = refe.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("reference",reference);


            }
        });

    }
}
