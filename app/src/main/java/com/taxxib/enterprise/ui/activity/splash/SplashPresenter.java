package com.taxxib.enterprise.ui.activity.splash;

import com.taxxib.enterprise.base.BasePresenter;
import com.taxxib.enterprise.data.network.APIClient;
import com.taxxib.enterprise.data.network.model.User;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class SplashPresenter<V extends SplashIView> extends BasePresenter<V> implements SplashIPresenter<V> {
    @Override
    public void profile() {
        Observable modelObservable = APIClient.getAPIClient().profile();
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
