package com.example.a3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var adapter: Adapter
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }


    private fun initViews() {
        viewPager = findViewById(R.id.viewPage_id)
        tabLayout = findViewById(R.id.tabLayout_id)

        adapter = Adapter(supportFragmentManager)
        adapter.addFragment(BlankFragment1(),"Contacts")
        adapter.addFragment(BlankFragment2(),"Profile")
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
    }




}