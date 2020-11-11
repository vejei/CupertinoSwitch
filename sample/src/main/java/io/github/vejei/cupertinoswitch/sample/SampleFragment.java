package io.github.vejei.cupertinoswitch.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;

public class SampleFragment extends Fragment {
    private static final String TAG = SampleFragment.class.getSimpleName();
    private static final String[] sampleNames = {
            "Basic sample",
            "Right to left (rtl) direction sample",
            "Programmatically sample"
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return sampleNames.length;
            }

            @Override
            public String getItem(int position) {
                return sampleNames[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(android.R.layout.simple_list_item_1,
                            parent, false);
                }
                TextView textView = convertView.findViewById(android.R.id.text1);
                textView.setText(getItem(position));
                return convertView;
            }
        });
        listView.setOnItemClickListener((parent, view1, position, id) -> {
            FragmentTransaction fragmentManager = Objects.requireNonNull(getActivity())
                    .getSupportFragmentManager().beginTransaction();

            switch (position) {
                case 0:
                    fragmentManager.replace(R.id.fragment_container, new BasicFragment());
                    break;
                case 1:
                    fragmentManager.replace(R.id.fragment_container, new RtlFragment());
                    break;
                case 2:
                    fragmentManager.replace(R.id.fragment_container, new ProgrammaticallyFragment());
                    break;
            }

            fragmentManager.addToBackStack(null);
            fragmentManager.commit();
        });
    }
}
