package com.example.qlsinhvien;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class UpdateActivity extends AppCompatActivity {
    final String DATABASE_NAME = "QLSinhVien.sqlite";
    EditText edtMSSV, edtTen, edtNgaysinh, edtDiachi, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        //initUI();
    }

    /*private void initUI() {
        SQLiteDatabase database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM sinh_vien WHERE MSSV = ? ",new String[]{MS});
        cursor.moveToFirst();
        String MSSV = cursor.getString(0);
        String ten = cursor.getString(1);
        String ngaysinh = cursor.getString(2);
        String email = cursor.getString(3);
        String diachi = cursor.getString(4);

        edtMSSV.setText(MSSV);
        edtTen.setText(ten);
        edtNgaysinh.setText(ngaysinh);
        edtEmail.setText(email);
        edtDiachi.setText(diachi);

    }

    private void update(){
        String mssv = edtMSSV.getText().toString();
        String ten = edtTen.getText().toString();
        String ngaysinh = edtNgaysinh.getText().toString();
        String email = edtEmail.getText().toString();
        String diachi = edtDiachi.getText().toString();


        ContentValues contentValues = new ContentValues();
        contentValues.put("MSSV", mssv);
        contentValues.put("ten", ten);
        contentValues.put("ngaysinh", ngaysinh);
        contentValues.put("email", email);
        contentValues.put("diachi", diachi);

        SQLiteDatabase database = Database.initDatabase(this, "QLSinhVien.sqlite");
        database.update("sinh_vien", contentValues, "MSSV = ?", new String[] {mssv + ""});
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }*/

    private void cancel(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
