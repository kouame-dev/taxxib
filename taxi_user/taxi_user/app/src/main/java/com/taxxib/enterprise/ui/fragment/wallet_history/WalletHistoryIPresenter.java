package com.taxxib.enterprise.ui.fragment.wallet_history;


import com.taxxib.enterprise.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface WalletHistoryIPresenter<V extends WalletHistoryIView> extends MvpPresenter<V> {
    void wallet();
}
