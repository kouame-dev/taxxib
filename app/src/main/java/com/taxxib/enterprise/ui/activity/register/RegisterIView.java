package com.taxxib.enterprise.ui.activity.register;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.MyOTP;
import com.taxxib.enterprise.data.network.model.SettingsResponse;
import com.taxxib.enterprise.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface RegisterIView extends MvpView{
    void onSuccess(Token token);
    void onSuccess(MyOTP otp);
    void onError(Throwable e);
    void onSuccess(SettingsResponse response);
}
