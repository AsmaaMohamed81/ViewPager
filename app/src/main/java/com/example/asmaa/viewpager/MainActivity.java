package com.example.asmaa.viewpager;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

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

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

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








        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.setTitle(getString(R.string.app_name1));
                    collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.colorAccent));
                    collapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.colorAccent));

                    isShow = true;
                } else if (isShow) {
                    collapsingToolbarLayout.setTitle(" ");
                    isShow = false;
                }
            }
        });


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
