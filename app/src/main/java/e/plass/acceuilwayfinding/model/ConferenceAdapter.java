package e.plass.acceuilwayfinding.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import e.plass.acceuilwayfinding.MyData;
import e.plass.acceuilwayfinding.R;

public class ConferenceAdapter extends RecyclerView.Adapter<ConferenceViewAdapter> {
    ArrayList<MyData> mMyData;
    Context context;

    public ConferenceAdapter(ArrayList<MyData> myData, Context context) {
        mMyData = myData;
        this.context = context;
    }

    @NonNull
    @Override
    public ConferenceViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_conference,viewGroup,false);
        return new ConferenceViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConferenceViewAdapter conferenceViewAdapter, int i) {
        MyData current = mMyData.get(i);
        conferenceViewAdapter.refeConference.setText(current.getRefe());
        conferenceViewAdapter.nameConference.setText(current.getNom());
        conferenceViewAdapter.descConference.setText(current.getDescription());
        Picasso.get().load(current.getImage()).into(conferenceViewAdapter.mImageViewConference);

    }

    @Override
    public int getItemCount() {
        return mMyData.size();
    }
}
