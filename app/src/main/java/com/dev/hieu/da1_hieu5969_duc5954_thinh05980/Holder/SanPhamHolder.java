package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.R;

public class SanPhamHolder extends RecyclerView.ViewHolder {
    public  TextView tvTenSP,tvGiaSP;
    public  Button btnThemSP;
    public ImageView imgRe;

    public SanPhamHolder(View itemView) {
        super(itemView);
        imgRe = itemView.findViewById(R.id.imgRe);
       tvGiaSP = itemView.findViewById(R.id.tvGia);
       tvTenSP = itemView.findViewById(R.id.tvTenSP);
       btnThemSP = itemView.findViewById(R.id.btnThemVaoGio);
    }

}
