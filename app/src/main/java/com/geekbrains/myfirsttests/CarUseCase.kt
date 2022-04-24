package com.geekbrains.myfirsttests

interface CarUseCase {
    fun create(car: Car)
    fun getCar():List<Car>
    fun createMockList()


}