package com.mrlexcoder.recyclerview;

import static com.mrlexcoder.recyclerview.R.id.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.mrlexcoder.recyclerview.Adaptors.PhotosAdaptor;
import com.mrlexcoder.recyclerview.Models.PhotosModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList <PhotosModel> list = new ArrayList<>();
        list.add(new PhotosModel(R.drawable.bouquet_pink,"Pink Bouquet"));
        list.add(new PhotosModel(R.drawable.environmental_green,"environmental_green"));
        list.add(new PhotosModel(R.drawable.fantasy_black,"fantasy_black"));
        list.add(new PhotosModel(R.drawable.flower_blue,"flower_blue"));
        list.add(new PhotosModel(R.drawable.poppies_red,"poppies_red"));
        list.add(new PhotosModel(R.drawable.tree_sky,"tree_sky"));

        PhotosAdaptor adaptor = new PhotosAdaptor(list,this);
        recyclerView.setAdapter(adaptor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }
}