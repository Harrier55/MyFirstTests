package com.geekbrains.myfirsttests

class Contract {

    interface MainActivityView{

    }

    interface MainActivityPresenter{
        fun attachView(view: MainActivityView)
        fun detachView()
        fun loadListCar():List<Car>
    }
}