package com.example.dietapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.dietapp.databinding.FragmentHealthyrecipeBinding

class Exercise2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_exercise2, container, false)

        val gotoHomeButton : Button = root.findViewById(R.id.home_button)
        gotoHomeButton.setOnClickListener {
            handleGotoHome(it)
        }

        return root
    }

    private fun handleGotoHome(view: View) {

        view.findNavController().navigate(R.id.action_exercise2Fragment_to_titleFragment)
    }
}