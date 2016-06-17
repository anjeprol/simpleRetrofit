package com.prolan.retrofit;


import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Prolan on 17/06/2016.
 */
public interface MInterface {
    @GET("/users/mobilesiri")
    void getUser(Callback<Pojo> uscb);
}
