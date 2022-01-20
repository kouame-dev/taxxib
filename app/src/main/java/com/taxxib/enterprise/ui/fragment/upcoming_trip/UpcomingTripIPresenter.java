package com.taxxib.enterprise.ui.fragment.upcoming_trip;

import com.taxxib.enterprise.base.MvpPresenter;

import java.util.HashMap;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {
    void upcomingTrip();
    void cancelRequest(HashMap<String, Object> params);
}
