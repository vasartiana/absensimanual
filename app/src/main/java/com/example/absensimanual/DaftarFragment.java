package com.example.absensimanual;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DaftarFragment extends Fragment {
    Button Daftar;
    public DaftarFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static DaftarFragment newInstance(String param1, String param2) {
        DaftarFragment fragment = new DaftarFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daftar, container, false);
        Daftar = (Button) view.findViewById(R.id.daftar_btn);
        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}