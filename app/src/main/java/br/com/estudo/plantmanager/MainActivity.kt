package br.com.estudo.plantmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.estudo.plantmanager.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
        var inputname = Intent().getStringExtra("name")
        binding.nextBtn.setOnClickListener{
            binding.welcomegroup.visibility= View.GONE
            binding.fragmentwelcome.visibility=View.VISIBLE

        }
        if (inputname.isNullOrBlank()) {
            val supportname =   supportFragmentManager.beginTransaction()
            val newfragment = ReadyFragment()
            supportname.replace(R.id.fragmentwelcome, newfragment)

        }
    }
}