package com.avinashdavid.trivialtrivia.UI;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avinashdavid.trivialtrivia.R;

/**
 * Created by avinashdavid on 12/1/16.
 */

public class FragmentGameplayInstructions extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_instructions_gameplay, container, false);

        return rootview;
    }
}
