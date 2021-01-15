package com.example.week6_wangchhu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var btnsignin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()

                btnsignin.setOnClickListener{

                    val username=username.text.toString()
                    val password=password.text.toString()
                    nullCheck()
                    if(username=="wangchhu" && password=="tamang")
                    {
                        Toast.makeText(this,"Login Successfull", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, home::class.java)
                        startActivity(intent)
                    }
                    else
                    {
                        Toast.makeText(this, "Invalid loign", Toast.LENGTH_SHORT).show()
                    }


                }
            }



            private fun binding() {
                username=findViewById(R.id.username)
                password=findViewById(R.id.password)
                btnsignin=findViewById(R.id.btnsignin)
            }

            private fun nullCheck()
            {
                when {
                    TextUtils.isEmpty(username.text) -> {
                        username.error = "username empty"
                        username.requestFocus()
                    }
                    TextUtils.isEmpty(password.text) -> {
                        password.error = "password empty"
                        password.requestFocus()
                    }
                }
            }
        }
