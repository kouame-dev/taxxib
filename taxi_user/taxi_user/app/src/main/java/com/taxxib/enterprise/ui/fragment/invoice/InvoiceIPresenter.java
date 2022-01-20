package com.taxxib.enterprise.ui.fragment.invoice;

import com.taxxib.enterprise.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface InvoiceIPresenter<V extends InvoiceIView> extends MvpPresenter<V> {
    void payment(Integer requestId);
}
