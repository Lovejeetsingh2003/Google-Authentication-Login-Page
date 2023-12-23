package com.lovejeet.firebaseauthentication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.lovejeet.firebaseauthentication.Fragments.GetStartFragment
import com.lovejeet.firebaseauthentication.R
import com.lovejeet.firebaseauthentication.databinding.ActivityHomeBinding
import com.lovejeet.firebaseauthentication.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    var binding : ActivityHomeBinding?= null
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        auth = Firebase.auth

        binding?.btnLogOut?.setOnClickListener{
            if (auth.currentUser != null )
            {
                auth.signOut()
                startActivity(Intent(this,MainActivity::class.java))
            }
        }
    }
}