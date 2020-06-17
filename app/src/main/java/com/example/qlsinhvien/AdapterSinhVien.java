package com.example.qlsinhvien;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSinhVien extends BaseAdapter {
    Activity context;
    ArrayList<SinhVien> list;

    public AdapterSinhVien(Context context, ArrayList<SinhVien> list) {
        this.context = (Activity) context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listview_row, null);
        //ImageView imgAnhDD = (ImageView) row.findViewById(R.id.imgAnhDD);
        TextView txtMSSV = (TextView) row.findViewById(R.id.txt_mssv);
        TextView txtTen = (TextView) row.findViewById(R.id.txt_ten);
        TextView txtNgaySinh = (TextView) row.findViewById(R.id.txt_ngaysinh);
        TextView txtEmail = (TextView) row.findViewById(R.id.txt_email);
        TextView txtDiaChi = (TextView) row.findViewById(R.id.txt_diachi);
        Button btnSua = (Button) row.findViewById(R.id.btn_sua);
        Button btnXoa = (Button) row.findViewById(R.id.btn_xoa);

        final SinhVien sinhVien = list.get(position);
        txtMSSV.setText(sinhVien.MSSV);
        txtTen.setText(sinhVien.ten);
        txtNgaySinh.setText(sinhVien.ngaysinh);
        txtEmail.setText(sinhVien.email);
        txtDiaChi.setText(sinhVien.diachi);

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("MSSV", sinhVien.MSSV);
                context.startActivity(intent);
            }
        });

        return row;
    }
}