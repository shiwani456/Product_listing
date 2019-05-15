package com.myapplication.productlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {
    private List<ProductListModel> productListModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ProductListAdapter(productListModelList,ProductListActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2,GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        ProductListModel productListModel = new ProductListModel(R.drawable.patratha, "Paranthas", "₹40");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.chaat, "Chaat", "₹20");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.butter_chicken, "Butter Chicken", "₹225");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.kebabs, "Kebabs", "₹295");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.chole_bhature, "Chole Bhature", "₹60");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.biryani, "Biryani", "₹200");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.nihari, "Nihari", "₹325");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.kathi_roll, "Kathi Rolls", "₹100");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.delhi_momos, "Momos", "₹80");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.delhi_kulfi, "Kulfi", "₹60");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.idlli, " Idli", "₹100");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.gulabjamun, "Gulab jaamun", "₹10");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.rajma, " Rajma", "₹105");
        productListModelList.add(productListModel);


        productListModel = new ProductListModel(R.drawable.nihari, "Nihari", "₹325");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.kathi_roll, "Kathi Rolls", "₹100");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.delhi_momos, "Momos", "₹80");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.delhi_kulfi, "Kulfi", "₹60");
        productListModelList.add(productListModel);


        productListModel = new ProductListModel(R.drawable.idlli, " Idli", "₹100");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.gulabjamun, "Gulab jaamun", "₹10");
        productListModelList.add(productListModel);

        productListModel = new ProductListModel(R.drawable.rajma, " Rajma", "₹105");
        productListModelList.add(productListModel);


        mAdapter.notifyDataSetChanged();
    }
}
