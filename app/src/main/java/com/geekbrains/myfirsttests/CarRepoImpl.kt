package com.geekbrains.myfirsttests

class CarRepoImpl: CarUseCase {

    private val listCar = mutableListOf<Car>()

    override fun create(car: Car) {
        listCar.add(car)
    }

    override fun getCar(): List<Car> {
        return  listCar
    }
}