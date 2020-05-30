package com.ds.pidgin;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    private Context context;

    public WebAppInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
