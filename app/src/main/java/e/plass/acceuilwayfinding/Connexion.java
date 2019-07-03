package e.plass.acceuilwayfinding;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import e.plass.acceuilwayfinding.model.ApiClient;
import e.plass.acceuilwayfinding.model.ApiInterface;
import e.plass.acceuilwayfinding.model.User;
import retrofit2.Call;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class Connexion extends AppCompatActivity  {

    private static final int GOOGLE_SIGN = 123;
    private Button btnConnexion;
    private EditText EditTextEmail;
    private EditText EdiTextPassword;
    private ProgressDialog progressDialog;
    private Button btnFacebook;
    private Button btnTwitter;
    private Button btnGoogle;
    private ApiInterface apiInterface;
    GoogleSignInClient mGoogleSignInClient;

    ProgressBar mProgressBar;


    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        //btnGoogle = findViewById(R.id.btn_google);
        btnConnexion = findViewById(R.id.btn_SignIn);
        EditTextEmail = findViewById(R.id.email_connexion);
        EdiTextPassword = findViewById(R.id.password2);




        /*mFirebaseAuth = FirebaseAuth.getInstance();

        if (mFirebaseAuth.getCurrentUser() != null) {

            finish();
            startActivity(new Intent(getApplicationContext(), Profile.class));

        }


        progressDialog = new ProgressDialog(this);*/


        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(EditTextEmail.getText().toString(),EdiTextPassword.getText().toString());
            }
        });
    }

        public  void Login(String email,String password)
    {
       /* apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<User> call = apiInterface.Login(email,password);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(@NonNull  Call<User> call,@NonNull  Response<User> response) {
                int  st = response.body().getStatus();
                if (st==1)
                {
                    Toast.makeText(Connexion.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Connexion.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(@NonNull  Call<User> call, @NonNull Throwable t) {
                Toast.makeText(Connexion.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }*/
        }

    }







