package com.example.staticfragmentex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frg2 extends Fragment {


    public Frg2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return i.inflate(R.layout.fragment_frg2, c, false);
    }
}