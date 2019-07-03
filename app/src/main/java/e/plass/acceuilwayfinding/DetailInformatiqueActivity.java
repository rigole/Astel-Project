package e.plass.acceuilwayfinding;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
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

import e.plass.acceuilwayfinding.model.InfoAdapter;

public class DetailInformatiqueActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<MyData> mMyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_informatique);
        recyclerView = findViewById(R.id.recycler_view_info);

        recyclerView.setHasFixedSize(true);
          recyclerView.setLayoutManager(new LinearLayoutManager(DetailInformatiqueActivity.this));
        mMyData = new ArrayList<MyData>();
        JsonFetch jsonFetch = new JsonFetch();
        jsonFetch.execute();
    }


    public class JsonFetch extends AsyncTask<String, String, String> {

        HttpURLConnection mHttpURLConnection = null;
        String mainfile;

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL("https://astelmobile.000webhostapp.com/ServicesAstel/catalogue.php");

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

            InfoAdapter homeAdapter = new InfoAdapter(mMyData,DetailInformatiqueActivity.this);
            recyclerView.setAdapter(homeAdapter);
        }

    }
}