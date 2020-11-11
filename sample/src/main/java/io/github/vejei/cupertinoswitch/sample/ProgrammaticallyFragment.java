package io.github.vejei.cupertinoswitch.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import io.github.vejei.cupertinoswitch.CupertinoSwitch;

public class ProgrammaticallyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_programmatically, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button addButton = view.findViewById(R.id.button_add_view);
        LinearLayout rootView = view.findViewById(R.id.root);
        addButton.setOnClickListener((v) -> {
            CupertinoSwitch cupertinoSwitch = new CupertinoSwitch(getContext());
            cupertinoSwitch.setTrackOffColor(Color.parseColor("#dddddd"));
            cupertinoSwitch.setTrackOnColor(getResources().getColor(R.color.purple_500));
            cupertinoSwitch.setChecked(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            cupertinoSwitch.setLayoutParams(layoutParams);
            rootView.addView(cupertinoSwitch);
        });
    }
}
