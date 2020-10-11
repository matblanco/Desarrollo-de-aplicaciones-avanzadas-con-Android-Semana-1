package semana1.curso3.coursera.restApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import semana1.curso3.coursera.restApi.model.PetProfileResponse;

public interface Endpoints {

    @GET(Constants.URL_GET_SEARCH_USER)
    Call<PetProfileResponse> getSearch(@Query("q") String q, @Query("access_token") String access_token);

    @GET(Constants.URL_GET_RECENT_MEDIA_USER_ID)
    Call<PetProfileResponse> getRecentMedia(@Path("user_id") String user_id);

}