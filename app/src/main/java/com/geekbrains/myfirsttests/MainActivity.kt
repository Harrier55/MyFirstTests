package com.geekbrains.myfirsttests

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.myfirsttests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Contract.MainActivityView {

    private lateinit var binding: ActivityMainBinding
    private val emailValidator = EmailValidator()

    /** для задачи тестирования создаем Презентер**/
    private val carRepoImpl = CarRepoImpl()
    private val presenter: Contract.MainActivityPresenter = Presenter(carRepoImpl)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.attachView(this)

        with(binding) {
            emailInput.addTextChangedListener(emailValidator)

            saveButton.setOnClickListener {
                if (emailValidator.isValid) {
                    Toast.makeText(
                        this@MainActivity,
                        getString(R.string.valid_email),
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val errorEmail = getString(R.string.invalid_email)
                    emailInput.error = errorEmail
                    Toast.makeText(this@MainActivity, errorEmail, Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.showCarButton.setOnClickListener {
            presenter.loadListCar()
        }
    }


    override fun showListCar(list: List<Car>) {
        list.forEach {
            binding.listCarTextView.text = it.nameModel
        }

    }

    override fun onStop() {
        presenter.detachView()
        super.onStop()
    }
}
