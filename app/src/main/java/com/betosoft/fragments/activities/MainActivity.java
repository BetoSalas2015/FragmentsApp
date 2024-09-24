package com.betosoft.fragments.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.betosoft.fragments.R;
import com.betosoft.fragments.fragments.DataFragment;
import com.betosoft.fragments.fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    private boolean isMultipanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMultipanel();
    }

    @Override
    public void onDataSent(String data) {
        if (isMultipanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            detailsFragment.handleText(data);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("text",data);
            startActivity(intent);
        }
    }

    private void setMultipanel() {
        isMultipanel = (getSupportFragmentManager().findFragmentById(R.id.detailFragment) != null);
    }
}