package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class ScannerViewAdapter extends RecyclerView.ViewHolder {

    ImageView mImageViewscanner;
    TextView descscanner,namescanner;
    TextView refescanner;
    Button commandescanner;
    public ScannerViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewscanner = itemView.findViewById(R.id.item_image_scanner);
        descscanner = itemView.findViewById(R.id.item_desc_scanner);
        namescanner = itemView.findViewById(R.id.item_name_scanner);
        refescanner = itemView.findViewById(R.id.refe_scanner);
        commandescanner = itemView.findViewById(R.id.btn_commande_scanner);
    }
}
