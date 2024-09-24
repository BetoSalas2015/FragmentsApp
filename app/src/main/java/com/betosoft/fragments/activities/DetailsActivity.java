package com.betosoft.fragments.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.betosoft.fragments.R;
import com.betosoft.fragments.fragments.DetailsFragment;

public class DetailsActivity extends AppCompatActivity {
    private String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null) {
            texto = getIntent().getStringExtra("text");
        }
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        detailsFragment.handleText(texto);
    }
}