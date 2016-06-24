package com.jxjycn.learntodrive.mine;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ReallyNameActivity extends BaseActivity {
    @Bind(R.id.nick_name_edt_input)
    EditText vEdtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nick_name);
        ButterKnife.bind(this);
        setTitleonActivityResult(translateRstring(R.string.reallyname), new Runnable() {
            @Override
            public void run() {
                gobackForResult();
            }
        });


    }

    private void gobackForResult() {
        String str = vEdtInput.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra(translateRstring(R.string.reallyname), str);
        setResult(102, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        gobackForResult();
        super.onBackPressed();
    }
}
