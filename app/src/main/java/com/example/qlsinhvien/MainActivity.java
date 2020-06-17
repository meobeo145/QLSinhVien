package com.example.qlsinhvien;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final String DATABASE_NAME = "QLSinhVien.sqlite";
    SQLiteDatabase database;

    ListView listView;
    ArrayList<SinhVien> list;
    AdapterSinhVien adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        readData();
    }

    private void addControls()  {
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<>();
        adapter = new AdapterSinhVien(this, list);
        listView.setAdapter(adapter);
    }

    private void  readData()  {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM sinh_vien", null);
        list.clear();
        for (int i = 0; i < cursor.getCount(); ++i)  {
            cursor.moveToPosition(i);
            String MSSV = cursor.getString(0);
            String ten = cursor.getString(1);
            String ngaysinh = cursor.getString(2);
            String email = cursor.getString(3);
            String diachi = cursor.getString(4);
            list.add(new SinhVien(MSSV, ten, ngaysinh, email, diachi));
        }
        adapter.notifyDataSetChanged();
    }

}
