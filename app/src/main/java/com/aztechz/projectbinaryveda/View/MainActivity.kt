package com.aztechz.projectbinaryveda.View

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.aztechz.projectbinaryveda.Adapters.MainSectionsAdapter
import com.aztechz.projectbinaryveda.R
import com.aztechz.projectbinaryveda.ViewModel.SeekerViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get<SeekerViewModel>(SeekerViewModel::class.java)

        model.getSeeker().observe(this, Observer { seeker ->
            val data = seeker?.data

            name.text = data?.name
            designation.text = data?.designation?.name
            location.text = data?.location
            qualification.text = data?.highestQualification?.name
            work_experience.text = data?.experience
            expected_ctc.text = data?.expectedCtc
            current_working.text = data?.lastCompany?.name
            current_designation.text = data?.designation?.name

            val tab_skill = data?.skills
            val tab_work = data?.workFunctions
            val tab_industry = data?.industries

            var spinnerArray : MutableList<String>? = ArrayList()

            for (i in 0 until data?.roles!!.size) {
                spinnerArray?.add(data.roles!![i].name!!)
            }

            val spinnerArrayAdapter = ArrayAdapter<String>(this, R.layout.spinner_item, spinnerArray)
            spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                    .simple_spinner_dropdown_item)
            spinner.adapter = spinnerArrayAdapter

            tabText.adapter = MainSectionsAdapter(supportFragmentManager,tab_skill,tab_work,tab_industry)
            tabText.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
            tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(tabText))

            Picasso.get()
                    .load(data.image)
                    .placeholder(R.mipmap.ic_launcher)
                    .error(android.R.drawable.stat_notify_error)
                    .into(circleImageView)

            hand.setOnClickListener(this)
            cancel.setOnClickListener(this)
            accept.setOnClickListener(this)

        })
    }

    override fun onClick(p0: View?) {
        var buttonName = ""
        when(p0?.id)
        {
            R.id.accept -> buttonName = "Accept"
            R.id.cancel -> buttonName = "Cancel"
            R.id.hand -> buttonName = "Hand"
        }
        Toast.makeText(applicationContext,"Clicked Button $buttonName",Toast.LENGTH_SHORT).show()
    }


}
