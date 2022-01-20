package com.taxxib.enterprise.ui.activity.location_pick;

import com.taxxib.enterprise.base.BasePresenter;
import com.taxxib.enterprise.data.network.APIClient;
import com.taxxib.enterprise.data.network.model.AddressResponse;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class LocationPickPresenter<V extends LocationPickIView> extends BasePresenter<V> implements LocationPickIPresenter<V> {

    @Override
    public void address() {
        Observable modelObservable = APIClient.getAPIClient().address();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((AddressResponse) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
