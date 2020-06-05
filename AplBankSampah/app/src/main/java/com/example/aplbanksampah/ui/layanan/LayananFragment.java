package com.example.aplbanksampah.ui.layanan;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aplbanksampah.R;

public class LayananFragment extends Fragment {


    public static LayananFragment newInstance() {
        return new LayananFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layanan_fragment, container, false);
//        final TextView textView = root.findViewById(R.id.text_layanan);
        return root;
    }



}