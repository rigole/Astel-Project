package e.plass.acceuilwayfinding;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


import e.plass.acceuilwayfinding.model.ApiClient;
import e.plass.acceuilwayfinding.model.ApiInterface;
import e.plass.acceuilwayfinding.model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Inscription extends AppCompatActivity  {
    private ApiInterface apiInterface;
    private Button btnInscription;
    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private ProgressBar loading;
    //private static String URL_REGIST=" http://192.168.1.100/localhost/register.php";
   // private Button btnInscriptionGoogle;

    //private ProgressDialog mProgressDialog;
    //private FirebaseAuth mFirebaseAuth;
    //GoogleSignInClient mGoogleSignInClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        btnInscription = findViewById(R.id.btn_sign_up);
        email = findViewById(R.id.TxtEmail);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.passwordhint);


        btnInscription.setOnClickListener(v -> {
            Register(email.getText().toString(), password.getText().toString());
        });


    }


        public  void Register (String email,String password)
        {
           /* apiInterface= ApiClient.getApiClient().create(ApiInterface.class);
            Call<User> call = apiInterface.Register(email,password);
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(@NonNull  Call<User> call, @NonNull  Response<User> response) {
                    int  st = response.body().getStatus();
                    if (st==1)
                    {
                        Toast.makeText(Inscription.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        /*Intent i = new Intent(Inscription.this,Profile.class);
                        startActivity(i);
                        finish();

                    }
                    else
                    {

                        Toast.makeText(Inscription.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(@NonNull  Call<User> call, @NonNull Throwable t) {
                    Toast.makeText(Inscription.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();


                }
            });*/

        }




}









