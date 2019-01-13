package com.alifyz.www.viewmodelexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_layout.*

class Fragment1 : Fragment() {

    var counterNumber : Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        texto.text = counterNumber.toString()

        aumentar.setOnClickListener {
            counterNumber+= 1
            texto.text = counterNumber.toString()
        }

        diminuir.setOnClickListener {
            counterNumber-= 1
            texto.text = counterNumber.toString()
        }
    }
}