package com.geekbrains.myfirsttests

class Presenter(private val carRepoImpl: CarRepoImpl):Contract.MainActivityPresenter {

    private var view: Contract.MainActivityView? = null

    override fun attachView(view: Contract.MainActivityView):Boolean {
        this.view = view
        return true
    }

    override fun detachView():Boolean {
        this.view = null
        return true
    }

    override fun loadListCar() {
        carRepoImpl.createMockList()
        val list = carRepoImpl.getCar()
        view?.showListCar(list)
    }




}