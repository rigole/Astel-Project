package e.plass.acceuilwayfinding;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

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

import e.plass.acceuilwayfinding.model.BerlineAdapter;

public class BerlineActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private Button levee;
    private ArrayList<MyData> mMyData;
    private android.support.v7.widget.Toolbar toolbar;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berline);
        recyclerView = findViewById(R.id.recycler_view_berline);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(BerlineActivity.this));
        mMyData = new ArrayList<MyData>();
        toolbar = findViewById(R.id.toolbar);
        levee = findViewById(R.id.imagesplash);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.logoastel);
        setSupportActionBar(toolbar);
        levee.setOnClickListener(v -> {
            Intent intent = new Intent(BerlineActivity.this, LeveeDeFondActivity.class);
            startActivity(intent);
        });
        JsonFetch jsonFetch = new JsonFetch();
        jsonFetch.execute();
    }

    public class JsonFetch extends AsyncTask<String, Integer, String> {

        HttpURLConnection mHttpURLConnection = null;
        String mainfile;

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL("https://astelmobile.000webhostapp.com/ServicesAstel/berline.php");

                mHttpURLConnection = (HttpURLConnection) url.openConnection();
                mHttpURLConnection.connect();
                InputStream inputStream = mHttpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                String line = "";

                while ((line = bufferedReader.readLine()) != null) {

                    stringBuffer.append(line);
                }


                mainfile = stringBuffer.toString();
                JSONArray parent = new JSONArray(mainfile);
                int i = 0;
                while (i <= parent.length()) {
                    JSONObject child = parent.getJSONObject(i);
                    String name = child.getString("nom");
                    String img = child.getString("photo");
                    String desc = child.getString("description");
                    String refe = child.getString("reference");

                    //.add(new MyData(desc, img, refe));
                    mMyData.add(new MyData(desc,img,refe,name));
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
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            BerlineAdapter homeAdapter = new  BerlineAdapter(mMyData,BerlineActivity.this);
            recyclerView.setAdapter(homeAdapter);
            progressDialog.dismiss();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(BerlineActivity.this);
            progressDialog.setTitle("Veuillez Patienter");
            progressDialog.setMessage("Chargement en Cours");
            progressDialog.show();
        }


    }
}
