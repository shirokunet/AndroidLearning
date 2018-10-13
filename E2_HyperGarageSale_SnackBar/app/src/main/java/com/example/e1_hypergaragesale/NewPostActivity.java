package com.example.e1_hypergaragesale;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);
    }

    public void newPostAdded(View v) {
        Snackbar.make(findViewById(R.id.myCoordinatorLayout), R.string.new_post_snackbar,
                Snackbar.LENGTH_SHORT).show();
    }
}
