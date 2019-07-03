package e.plass.acceuilwayfinding.model;


import e.plass.acceuilwayfinding.MyData;
import e.plass.acceuilwayfinding.MyData2;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("Register_BLL.php")
    Call<User> Register(
            @Field("email") String email,
            @Field("password") String password
           // @Field("photo") String photo

    );


    @FormUrlEncoded
    @POST("Login_BLL.php")
    Call<User> Login(
            @Field("email") String email,
            @Field("password") String password
    );





}
