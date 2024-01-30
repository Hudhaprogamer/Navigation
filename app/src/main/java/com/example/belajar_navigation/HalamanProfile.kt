package com.example.belajar_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.belajar_navigation.databinding.FragmentHalamanProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
// private const val ARG_PARAM2 = "param2"

//**
 //* A simple [Fragment] subclass.
 //* Use the [HalamanProfile.newInstance] factory method to
 //* create an instance of this fragment.
 //*/
class HalamanProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHalamanProfileBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_profile, container, false)

        binding.toDashboard.setOnClickListener {
            it.findNavController().navigate(R.id.action_halamanProfile_to_dashboard)
            
        }
        return binding.root
    }
}