package com.example.smart_stocks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Profile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

//        Button buttonSwitchLanguageEnglish = view.findViewById(R.id.button_switch_language_to_en);
//        buttonSwitchLanguageEnglish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Context context = LocaleHelper.setLocale(requireContext(), "en");
//            }
//        });
//    rgLanguage = view.findViewById(R.id.rg_language);
//    rbEnglish = view.findViewById(R.id.rb_english);
//    rbRussian = view.findViewById(R.id.rb_russian);
//
//    rgLanguage.SetOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener())
        return view;
    }
}