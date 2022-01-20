package com.taxxib.enterprise.ui.activity.splash;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.User;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface SplashIView extends MvpView{
    void onSuccess(User user);
    void onError(Throwable e);
}
