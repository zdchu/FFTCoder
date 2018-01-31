package com.example.fftcoder;

/**
 * Created by 储振东 on 2018/1/30.
 */
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ButtonClickListener implements OnClickListener{
    //private Context c;
    public ButtonClickListener (Context c){
        this.c = c;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(c, "hello", Toast.LENGTH_SHORT).show();
    }
}
