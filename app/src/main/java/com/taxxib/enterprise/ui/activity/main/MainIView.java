package com.taxxib.enterprise.ui.activity.main;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.DataResponse;
import com.taxxib.enterprise.data.network.model.Provider;
import com.taxxib.enterprise.data.network.model.SettingsResponse;
import com.taxxib.enterprise.data.network.model.User;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface MainIView extends MvpView{
    void onSuccess(User user);
    void onSuccess(DataResponse dataResponse);
    void onSuccessLogout(Object object);
    void onSuccess(List<Provider> objects);
    void onError(Throwable e);
    void onSuccess(SettingsResponse response);
}
