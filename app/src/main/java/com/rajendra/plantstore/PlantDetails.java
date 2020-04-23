package com.rajendra.plantstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class PlantDetails extends AppCompatActivity {


    ImageView plantImage;

    TextView plantName, plantCat, plantSize, plantPrice, plantType, plantPlacement, plantPot, plantLayer, plantHeight, plantDim, plantDesc;

    String name, cat, size, price, type, placement, pot, layer, height, dim, desc, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_details);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        cat = intent.getStringExtra("cat");
        size = intent.getStringExtra("size");
        price = intent.getStringExtra("price");
        type = intent.getStringExtra("type");
        placement = intent.getStringExtra("placement");
        pot = intent.getStringExtra("pot");
        layer = intent.getStringExtra("layer");
        height = intent.getStringExtra("height");
        dim = intent.getStringExtra("dim");
        desc = intent.getStringExtra("desc");
        image = intent.getStringExtra("imgurl");

        plantName = findViewById(R.id.plant_name);
        plantCat = findViewById(R.id.plant_category);
        plantSize = findViewById(R.id.plant_size);
        plantPrice = findViewById(R.id.plant_price2);
        plantType = findViewById(R.id.plant_type);
        plantPlacement = findViewById(R.id.plant_placement);
        plantPot = findViewById(R.id.plant_pot);
        plantLayer = findViewById(R.id.plant_layer);
        plantHeight = findViewById(R.id.plant_height);
        plantDim = findViewById(R.id.plant_dim);
        plantDesc = findViewById(R.id.plant_description);
        plantImage = findViewById(R.id.plant_image2);

        plantName.setText(name);
        plantCat.setText(cat);
        plantSize.setText(size);
        plantPrice.setText("₹ "+price);
        plantType.setText(type);
        plantPlacement.setText(placement);
        plantPot.setText(pot);
        plantLayer.setText(layer);
        plantHeight.setText(height);
        plantDim.setText(dim);
        plantDesc.setText(desc);

        Glide.with(this).load(image).into(plantImage);

        // its complited now we will ad some transition fo make app very interactive and beautiful.

    }
}
