package com.taxxib.enterprise.ui.activity.otp;

import com.taxxib.enterprise.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface OTPIPresenter<V extends OTPIView> extends MvpPresenter<V>{
    void sendOTP(Object obj);
    void sendVoiceOTP(Object obj);
}
