package com.jxjycn.learntodrive.home.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jxjycn.learntodrive.R;

/**
 * Created by hanks7 on 2016/6/15.
 */
public class EnterFrament extends Fragment {
   private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_enter,null);
        return view;
    }
}
