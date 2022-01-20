package com.taxxib.enterprise.ui.activity.rental;


import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.EstimateFare;
import com.taxxib.enterprise.data.network.model.Service;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface RentBookingIView extends MvpView {

    void onSuccess(List<Service> services);

    void onSuccessRequest(Object object);

    void onSuccess(EstimateFare estimateFare);

}
