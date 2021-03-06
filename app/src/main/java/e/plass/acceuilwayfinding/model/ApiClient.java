package e.plass.acceuilwayfinding.model;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiClient {

    private static Retrofit retrofit;
    private static final String BASE_URL="https://astelmobile.000webhostapp.com/ServicesAstel/";

    public static Retrofit getApiClient()
    {
        if (retrofit==null)
        {
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL).
                            addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
