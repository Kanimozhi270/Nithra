package com.example.nithra;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

public class Fragmentadapter extends FragmentStateAdapter {
    List<Fragment> frahgmentlist;
    public Fragmentadapter(FragmentActivity fm, List<Fragment> frahgmentlist) {
        super(fm);
        this.frahgmentlist = frahgmentlist;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return frahgmentlist.get(position);
    }

    @Override
    public int getItemCount() {
        return frahgmentlist.size();
    }
}
