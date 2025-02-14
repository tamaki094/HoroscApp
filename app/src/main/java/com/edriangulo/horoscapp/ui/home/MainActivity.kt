package com.edriangulo.horoscapp.ui.home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.edriangulo.horoscapp.R
import com.edriangulo.horoscapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding;
    private  lateinit var navController : NavController;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()

    }

    private fun initUI() {
        val navHost : NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerVw) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavVw.setupWithNavController(navController)
    }
}