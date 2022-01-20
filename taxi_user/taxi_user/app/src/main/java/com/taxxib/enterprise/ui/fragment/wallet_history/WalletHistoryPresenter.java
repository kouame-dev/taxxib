package com.taxxib.enterprise.ui.fragment.wallet_history;


import com.taxxib.enterprise.base.BasePresenter;
import com.taxxib.enterprise.data.network.APIClient;
import com.taxxib.enterprise.data.network.model.Wallet;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class WalletHistoryPresenter<V extends WalletHistoryIView> extends BasePresenter<V> implements WalletHistoryIPresenter<V> {


    @Override
    public void wallet() {
        Observable modelObservable = APIClient.getAPIClient().wallet();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<Wallet>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
