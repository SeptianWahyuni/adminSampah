package com.example.aplbanksampah.ui.akun;

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

public class AkunFragment extends Fragment {



    public static AkunFragment newInstance() {
        return new AkunFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_profil, container, false);
//        final TextView textView = root.findViewById(R.id.text_akun);
        return root;
    }



}