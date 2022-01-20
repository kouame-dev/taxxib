package com.taxxib.enterprise.ui.activity;

import android.webkit.WebView;

import com.taxxib.enterprise.user.BuildConfig;
import com.taxxib.enterprise.user.R;
import com.taxxib.enterprise.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PrivacyActivity extends BaseActivity {

    @BindView(R.id.web_view)
    WebView webView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_privacy;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        webView.loadUrl(BuildConfig.BASE_URL + "privacy");

    }
}
