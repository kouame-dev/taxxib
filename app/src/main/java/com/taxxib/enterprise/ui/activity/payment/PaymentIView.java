package com.taxxib.enterprise.ui.activity.payment;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.Card;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface PaymentIView extends MvpView{
    void onSuccess(Object card);
    void onSuccess(List<Card> cards);
    void onError(Throwable e);
}
