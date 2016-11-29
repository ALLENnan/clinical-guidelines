package com.allen.clinical_guidelines.base;


public class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {
    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    /**
     * 判断view是否为空
     *
     * @return
     */
    public boolean isAttachView() {
        return view != null;
    }

    /**
     * 返回目标view
     *
     * @return
     */
    public V getView() {
        return view;
    }
}
