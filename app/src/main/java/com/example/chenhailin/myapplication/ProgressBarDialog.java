package com.example.chenhailin.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.KeyEvent;

/**
 * Created by chenhailin on 2017/12/20.
 */

public class ProgressBarDialog extends Dialog {
    public ProgressBarDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }

    @Override
    public void show() {
        super.show();
    }


    @Override
    public boolean onKeyDown(int keyCode, @NonNull KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
