package com.taxxib.enterprise.ui.fragment.past_trip;

import com.taxxib.enterprise.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {
    void pastTrip();
}
