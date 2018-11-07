package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.DatabaseDAO.SanPhamDAO;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Holder.SanPhamHolder;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model.SanPham;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.R;

import java.util.List;

public class NodeSanPham extends RecyclerView.Adapter<SanPhamHolder> {
    private Context context;
    private List<SanPham> sanPhamList;
    private SanPhamDAO sanPhamDAO;

    public NodeSanPham(Context context, List<SanPham> sanPhamList, SanPhamDAO sanPhamDAO) {
        this.context = context;
        this.sanPhamList = sanPhamList;
        this.sanPhamDAO = sanPhamDAO;
    }

    @NonNull
    @Override
    public SanPhamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardview1,parent,false);
        return new SanPhamHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanPhamHolder holder, int position) {
        SanPham sanPham= sanPhamList.get(position);
        holder.tvTenSP.setText(sanPham.getTenSanPham());
        holder.tvGiaSP.setText(sanPham.getGia()+"");


    }

    @Override
    public int getItemCount() {
        return sanPhamList.size();
    }
}
