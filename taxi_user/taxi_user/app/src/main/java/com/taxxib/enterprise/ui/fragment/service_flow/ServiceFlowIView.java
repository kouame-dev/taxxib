package com.taxxib.enterprise.ui.fragment.service_flow;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.DataResponse;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface ServiceFlowIView extends MvpView{
    void onSuccess(DataResponse dataResponse);
    void onError(Throwable e);
}
