package com.betosoft.fragments.activities;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

import com.betosoft.fragments.R;
import com.betosoft.fragments.fragments.DataFragment;
import com.betosoft.fragments.fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDataSent(String data) {
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        detailsFragment.handleText(data);
    }
}