package e.plass.acceuilwayfinding.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import e.plass.acceuilwayfinding.HomeFragment;
import e.plass.acceuilwayfinding.ModelProd;
import e.plass.acceuilwayfinding.MyData;
import e.plass.acceuilwayfinding.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    public HomeAdapter() {
    }

    public HomeAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    ArrayList<MyData>mMyData;
    Context context;



    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(context).inflate(R.layout.rv_prod_item,viewGroup,false);


        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder homeViewHolder, int i) {

     MyData current = mMyData.get(i);
     homeViewHolder.desc.setText(current.getDescription());
     homeViewHolder.refe.setText(current.getRefe());
     Picasso.get().load(current.getImage()).into(homeViewHolder.mImageView);


    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }

   /* private Context mContext;
    private List<MyData> mList;
   public HomeAdapter(Context context, List<MyData> prods){

     mContext= context;
     mList=prods;
   }




    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
       
      View view =  layoutInflater.inflate(R.layout.rv_prod_item,viewGroup,false);


        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView desc,item_place,item_price;
        public  ViewHolder(View itemView){

            super(itemView);


            // MyData modelProd = mList.get(i);
            ImageView image =  itemView.findViewById(R.id.item_image);
            TextView desc = itemView.findViewById(R.id.item_desc);
            TextView name,price;

          /*  name = viewHolder.item_name;
            desc = viewHolder.item_place;
            price = viewHolder.item_price;*/

            // Picasso.get().load(modelProd.getImage()).into(viewHolder.item_image);

            //name.setText(modelProd.getName());
            //   desc.setText(modelProd.getDescription());
            //price.setText(modelProd.getPrice());*/


        }


    /*@Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder viewHolder, int i) {

       MyData modelProd = mList.get(i);
       //ImageView image =  viewHolder.item_image;

       //TextView name,desc,price;

     /*  name = viewHolder.item_name;
       desc = viewHolder.item_place;
       price = viewHolder.item_price;*/
         //viewHolder.desc.setText(modelProd.getDescription());
       // Picasso.get().load(modelProd.getImage()).into(viewHolder.item_image);

       //name.setText(modelProd.getName());
      // desc.setText(modelProd.getDescription());
       //price.setText(modelProd.getPrice());*/




   /* @Override
    public int getItemCount() {
        return mList.size();
    }


}*/
