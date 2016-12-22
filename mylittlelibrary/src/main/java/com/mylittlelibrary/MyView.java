package com.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Admin on 22-12-2016.
 */

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);

        initialize(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.myview, this);

        TextView title1 = (TextView) findViewById(R.id.title1);

    }

}