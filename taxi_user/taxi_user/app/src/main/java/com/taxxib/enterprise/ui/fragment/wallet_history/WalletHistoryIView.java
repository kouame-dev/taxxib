package com.taxxib.enterprise.ui.fragment.wallet_history;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.Wallet;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface WalletHistoryIView extends MvpView {
    void onSuccess(List<Wallet> walletList);
    void onError(Throwable e);
}
