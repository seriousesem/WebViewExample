package com.serioussem.webviewexample.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB : ViewBinding>(private val inflate: Inflate<VB>) :
    Fragment() {

    private var bindingMutable: VB? = null
    protected val binding get() = bindingMutable!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingMutable = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindingMutable = null
    }

    abstract fun init()

}