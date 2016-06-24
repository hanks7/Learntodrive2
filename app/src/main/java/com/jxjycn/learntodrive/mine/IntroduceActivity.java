package com.jxjycn.learntodrive.mine;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class IntroduceActivity extends BaseActivity {


    @Bind(R.id.introduce_edt_input)
    EditText vEdtInput;
    @Bind(R.id.introduce_edt_input_count)
    TextView vEdtInputCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);

        ButterKnife.bind(this);


        setTitleonActivityResult(translateRstring(R.string.nickname), new Runnable() {
            @Override
            public void run() {
                gobackForResult();
            }
        });

        vEdtInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            ;
                vEdtInputCount.setText(vEdtInput.getText().toString().length()+"/20");
            }
        });
    }

    private void gobackForResult() {
        String str = vEdtInput.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra(translateRstring(R.string.introduce), str);
        setResult(103, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        gobackForResult();
        super.onBackPressed();
    }
}
