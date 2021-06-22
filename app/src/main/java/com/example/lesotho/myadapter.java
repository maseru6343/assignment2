package com.example.lesotho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myholder> {
    Context mcontext;
    ArrayList<model> models;
    

    public myadapter(Context c, ArrayList<model> models) {
        this.mcontext =mcontext;
        this.models = models;
    }

    @NonNull

    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewGroup = null;
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_gallery,null);
        return new myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  myholder holder, int position) {

        myholder.mtitle.setText(models.get(position).getTitle());
        myholder.mdesc.setText(models.get(position).getDescription());
        myholder.mimgView.setImageResource(models.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
