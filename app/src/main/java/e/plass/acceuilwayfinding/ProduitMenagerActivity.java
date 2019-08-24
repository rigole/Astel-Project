package e.plass.acceuilwayfinding;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.ImageView;

import e.plass.acceuilwayfinding.model.ElectromenagerActivity;
import e.plass.acceuilwayfinding.model.MachineAdapter;

public class ProduitMenagerActivity extends AppCompatActivity {
    private android.support.v7.widget.Toolbar toolbar;
    GridLayout mainGrid;
    private ImageView levee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit_menager);
        mainGrid = findViewById(R.id.mainGridmenager);
        setSingleEvent(mainGrid);
        toolbar = findViewById(R.id.toolbar);
        levee = findViewById(R.id.imagesplash);
        levee.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this, LeveeDeFondActivity.class);
            startActivity(intent);
        });
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setIcon(R.drawable.logoastel);

        //ToolBar define
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_hamburger_icons_plan_icons_plan);
    }

    private void setSingleEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(0);
        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this, AspirateurActivity.class);
            startActivity(intent);
        });

        CardView cardView1 = (CardView) mainGrid.getChildAt(1);
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this, CuisiniereActivity.class);
            startActivity(intent);
        });

        CardView cardView2 = (CardView) mainGrid.getChildAt(2);
        cardView2.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this,FroidActivity.class);
            startActivity(intent);
        });

        CardView cardView3 = (CardView) mainGrid.getChildAt(3);
        cardView3.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this, MachineLaverActivity.class);
            startActivity(intent);
        });

        CardView cardView4 = (CardView) mainGrid.getChildAt(4);
        cardView4.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitMenagerActivity.this, TelevisionActivity.class);
            startActivity(intent);
        });

    }
}
