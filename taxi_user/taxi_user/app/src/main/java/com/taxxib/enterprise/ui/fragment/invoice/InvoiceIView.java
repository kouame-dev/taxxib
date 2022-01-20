package com.taxxib.enterprise.ui.fragment.invoice;

import com.taxxib.enterprise.base.MvpView;
import com.taxxib.enterprise.data.network.model.Message;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface InvoiceIView extends MvpView{
    void onSuccess(Message message);
    void onError(Throwable e);
}
