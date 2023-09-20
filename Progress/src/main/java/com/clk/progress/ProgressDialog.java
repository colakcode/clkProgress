package com.clk.progress;

import android.app.Activity;
import android.app.Dialog;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class ProgressDialog extends Activity {

    public static Dialog dialog;
    public static TextView textView;

    public static void show(final Activity activity, String text){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        CircularProgress circularProgress=new CircularProgress(activity);
        layoutProgress.addView(circularProgress);

        textView=dialog.findViewById(R.id.textView);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, Gravity.BOTTOM);

        dialog.show();
    }

    public static void show(final Activity activity, CircularProgress circularProgress, String text){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        layoutProgress.addView(circularProgress);
        dialog.setCanceledOnTouchOutside(false);

        textView=dialog.findViewById(R.id.textView);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, Gravity.BOTTOM);

        dialog.show();
    }

    public static void show(final Activity activity, CircularProgress circularProgress, String text, int backgroundColor, int textColor){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        CardView cardView=dialog.findViewById(R.id.cardView);
        cardView.setCardBackgroundColor(backgroundColor);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        circularProgress.setBodyColor(backgroundColor);
        layoutProgress.addView(circularProgress);

        textView=dialog.findViewById(R.id.textView);
        textView.setTextColor(textColor);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, Gravity.BOTTOM);

        dialog.show();
    }

    public static void show(final Activity activity, CircularProgress circularProgress, String text, int backgroundColor, int textColor, int gravity){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        CardView cardView=dialog.findViewById(R.id.cardView);
        cardView.setCardBackgroundColor(backgroundColor);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        circularProgress.setBodyColor(backgroundColor);
        layoutProgress.addView(circularProgress);

        textView=dialog.findViewById(R.id.textView);
        textView.setTextColor(textColor);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, gravity);

        dialog.show();
    }

    public static void show(final Activity activity, String text, int backgroundColor, int textColor){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        CardView cardView=dialog.findViewById(R.id.cardView);
        cardView.setCardBackgroundColor(backgroundColor);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        CircularProgress circularProgress=new CircularProgress(activity);
        circularProgress.setBodyColor(backgroundColor);
        layoutProgress.addView(circularProgress);

        textView=dialog.findViewById(R.id.textView);
        textView.setTextColor(textColor);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, Gravity.BOTTOM);

        dialog.show();
    }

    public static void show(final Activity activity, String text, int backgroundColor, int textColor, int gravity){
        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_progress);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutMain);
        CardView cardView=dialog.findViewById(R.id.cardView);
        cardView.setCardBackgroundColor(backgroundColor);
        LinearLayout layoutProgress=dialog.findViewById(R.id.layoutProgress);
        CircularProgress circularProgress=new CircularProgress(activity);
        circularProgress.setBodyColor(backgroundColor);
        layoutProgress.addView(circularProgress);

        textView=dialog.findViewById(R.id.textView);
        textView.setTextColor(textColor);
        textView.setText(text);

        DialogMethods.setAnimation(activity, layoutMain);
        DialogMethods.setWidth(activity, dialog);
        DialogMethods.setGravity(dialog, gravity);

        dialog.show();
    }

    public static TextView getTextView(){
        return textView;
    }

    public static void dissmiss(){
        if(dialog!=null) dialog.dismiss();
    }
}
