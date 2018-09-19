package com.example.asmaa.viewpager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.zip.Inflater;

public class AllFragment extends android.support.v4.app.Fragment {

    RecyclerView recyclerView;
    private static final String tag="tag";

    Adapterr adapter;

    ArrayList<Model> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragmentlayoout,container,false);

        initView(view);
        return view;
    }


  public static AllFragment getInstance(List<Model> list){
        AllFragment fragment=new AllFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable(tag, (Serializable) list);
        fragment.setArguments(bundle);
        return fragment;

  }

    private void initView(View view) {

        recyclerView=view.findViewById(R.id.reccle);
        list=new ArrayList<>();


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new Adapterr(list,getActivity());
        recyclerView.setAdapter(adapter);

        Bundle bundle=getArguments();

        if(bundle!=null){

            list.addAll((Collection<? extends Model>) bundle.getSerializable(tag));
            adapter.notifyDataSetChanged();
        }




    }
}
