package com.dizcoding.bacots.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dizcoding.bacots.model.Fragments

class ViewPagerAdapter (fm: FragmentManager,val list: List<Fragments>) : FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment = list[position].fragment
    override fun getCount(): Int = list.size
    override fun getPageTitle(position: Int): CharSequence? = list[position].title
}