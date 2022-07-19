package com.example.qlsvandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar,menu);
        MenuItem.OnActionExpandListener onActionExpandListener = new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return false;
            }
        };
        RecyclerView studentList = (RecyclerView) findViewById(R.id.studentlist);
        studentList.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Student> allStudents = getAllStudent();
        studentList.setAdapter(new MyAdapter(this,allStudents));
        return super.onCreateOptionsMenu(menu);
    }
    public ArrayList<Student> getAllStudent(){
        // get student from storage
         ArrayList<Student> st = new ArrayList<Student>();
        Student std1,std2;
        std1 = new Student("123","kien","kien@gmail", "3/6");
        std2 = new Student("123","kien","kien@gmail", "3/6");
        st.add(std1);
        st.add(std2);
        return st;

    }
}