package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.csaper6.collegeapp.Model.Guardian;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class GuardianFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        //call the superclass and to the stuff
        super.onCreateView(inflater, container, savedInstanceState);

        //create a rootView to inflate fragment's layout
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

        //Wire widgets
        EditText editFirstName = (EditText) rootView.findViewById(R.id.guardian_first_name);
        EditText editLastName = (EditText) rootView.findViewById(R.id.guardian_last_name);
        EditText editOccupation = (EditText) rootView.findViewById(R.id.guardian_occupation);

        //get information from the model layer
        Guardian g = new Guardian("Darth", "Maul", "Mauling");

        //put the information in the view layer
        //set the text for your editTexts with the info you get from the object you made
        editFirstName.setText(g.getFirstName());
        editLastName.setText(g.getLastName());
        editOccupation.setText(g.getOccupation());

        return rootView;

    }
}
