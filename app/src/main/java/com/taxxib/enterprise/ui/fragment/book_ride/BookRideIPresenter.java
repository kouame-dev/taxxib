package com.taxxib.enterprise.ui.fragment.book_ride;

import com.taxxib.enterprise.base.MvpPresenter;

import java.util.HashMap;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface BookRideIPresenter<V extends BookRideIView> extends MvpPresenter<V> {
    void rideNow(HashMap<String, Object> obj);
}
