package io.github.vejei.cupertinoswitch.sample;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import io.github.vejei.cupertinoswitch.CupertinoSwitch;

public class BasicFragment extends Fragment {
    private static final String TAG = BasicFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_basic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CupertinoSwitch cupertinoSwitch = view.findViewById(R.id.cupertino_switch);
        cupertinoSwitch.setOnStateChangeListener(new CupertinoSwitch.OnStateChangeListener() {
            @Override
            public void onChanged(CupertinoSwitch view, boolean checked) {
                Toast.makeText(getContext(), "onChanged", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwitchOn(CupertinoSwitch view) {
                Log.d(TAG, "onSwitchOn");
            }

            @Override
            public void onSwitchOff(CupertinoSwitch view) {
                Log.d(TAG, "onSwitchOff");
            }
        });
    }
}
