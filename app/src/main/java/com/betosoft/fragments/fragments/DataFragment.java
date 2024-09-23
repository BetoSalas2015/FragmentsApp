package com.betosoft.fragments.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.betosoft.fragments.R;

import java.util.zip.Inflater;

public class DataFragment extends Fragment {
    private EditText edtTexto;
    private Button btnEnviar;
    private DataListener dataListener;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            dataListener = (DataListener) context;
        } catch (ClassCastException ex) {
            throw new ClassCastException(context.toString() + " debe implementar DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container,false);
        edtTexto = view.findViewById(R.id.edtTexto);
        btnEnviar = view.findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoParaEnviar = edtTexto.getText().toString();
                dataListener.onDataSent(textoParaEnviar);
            }
        });
        return view;
    }

    public interface DataListener {
        void onDataSent(String data);
    }
}