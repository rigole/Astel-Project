package e.plass.acceuilwayfinding;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewParentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.transition.Transition;

import java.util.ArrayList;

import e.plass.acceuilwayfinding.model.CustumAdapter;
import e.plass.acceuilwayfinding.model.Ecole;
import e.plass.acceuilwayfinding.model.Formation;
import e.plass.acceuilwayfinding.model.Util;
import e.plass.acceuilwayfinding.model.ViewPageAdapter;

public class DetailFormationActivity extends AppCompatActivity {
    private Formation formation;
    private ImageView imageView;
    private TextView  textNameFormation,description;
    private TextView  textDescriptionFormation;
    private Toolbar toolbar;
   // private RecyclerView recyclerView;
   // private ArrayList<Ecole> ecoles;
   private Button cata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_formation);
        toolbar = findViewById(R.id.Toolbar_detail_formation);
        imageView = findViewById(R.id.imageView_detail_formation);
       // recyclerView = findViewById(R.id.RecyclerView_list_school_formation);
        description = findViewById(R.id.TextView_description_item_formation1);
        textNameFormation = findViewById(R.id.TextView_detail_formation_item);
        cata= findViewById(R.id.btn_catalogue);
        Context context = this;
        //ecoles = Util.getEcoles();
        //initRecycleView();
      cata.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

             /* Fragment fragment = new Fragment();
              FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
              transaction.replace(R.id.fragment_account, fragment);
              transaction.commit();*/

          }
      });

        Formation currenF = Util.getCurrentFormation();
        try {
            int id = this.getResources().getIdentifier(currenF.getImage(),"drawable",this.getPackageName());
            Glide.with(this)
                    .load(id)
                    .into(imageView);
        }catch (Exception ex){
            Log.d("imgFound", ex.getMessage());
        }


        textNameFormation.setText(currenF.getName());
        description.setText(currenF.getDescription());



        formation = Util.getCurrentFormation();
        setSupportActionBar(toolbar);
        toolbar.setTitle(currenF.getName());
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                finish();
                break;

        }
        return true;
    }


    /*public void initRecycleView(){
        CustumAdapter             custumAdapter             = new CustumAdapter(getApplicationContext(),ecoles);
        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(this,R.anim.layout_anim_slide);
       recyclerView.setAdapter(custumAdapter);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
    }

