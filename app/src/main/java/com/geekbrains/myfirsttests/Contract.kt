package com.geekbrains.myfirsttests

class Contract {

    interface MainActivityView{
        fun showListCar(list: List<Car>)
    }

    interface MainActivityPresenter{
        fun attachView(view: MainActivityView)
        fun detachView()
        fun loadListCar()
    }
}