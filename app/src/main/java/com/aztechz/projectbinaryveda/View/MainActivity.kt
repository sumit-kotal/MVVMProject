package com.aztechz.projectbinaryveda.View

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.aztechz.projectbinaryveda.Adapters.MainSectionsAdapter
import com.aztechz.projectbinaryveda.R
import com.aztechz.projectbinaryveda.ViewModel.SeekerViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*


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

            tabText.adapter = MainSectionsAdapter(supportFragmentManager,tab_skill,tab_work,tab_industry)
            tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(tabText))

            Picasso.get()
                    .load(data?.image)
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
