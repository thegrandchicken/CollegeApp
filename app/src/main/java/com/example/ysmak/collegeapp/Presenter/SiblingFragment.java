package com.example.ysmak.collegeapp.Presenter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ysmak.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class SiblingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_sibling, container, false);

        TextView firstName = (TextView) rootView.findViewById(R.id.first_name);
        TextView lastName = (TextView) rootView.findViewById(R.id.last_name);

        return rootView;
    }
}
