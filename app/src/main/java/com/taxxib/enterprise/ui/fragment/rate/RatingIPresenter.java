package com.taxxib.enterprise.ui.fragment.rate;

import com.taxxib.enterprise.base.MvpPresenter;

import java.util.HashMap;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface RatingIPresenter<V extends RatingIView> extends MvpPresenter<V> {
    void rate(HashMap<String, Object> obj);
}
