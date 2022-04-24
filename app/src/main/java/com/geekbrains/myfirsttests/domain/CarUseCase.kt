package com.geekbrains.myfirsttests.domain

import com.geekbrains.myfirsttests.domain.Car

interface CarUseCase {
    fun create(car: Car)
    fun getCar():List<Car>
    fun createMockList()


}