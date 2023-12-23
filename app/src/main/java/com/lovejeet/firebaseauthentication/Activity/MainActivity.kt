package com.lovejeet.firebaseauthentication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.lovejeet.firebaseauthentication.R
import com.lovejeet.firebaseauthentication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding ?= null
    var navController : NavController ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val auth = Firebase.auth

        navController = findNavController(R.id.navController2)

        if(auth.currentUser != null){
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }
    }
}