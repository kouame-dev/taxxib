package com.taxxib.enterprise.ui.activity.card;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.Card;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CardsIView extends MvpView{
    void onSuccess(List<Card> cardList);
    void onError(Throwable e);
}
