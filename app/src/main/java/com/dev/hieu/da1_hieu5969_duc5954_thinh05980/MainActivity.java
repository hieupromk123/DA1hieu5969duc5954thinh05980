package com.dev.hieu.da1_hieu5969_duc5954_thinh05980;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Adapter.NodeSanPham;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Database.DataManager;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.DatabaseDAO.SanPhamDAO;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private List<SanPham> sanPhamList;
    private SanPhamDAO sanPhamDAO;
    private DataManager dataManager;
    private NodeSanPham nodeSanPham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        dataManager = new DataManager(this);
        sanPhamDAO = new SanPhamDAO(dataManager);

        AddRecyclerview();
    }
    void AnhXa() {

        recyclerView = findViewById(R.id.recyclerViewMain);
        gridLayoutManager = new GridLayoutManager(this,2);
        sanPhamList = new ArrayList<>();
        sanPhamList.clear();
    }
    void AddRecyclerview() {


        sanPhamList = sanPhamDAO.getAllSanPham();
        nodeSanPham = new NodeSanPham(this,sanPhamList,sanPhamDAO);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(nodeSanPham);
    }
}
