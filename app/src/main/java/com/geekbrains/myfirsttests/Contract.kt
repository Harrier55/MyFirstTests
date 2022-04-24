package com.geekbrains.myfirsttests

class Contract {

    interface MainActivityView{
        fun showListCar(list: List<Car>)
    }

    interface MainActivityPresenter{
        fun attachView(view: MainActivityView):Boolean
        fun detachView():Boolean
        fun loadListCar()

    }
}