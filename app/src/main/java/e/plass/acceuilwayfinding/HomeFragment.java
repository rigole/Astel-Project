package e.plass.acceuilwayfinding;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import e.plass.acceuilwayfinding.model.BureauActivity;
import e.plass.acceuilwayfinding.model.ElectromenagerActivity;
import e.plass.acceuilwayfinding.model.HomeAdapter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.GET;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class HomeFragment extends android.support.v4.app.Fragment {
    private HomeAdapter custumAdapter;
private GridLayoutManager mGridLayoutManager;
private CostomAdapter mAdapter;
private ArrayList<MyData>mData;
    GridLayout mainGrid;
  //  private GridViewAdapter adapter;
  //  private GridView mGridView;
    RecyclerView recyclerView;
  //  RecyclerView recyclerView2;

    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //return inflater.inflate(R.layout.fragment_home, container, false);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
      //  recyclerView = v.findViewById(R.id.rv);
        mainGrid = v.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
/*        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mData = new ArrayList<MyData>();
        JsonFetch jsonFetch = new JsonFetch();
        jsonFetch.execute();*/




        return v;
    }

    private void setSingleEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(0);
        cardView.setOnClickListener(v -> {
            //Intent intent = new Intent(getContext(), DetailInformatiqueActivity.class);
            Intent intent = new Intent(getContext(), ProduitInformatiqueActivity.class);
            startActivity(intent);
        });

        CardView cardView1 = (CardView) mainGrid.getChildAt(1);
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ProduitMenagerActivity.class);
            startActivity(intent);
        });

        CardView cardView2 = (CardView)mainGrid.getChildAt(2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getContext(), BureauActivity.class);
                Intent intent = new Intent(getContext(), ProduitBureauActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = (CardView) mainGrid.getChildAt(3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProduitMaisonActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = (CardView)mainGrid.getChildAt(4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProduitAutomobileActivity.class);
                startActivity(intent);
            }
        });

    }


    public void initRecycleView(){
        //HomeAdapter custumAdapter     = new HomeAdapter(getContext(),mList);
        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(getContext(),R.anim.layout_anim_slide);
//        recyclerView.setAdapter(custumAdapter);
        recyclerView.setLayoutAnimation(layoutAnimationController);
//       recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

       /* recyclerView2.setAdapter(custumAdapter);
        recyclerView2.getAdapter().notifyDataSetChanged();
        recyclerView2.scheduleLayoutAnimation();
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));*/
    }

/*public class JsonFetch extends AsyncTask<String,String,String>{

 HttpURLConnection mHttpURLConnection = null;
 String mainfile;
    @Override
    protected String doInBackground(String... strings) {
        try{
            URL url = new URL("https://astelmobile.000webhostapp.com/ServicesAstel/catalogue.php");

mHttpURLConnection = (HttpURLConnection) url.openConnection();
mHttpURLConnection.connect();
            InputStream inputStream = mHttpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line="";

            while ((line =bufferedReader.readLine())!=null ){

                stringBuffer.append(line);
            }


            mainfile = stringBuffer.toString();
            JSONArray parent  = new JSONArray(mainfile);
            int i =0;
            while (i <= parent.length()){
                JSONObject child = parent.getJSONObject(i);
                String name = child.getString("nom");
                String img = child.getString("photo");
                String desc = child.getString("description");
                String refe = child.getString("reference");
                mData.add(new MyData(desc,img,refe,name));
                i++;

            }








        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);

        HomeAdapter homeAdapter = new HomeAdapter(mData,getContext());
        recyclerView.setAdapter(homeAdapter);
    }*/
}


