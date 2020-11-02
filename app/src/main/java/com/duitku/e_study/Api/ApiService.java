package com.duitku.e_study.Api;




import com.duitku.e_study.Model.json.JsonPeriod;
import com.duitku.e_study.Model.response.ResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface ApiService {



   @Headers("Content-Type: application/json")
   @POST("period")
    Call<ResponseData> requestGetPeriod(@Body JsonPeriod body);


}
