package com.clk.progress;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DialogMethods {

    public static void setWidth(Activity activity, Dialog dialog){
        DisplayMetrics metrics=activity.getResources().getDisplayMetrics();
        int w=metrics.widthPixels;

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout((w*9)/10, RelativeLayout.LayoutParams.WRAP_CONTENT);

    }

    public static void setAnimation(Activity activity, RelativeLayout layout){
        Animation anim = AnimationUtils.loadAnimation(activity, R.anim.custom_window);
        anim.reset();
        layout.clearAnimation();
        layout.startAnimation(anim);
    }

    public static void setAnimation(Activity activity, LinearLayout layout){
        Animation anim = AnimationUtils.loadAnimation(activity, R.anim.custom_window);
        anim.reset();
        layout.clearAnimation();
        layout.startAnimation(anim);
    }

    public static void setGravity(Dialog dialog , int gravity){
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();

        // gravity= Gravity.BOTTOM, Gravity.TOP vs
        wlp.gravity=gravity;

        // to make lightest background of dialog
        window.setAttributes(wlp);
    }
}
