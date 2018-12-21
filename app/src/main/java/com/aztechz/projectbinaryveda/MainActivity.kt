package com.aztechz.projectbinaryveda

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.aztechz.projectbinaryveda.Models.Seeker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get<SeekerViewModel>(SeekerViewModel::class.java!!)

        model.seeker?.observe(this, Observer { })

    }
}
