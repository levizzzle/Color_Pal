package com.example.colorpal.ui.learn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.colorpal.databinding.FragmentDashboardBinding;
import com.example.colorpal.databinding.FragmentLearnBinding;

public class LearnFragment extends Fragment {

    private FragmentLearnBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LearnViewModel learnViewModel =
                new ViewModelProvider(this).get(LearnViewModel.class);

        binding = FragmentLearnBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLearn;
        learnViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}