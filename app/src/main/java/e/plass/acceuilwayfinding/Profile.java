package e.plass.acceuilwayfinding;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.PointerIcon;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

import e.plass.acceuilwayfinding.LeveeFragment;
import e.plass.acceuilwayfinding.model.BottomNavigationViewHelper;
import e.plass.acceuilwayfinding.model.ParamAdapter;
import e.plass.acceuilwayfinding.model.Paramatre;
import e.plass.acceuilwayfinding.model.SearchAdapter;

import java.util.ArrayList;

import static e.plass.acceuilwayfinding.R.string.Close;

public class Profile extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView mMainNav;

    private HomeFragment homeFragment;
    private SchoolFragment schoolFragment;
    private AccountFragment accountFragment;
    private FormationFragment formationFragment;
    private SearchFragment searchFragment;
    private NavigationView navigationView;
    private LeveeFragment leveeFragment;
    private ImageView gif;

    private android.support.v7.widget.Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        //intitialisation
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        mMainNav = findViewById(R.id.bottomNavigationView_menu);
        gif = findViewById(R.id.imagesplash);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_menu);
         BottomNavigationViewHelper.disableShiftMode(mMainNav);

        navigationView.setNavigationItemSelectedListener(this);


        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(leveeFragment);
            }
        });

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setIcon(R.drawable.logoastel);

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




        homeFragment = new HomeFragment();
        accountFragment = new AccountFragment();
        formationFragment = new FormationFragment();
        schoolFragment = new SchoolFragment(this);
        searchFragment = new SearchFragment();
        leveeFragment = new LeveeFragment();






            //gestion de l'affichage du menu



            //Navigation
            mMainNav.setOnNavigationItemSelectedListener(menuItem -> {
                switch (menuItem.getItemId()){
                    case R.id.menu_item_home:{
                        setFragment(formationFragment);
                    }
                        return true;
                    case R.id.menu_item_school:{
                        setFragment(schoolFragment);
                    }
                        return true;
                    case R.id.menu_item_formation:
                        setFragment(homeFragment);
                        return true;
                    case R.id.menu_item_account:
                        setFragment(accountFragment);
                        return true;
                    /*case R.id.menu_item_funds:
                        setFragment(leveeFragment);
                        return true;*/
                    default:
                        return false;
                }
            });

            if(mMainNav.getSelectedItemId() == R.id.menu_item_home)
                setFragment(homeFragment);
            else if(mMainNav.getSelectedItemId() == R.id.menu_item_school)
                setFragment(schoolFragment);
            else if(mMainNav.getSelectedItemId() == R.id.menu_item_formation)
                setFragment(formationFragment);
            else if(mMainNav.getSelectedItemId() == R.id.menu_item_account)
                setFragment(accountFragment);
            else
                setFragment(searchFragment);

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
        fragmentTransaction.replace(R.id.frame_nav,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
       /* if(menuItem.getItemId() == R.id.prin_discon){
            Intent i = new Intent(Profile.this,Aceuil.class);
            startActivity(i);
            this.finish();
        }*/
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    
    public void to(String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
