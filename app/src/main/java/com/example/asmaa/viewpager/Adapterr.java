package com.example.asmaa.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adapterr extends RecyclerView.Adapter<Adapterr.Holderr> {


    ArrayList<Model> list;
    Context context;

    public Adapterr(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new Holderr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holderr holder, int position) {

        holder.BindData(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  Holderr extends RecyclerView.ViewHolder {

        TextView text1,text2;
        public Holderr(View itemView) {
            super(itemView);

            text1=itemView.findViewById(R.id.text1);
            text2=itemView.findViewById(R.id.text2);
        }

        public void BindData(Model model){

            text1.setText(model.getTitle());
            text2.setText(model.getCost());

        }
    }
}
