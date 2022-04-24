package com.geekbrains.myfirsttests


import com.geekbrains.myfirsttests.data.CarRepoImpl
import com.geekbrains.myfirsttests.domain.Car
import com.geekbrains.myfirsttests.ui.Contract
import com.geekbrains.myfirsttests.ui.Presenter
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class PresenterTest {
    private lateinit var presenter: Contract.MainActivityPresenter

    @Mock
    private lateinit var repository: CarRepoImpl

    @Mock
    private lateinit var view: Contract.MainActivityView


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = Presenter(repository)
    }

    @Test
    fun loadListCar_Repository_RunMockList_RunGetCar() {
        presenter.loadListCar()
        verify(repository, atLeastOnce()).createMockList()
        verify(repository).getCar()
    }

    @Test
    fun attachView_ReturnsTrue() {
        Assert.assertTrue(presenter.attachView(view))
    }

    @Test
    fun detachView_ReturnsTrue() {
        Assert.assertTrue(presenter.detachView())
    }


}