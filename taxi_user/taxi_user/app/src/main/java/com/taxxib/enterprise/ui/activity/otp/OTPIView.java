package com.taxxib.enterprise.ui.activity.otp;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.MyOTP;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface OTPIView extends MvpView{
    void onSuccess(MyOTP otp);
    void onError(Throwable e);
}
