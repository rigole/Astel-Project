package e.plass.acceuilwayfinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class entre1 extends AppCompatActivity {
    TextView way,text;
    Button btn;
    CircleImageView mImageView;
    Animation smalbig,nothingcome,btnanime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entre1);
        way= findViewById(R.id.textwayfinding);
        btn= findViewById(R.id.button);
        text= findViewById(R.id.textdesc2);
        mImageView = findViewById(R.id.logo);



        smalbig= AnimationUtils.loadAnimation(this, R.anim.smallbig);
        nothingcome= AnimationUtils.loadAnimation(this, R.anim.nothingtocome);
        btnanime = AnimationUtils.loadAnimation(this, R.anim.btnanim);
        mImageView.startAnimation(smalbig);
        way.startAnimation(nothingcome);
        text.startAnimation(nothingcome);
        btn.startAnimation(btnanime);



       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent  i = new Intent(entre1.this,entree2.class);
               startActivity(i);
           }
       });
    }
}
