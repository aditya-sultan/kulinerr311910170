package com.narasatya.kulinerr311910170;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CrudFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View myView = inflater.inflate(R.layout.fragment_crud, container, false);
                WebView myWebView = myView.findViewById(R.id.wv_web);
                myWebView.loadUrl("https://www.google.com");

                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                // inflate the layout for this fragment
        return myView;
    }
}