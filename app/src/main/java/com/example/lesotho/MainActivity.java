package com.example.lesotho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    myadapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new myadapter(this,getMyList());

    }
    private ArrayList<model>getMyList(){
        ArrayList<model>models=new ArrayList<>();


        model m=new model();
        m.setTitle("HA KOME CAVES");
        m.setDescription("desccription about caves");
        m.setImg(R.drawable.image1);
        models.add(m);

        model n=new model();
        m.setTitle("THABA BOSIU NATIONAL MONUMENT");
        m.setDescription("desccription about THABABOSIU");
        m.setImg(R.drawable.monument);
        models.add(n);

        model o=new model();
        m.setTitle("MAFIKA LITSUI");
        m.setDescription("desccription about MAFIKA LITSIU");
        m.setImg(R.drawable.image1);
        models.add(o);

        model p=new model();
        m.setTitle("MORIJA MUSEUM AND ARCHIVES");
        m.setDescription("desccription about MORIJA");
        m.setImg(R.drawable.museum);
        models.add(p);

        model q=new model();
        m.setTitle("SUBENG DINOSAUR FOOT PRINTS");
        m.setDescription("desccription about caves");
        m.setImg(R.drawable.footprint);
        models.add(q);

        model r=new model();
        m.setTitle("THE LION ROCK MOUNTAIN");
        m.setDescription("desccription about caves");
        m.setImg(R.drawable.lionrock);
        models.add(r);

        model s=new model();
        m.setTitle("SEAKA BRIDGE");
        m.setDescription("desccription about caves");
        m.setImg(R.drawable.seaka);
        models.add(s);






        return models;
    }
}