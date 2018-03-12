package br.usjt.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/*
@author Vinicius Maciel
@ra 816117960
*/
public class DialogActivity extends Activity {
    /*
    @author Vinicius Maciel
    @ra 816117960
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    /*
    @author Vinicius Maciel
    @ra 816117960
    */
    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}

