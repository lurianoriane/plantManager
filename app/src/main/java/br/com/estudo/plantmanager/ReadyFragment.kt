package br.com.estudo.plantmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.estudo.plantmanager.databinding.FragmentReadyBinding


class ReadyFragment : Fragment() {

private var _binding : FragmentReadyBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentReadyBinding.inflate(inflater, container, false)
        return binding.root
    }


}