package com.example.absensimanual;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MasukFragment extends Fragment {
    Button Masuk;
    public MasukFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MasukFragment newInstance(String param1, String param2) {
        MasukFragment fragment = new MasukFragment();
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
        View view = inflater.inflate(R.layout.fragment_masuk, container, false);
        Masuk = (Button) view.findViewById(R.id.masuk_btn);
        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}