package com.geekbrains.myfirsttests

class Presenter(private val carRepoImpl: CarRepoImpl):Contract.MainActivityPresenter {

    private var view: Contract.MainActivityView? = null

    override fun attachView(view: Contract.MainActivityView) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

    override fun loadListCar() {
        carRepoImpl.createMockList()
        view?.showListCar(carRepoImpl.getCar())
    }



}