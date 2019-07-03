package e.plass.acceuilwayfinding;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerHomeFragment extends Fragment {

    public static Fragment newInstance() {
        return new RecyclerHomeFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_view_fragment,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerViewAdapter());

        return view;
    }
private class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private CardView mCardView;
        private TextView mTextView;


        public RecyclerViewHolder(View itemView){

            super(itemView);
        }

        public RecyclerViewHolder(LayoutInflater inflater,ViewGroup container){

            super(inflater.inflate(R.layout.card_view,container,false));

            mCardView = itemView.findViewById(R.id.card_container);
            mTextView =itemView.findViewById(R.id.text_holder);
        }
}
private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(getActivity());
        return new RecyclerViewHolder(inflater,viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}

}
