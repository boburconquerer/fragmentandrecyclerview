package com.example.a3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class Adapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {

    val fragmentList = ArrayList<Fragment>()
    val dataList = ArrayList<String>()



    fun addFragment(fragment: Fragment, data: String){
        fragmentList.add(fragment)
        dataList.add(data)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
       return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return dataList[position]
    }






}