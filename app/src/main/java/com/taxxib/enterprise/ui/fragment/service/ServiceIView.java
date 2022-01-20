package com.taxxib.enterprise.ui.fragment.service;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.EstimateFare;
import com.taxxib.enterprise.data.network.model.RateCardResponse;
import com.taxxib.enterprise.data.network.model.Service;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface ServiceIView extends MvpView{
    void onSuccess(List<Service> serviceList);
    void onSuccess(RateCardResponse service);
    void onSuccess(EstimateFare estimateFare);
    void onError(Throwable e);
}
