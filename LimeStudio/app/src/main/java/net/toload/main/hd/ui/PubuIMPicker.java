package net.toload.main.hd.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import net.toload.main.hd.R;

import consts.Consts;

public class PubuIMPicker extends AlertDialog.Builder {

    private View mView;
    private AlertDialog mDialog;
    private Context mContext;
    private RadioGroup mKeyboardList;

    public PubuIMPicker(Context context) {
        super(context);

        mContext = context;

        mView = LayoutInflater.from(context).inflate(R.layout.pubu_dialog_template, null);

        setupIMPicker(mView);

        this.setCancelable(true);
        this.setView(mView);
    }

    private void setupIMPicker(View view) {
        mKeyboardList = view.findViewById(R.id.rg_keyboard_list);

        Button btnCancel = view.findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDialog != null) {
                    mDialog.dismiss();
                }
            }
        });
    }

    public void setSingleChoice(CharSequence[] items, int checkedItem, DialogInterface.OnClickListener listener) {
        if (mKeyboardList == null || mContext == null) {
            return;
        }

        int padding = (int) convertDpToPixel(16, mContext);

        for (int i = 0; i < items.length; i++) {
            CharSequence text = items[i];
            RadioButton radioButton = new RadioButton(mContext);

            radioButton.setTag(i);
            radioButton.setText(text);
            radioButton.setTextAppearance(mContext, android.R.style.TextAppearance_Large);
            radioButton.setPadding(padding, padding, padding, padding);

            if (i == checkedItem) {
                radioButton.setChecked(true);
            }

            mKeyboardList.addView(radioButton);
        }

        mKeyboardList.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (listener != null && mDialog != null) {
                    mDialog.dismiss();

                    RadioButton radioButton = radioGroup.findViewById(checkedId);
                    int index = (int) radioButton.getTag();

                    listener.onClick(null, index);
                }
            }
        });
    }

    private float convertDpToPixel(float dp, Context context){
        float px = dp * getDensity(context);
        return px;
    }

    private float getDensity(Context context){
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.density;
    }

    @Override
    public AlertDialog create() {
        if (mDialog == null) {
            AlertDialog dialog = super.create();
            dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            dialog.getWindow().setDimAmount(0);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            mDialog = dialog;
        }

        return mDialog;
    }
}
