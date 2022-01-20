package com.taxxib.enterprise.ui.activity.setting;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.AddressResponse;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface SettingsIView extends MvpView {

    void onSuccessAddress(Object object);
    void onSuccess(AddressResponse address);
    void onError(Throwable e);
}
