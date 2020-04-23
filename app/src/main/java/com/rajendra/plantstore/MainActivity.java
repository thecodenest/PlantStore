package com.rajendra.plantstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.rajendra.plantstore.adapter.IndoorPlantsAdapter;
import com.rajendra.plantstore.adapter.PotsAdapter;
import com.rajendra.plantstore.model.IndoorPlant;
import com.rajendra.plantstore.model.Pot;
import com.rajendra.plantstore.model.Recommended;
import com.rajendra.plantstore.retrofit.ApiInterface;
import com.rajendra.plantstore.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface anInterface;
    RecyclerView plantRecyclerView, potRecyclerView;
    private IndoorPlantsAdapter indoorPlantsAdapter;
    private PotsAdapter potsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

        Call<List<IndoorPlant>> call = anInterface.getAllPlants();
        call.enqueue(new Callback<List<IndoorPlant>>() {
            @Override
            public void onResponse(Call<List<IndoorPlant>> call, Response<List<IndoorPlant>> response) {

                List<IndoorPlant> s = response.body();
                Log.d("data", s.toString());

                // here you can see we have successfully fetched data from server
                // now we need to set this data to recyclerview adapter.

                getPlants(s.get(0).getRecommended());
                //lets run
                //i think my internet is too slow
                //wait

                getPots(s.get(0).getPots());

                //its done.

            }

            @Override
            public void onFailure(Call<List<IndoorPlant>> call, Throwable t) {

            }
        });

    }

    private  void getPlants(List<Recommended> recommendedList){

        plantRecyclerView = findViewById(R.id.plant_recycler);
        indoorPlantsAdapter = new IndoorPlantsAdapter(this, recommendedList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        plantRecyclerView.setLayoutManager(layoutManager);
        plantRecyclerView.setAdapter(indoorPlantsAdapter);
    }

    private  void getPots(List<Pot> potList){

        potRecyclerView = findViewById(R.id.pot_recycler);
        potsAdapter = new PotsAdapter(this, potList);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        gridLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        potRecyclerView.setLayoutManager(gridLayoutManager);
        potRecyclerView.setAdapter(potsAdapter);
    }
}


// lets import some image assets and font

// lets see our json data
// lets make a model class for data
// lets import retrofit dependency for network call
// now we are going to add model class
// lets create a recycler adapter
// lets create a recyclerview row item
//Now lets setup for retrofit

// again we need a adapetr for pots recycler view
// lets do it fast