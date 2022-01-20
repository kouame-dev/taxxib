package com.taxxib.enterprise.ui.activity.login;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.ForgotResponse;
import com.taxxib.enterprise.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LoginIView extends MvpView{
    void onSuccess(Token token);
    void onSuccess(ForgotResponse object);
    void onError(Throwable e);
}
