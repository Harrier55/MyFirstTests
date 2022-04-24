package com.geekbrains.myfirsttests.data

import com.geekbrains.myfirsttests.domain.Car
import com.geekbrains.myfirsttests.domain.CarUseCase

open class CarRepoImpl: CarUseCase {

    private val listCar = mutableListOf<Car>()

    override fun create(car: Car) {
        listCar.add(car)
    }

    override fun getCar(): List<Car> {
        return  listCar
    }

    override fun createMockList() {
        create(Car("BMW"))
        create(Car("Audi"))
        create(Car("Kia"))
        create(Car("Lada"))
    }
}