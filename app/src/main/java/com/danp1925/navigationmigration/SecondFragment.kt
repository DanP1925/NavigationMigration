package com.danp1925.navigationmigration

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val mainViewModel: MainViewModel by activityViewModels()
    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mainViewModel.updateToolbar("Second Screen")

        view.findViewById<TextView>(R.id.second_argument).apply {
            text = args.stringArgument
        }
    }

}