package com.example.asmaa.viewpager;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tab;

    MyPagerAdapter pagerAdapter;
    CollapsingToolbarLayout collapsingToolbarLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        tab = findViewById(R.id.tab);
        pager = findViewById(R.id.pager);
        tab.setupWithViewPager(pager);

        AllFragment fragment1 = AllFragment.getInstance(getlistdata1());
        AllFragment fragment2 = AllFragment.getInstance(getlistdata2());
        AllFragment fragment3 = AllFragment.getInstance(getlistdata3());


        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(fragment1);
        pagerAdapter.addFragment(fragment2);
        pagerAdapter.addFragment(fragment3);

        pagerAdapter.addTitle("list");
        pagerAdapter.addTitle("dfjkdfd");
        pagerAdapter.addTitle("sdsfdfd");


        pager.setAdapter(pagerAdapter);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        collapsingToolbarLayout.setTitle("djkskdjs");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));




    }


    private List<Model> getlistdata1() {
        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));

        return list;

    }

    private List<Model> getlistdata2() {
        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));

        return list;

    }

    private List<Model> getlistdata3() {
        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));

        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));
        list.add(new Model("Asmaa", "200"));

        return list;

    }
}
