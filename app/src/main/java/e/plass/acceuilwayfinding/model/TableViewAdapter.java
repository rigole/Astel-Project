package e.plass.acceuilwayfinding.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.plass.acceuilwayfinding.R;

public class TableViewAdapter extends RecyclerView.ViewHolder {
    ImageView mImageViewTable;
    TextView descTable,nameTable;
    TextView refeTable;
    Button commandeTable;
    public TableViewAdapter(@NonNull View itemView) {
        super(itemView);
        mImageViewTable = itemView.findViewById(R.id.item_image_table);
        descTable  = itemView.findViewById(R.id.item_desc_table);
        nameTable = itemView.findViewById(R.id.item_name_table);
        refeTable = itemView.findViewById(R.id.refe_table);
        commandeTable = itemView.findViewById(R.id.btn_commande_table);
    }
}
