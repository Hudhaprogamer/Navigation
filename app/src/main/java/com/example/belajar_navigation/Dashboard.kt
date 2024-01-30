package com.example.belajar_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.belajar_navigation.databinding.FragmentDashboardBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [dashboard.newInstance] factory method to
 * create an instance of this fragment.
 */
class dashboard : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_dashboard, container, false)
        //val binding : FragmentHalamanProfilBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_profil, container, false)

        val binding: FragmentDashboardBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)

        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanProfile)
        }

        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanPortofolio)
        }

        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanDiklat2)
        }
        return binding.root

    }
}