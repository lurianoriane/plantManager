package br.com.estudo.plantmanager

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.estudo.plantmanager.databinding.FragmentHowToNameBinding


class HowToNameFragment : Fragment() {

    private var _binding: FragmentHowToNameBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHowToNameBinding.inflate(inflater, container, false)

        binding.confirmButton.setOnClickListener {
            var name = binding.editTextPersonName.text
            var intent = Intent()
            intent.putExtra("name", name)
            startActivity(intent)
        }
        return binding.root

    }
}





