package com.aztechz.projectbinaryveda.Adapters

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aztechz.projectbinaryveda.Models.Industry
import com.aztechz.projectbinaryveda.Models.Skill
import com.aztechz.projectbinaryveda.Models.WorkFunction
import com.aztechz.projectbinaryveda.R
import kotlinx.android.synthetic.main.fragment_tab.view.*

class MainSectionsAdapter(fm: FragmentManager, private var skill: List<Skill>?, private var workFunction: List<WorkFunction>?, private var industry: List<Industry>?) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment? {
        var stringList : MutableList<String>? = ArrayList()
        when(position)
        {
            0 -> {
                for (i in 0 until skill!!.size) {
                    stringList?.add(skill!![i].name!!)
                }
            }
            1 -> {
                for (i in 0 until workFunction!!.size) {
                    stringList?.add(workFunction!![i].name!!)
                }
            }
            2 -> {
                for (i in 0 until industry!!.size) {
                    stringList?.add(industry!![i].name!!)
                }
            }
        }

        return PlaceholderFragment.newInstance(stringList)
    }

    override fun getCount(): Int {
        return TABS.size
    }

    companion object {
        private const val SKILL_SET = 0
        private const val WORK_FUNCTION = 1
        private const val INDUSTRY = 2

        private val TABS = intArrayOf(SKILL_SET, WORK_FUNCTION, INDUSTRY)
    }

    class PlaceholderFragment : Fragment() {

        var stringList : MutableList<String>? = ArrayList()

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            val rootView = inflater.inflate(R.layout.fragment_tab, container, false)

            var stringText:String = ""

            for(i in 0 until stringList!!.size)
            {
                if (stringText!="")
                    stringText += " | ${stringList!![i]}"
                else
                    stringText = stringList!![i]
            }


            rootView.section_label.text = stringText
            return rootView
        }

        companion object {

            fun newInstance(stringList: MutableList<String>?): PlaceholderFragment {
                val fragment = PlaceholderFragment()
                fragment.stringList = stringList
                return fragment
            }
        }
    }


}

