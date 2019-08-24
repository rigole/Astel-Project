package e.plass.acceuilwayfinding;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class ProduitInformatiqueActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private android.support.v7.widget.Toolbar toolbar;
    GridLayout mainGrid;
    private ImageView levee;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private SchoolFragment schoolFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit_informatique);
        mainGrid = findViewById(R.id.mainGridinformatique);
        setSingleEvent(mainGrid);
        toolbar = findViewById(R.id.toolbar);
        levee = findViewById(R.id.imagesplash);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        levee.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, LeveeDeFondActivity.class);
            startActivity(intent);
        });
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setIcon(R.drawable.logoastel);
        navigationView.setNavigationItemSelectedListener(this);
        //ToolBar define
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_hamburger_icons_plan_icons_plan);

        drawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }


    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.linearinfo,fragment);
        fragmentTransaction.commit();
    }


    private void setSingleEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(0);
        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, EcranActivity.class);
            startActivity(intent);
        });

        CardView cardView1 = (CardView) mainGrid.getChildAt(1);
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, ImprimenteActivity.class);
            startActivity(intent);
        });

        CardView cardView2 = (CardView) mainGrid.getChildAt(2);
        cardView2.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, LaptopActivity.class);
            startActivity(intent);
        });

        CardView cardView3 = (CardView) mainGrid.getChildAt(3);
        cardView3.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, DesktopActivity.class);
            startActivity(intent);
        });

        CardView cardView4 = (CardView) mainGrid.getChildAt(4);
        cardView4.setOnClickListener(v -> {
            Intent intent = new Intent(ProduitInformatiqueActivity.this, ScannerActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
