package com.example.week6_wangchhu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import fragments.aBOUT
import fragments.aDD
import fragments.hOME

class home : AppCompatActivity() {
    private lateinit var nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nav = findViewById(R.id.btmNav)

        if (savedInstanceState == null) {
            val fragment = hOME()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                .commit()
        }
        nav.setOnNavigationItemSelectedListener(selectedMenuItem)
    }

    private val selectedMenuItem =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    val fragment = hOME()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true

                }
                R.id.addStd -> {
                    val fragment = aDD()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true

                }
                R.id.about -> {
                    val fragment = aBOUT()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true

                }
            }
            false
        }
}