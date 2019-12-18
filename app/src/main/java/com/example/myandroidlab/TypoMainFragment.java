package com.example.myandroidlab;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TypoMainFragment extends Fragment {


    @BindView(R.id.display4)
    TextView display4View;

    @BindView(R.id.headline)
    TextView headlineView;

    Typeface courgette;

    public TypoMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_typo_main, container, false);
        ButterKnife.bind(this, view);
        /*
        display4View = (TextView)getActivity().findViewById(R.id.display4);
        headlineView = (TextView)getActivity().findViewById(R.id.headline);
         */

        display4View.setTypeface(courgette);
        headlineView.setTypeface(courgette);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        courgette = Typeface.createFromAsset(getActivity().getAssets(), "Courgette-Regular.ttf");
    }
}
