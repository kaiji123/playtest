package com.myapp.graph

import android.graphics.Color
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val graphFragment = GraphFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentlo, graphFragment)
            commit()
        }




    }
}