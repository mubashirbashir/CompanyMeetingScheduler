package in.lifeclicks.companymeetingschedule;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {


    String BASE_URL = "https://fathomless-shelf-5846.herokuapp.com/api/";

   @GET("schedule")
    Call<List<Meeting>> getMeetings( @Query("date") String data);
}