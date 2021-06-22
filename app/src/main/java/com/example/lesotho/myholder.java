package com.example.lesotho;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myholder extends RecyclerView.ViewHolder implements View.OnClickListener{
    static ImageView mimgView;
    static TextView mtitle;
    static TextView mdesc;
    Context mcontext;


    public myholder(@NonNull View itemView) {
        super(itemView);
        this.mimgView=itemView.findViewById(R.id.image1);
        this.mtitle=itemView.findViewById(R.id.title1);
        this.mdesc=itemView.findViewById(R.id.description);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int position=getAdapterPosition();
        Toast.makeText(mcontext, "position"+position, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(mcontext,DetailsActivity.class);
        mcontext.startActivity(intent);


    }
}
