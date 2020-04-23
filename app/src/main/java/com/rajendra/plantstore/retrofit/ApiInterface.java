package com.rajendra.plantstore.retrofit;

import com.rajendra.plantstore.model.IndoorPlant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("data.json")
    Call<List<IndoorPlant>> getAllPlants();

}
