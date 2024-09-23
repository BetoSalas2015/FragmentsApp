package com.betosoft.fragments.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betosoft.fragments.R;

public class DetailsFragment extends Fragment {
    private TextView txtMensaje;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        txtMensaje = view.findViewById(R.id.txtMensaje);
        return view;
    }

    public void handleText(String texto) {
        txtMensaje.setText(texto);
    }
}