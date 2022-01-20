package com.taxxib.enterprise.ui.fragment.book_ride;

import com.taxxib.enterprise.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface BookRideIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
