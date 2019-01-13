package com.alifyz.www.viewmodelexample

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_layout.*

class Fragment1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Criação de uma ViewModel usando um ViewModelProvider
        val viewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)

        //Extraindo os Dados da ViewModel
        texto.text = viewModel.counterNumber.toString()

        aumentar.setOnClickListener {
            //Salvando o novo Estado do Contador - ViewModel
            viewModel.counterNumber+= 1
            texto.text = viewModel.counterNumber.toString() //Acessando Diretamente da ViewModel
        }

        diminuir.setOnClickListener {
            //Salvando o novo Estado do Contador - ViewModel
            viewModel.counterNumber-= 1
            texto.text = viewModel.counterNumber.toString() //Acessando Diretamente da ViewModel
        }
    }
}