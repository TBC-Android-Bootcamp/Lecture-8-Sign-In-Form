package com.example.lecture8homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // იმეილის ვალიდაცია
        fun isEmailValid(email: Editable): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }


        // ცოტა უაზროდ განლაგებული იფ/ელსია მაგრამ დავხვეწ დროთა განმავლობაში
        // Email validation on signIn button click
        signIn.setOnClickListener(){
            if(emailField.text.isNotEmpty() && passwordField.text.isNotEmpty()){
                if(isEmailValid(email = emailField.text)){
                    Toast.makeText(applicationContext, "You are good to go, Signing In", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Email is not valid, Try again!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext, "Fields must be filled", Toast.LENGTH_SHORT).show()
            }
        }



        // ტოსტები -> for some non-functional buttons
        signUp.setOnClickListener(){
            Toast.makeText(applicationContext, "Signing up...", Toast.LENGTH_SHORT).show()
        }

        passwordForgot.setOnClickListener(){
            Toast.makeText(applicationContext, "Redirecting to password reset page..", Toast.LENGTH_SHORT).show()
        }

        twitter.setOnClickListener(){
            Toast.makeText(applicationContext, "Redirecting to Twitter...", Toast.LENGTH_SHORT).show()
        }

        facebook.setOnClickListener(){
            Toast.makeText(applicationContext, "Redirecting to Facebook...", Toast.LENGTH_SHORT).show()
        }
    }

}
