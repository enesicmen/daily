package com.icmen.daily.ui.fragment.adddaily

import android.os.Bundle
import com.icmen.daily.BaseFragment
import com.icmen.daily.databinding.FragmentAddDailyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddDailyPageFragment : BaseFragment<FragmentAddDailyBinding, AddDailyPageViewModel>() {


    override fun setViewBinding(): FragmentAddDailyBinding {
        return FragmentAddDailyBinding.inflate(layoutInflater)
    }

    override fun setViewModelClass() = AddDailyPageViewModel::class.java

    override fun initView(savedInstanceState: Bundle?) {}

}
