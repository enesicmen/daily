package com.icmen.daily.ui.fragment.home

import android.os.Bundle
import com.icmen.daily.BaseFragment
import com.icmen.daily.databinding.FragmentHomeBinding
import com.icmen.daily.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePageFragment : BaseFragment<FragmentHomeBinding, HomePageViewModel>() {


    override fun setViewBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun setViewModelClass() = HomePageViewModel::class.java

    override fun initView(savedInstanceState: Bundle?) {}

}
