package com.taxxib.enterprise.ui.activity.forgot_password;


import com.taxxib.enterprise.base.BasePresenter;
import com.taxxib.enterprise.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class ForgotPasswordPresenter<V extends ForgotPasswordIView> extends BasePresenter<V> implements ForgotPasswordIPresenter<V> {


    @Override
    public void resetPassword(HashMap<String, Object> parms) {
        Observable modelObservable = APIClient.getAPIClient().resetPassword(parms);

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Object) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
