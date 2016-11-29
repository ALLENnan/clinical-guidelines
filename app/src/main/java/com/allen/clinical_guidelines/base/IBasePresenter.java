package com.allen.clinical_guidelines.base;

interface IBasePresenter<V extends IBaseView> {
    /**
     * presenter和对应的view绑定
     *
     * @param view 目标view
     */
    void attachView(V view);

    /**
     * presenter和view解绑
     */
    void detachView();
}
