package com.example.staticfragmentex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frg1 extends Fragment {

    public Frg1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c,
                             Bundle savedInstanceState) {
       
        return i.inflate(R.layout.fragment_frg1, c, false);
    }
}
