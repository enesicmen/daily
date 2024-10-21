package com.icmen.daily.ui.fragment.profile

import android.os.Bundle
import com.icmen.daily.BaseFragment
import com.icmen.daily.databinding.FragmentProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfilePageFragment : BaseFragment<FragmentProfileBinding, ProfilePageViewModel>() {


    override fun setViewBinding(): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

    override fun setViewModelClass() = ProfilePageViewModel::class.java

    override fun initView(savedInstanceState: Bundle?) {}

}
