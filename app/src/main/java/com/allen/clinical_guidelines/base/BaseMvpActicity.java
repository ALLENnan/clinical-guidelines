package com.allen.clinical_guidelines.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseMvpActicity<V extends IBaseView, T extends BasePresenter<V>> extends AppCompatActivity {

    private T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = newPresenter();

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    /**
     * 实例化presenter
     * @return presenter
     */
    public abstract T newPresenter();
}
