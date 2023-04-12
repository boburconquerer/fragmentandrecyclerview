package com.example.a3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BlankFragment1 : Fragment() {
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         val view = inflater.inflate(R.layout.fragment_blank1, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView =view.findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        refreshAdapter(data())
    }
    private fun refreshAdapter(user: ArrayList<Model>) {
        val adapter = RecycleAdapter(user)
        recyclerView.adapter = adapter
    }

    private fun data(): ArrayList<Model>{
        val list = ArrayList<Model>()

        list.add(Model(R.drawable.oval, "Elon Musk", "You are my amateur"))
        list.add(Model(R.drawable.oval, "Bill Gates", "Hi"))
        list.add(Model(R.drawable.oval, "Steve Jobs", "I am  here"))
        list.add(Model(R.drawable.oval, "Warren Buffet", "Hey"))
        list.add(Model(R.drawable.oval, "Tony Stark", "Hello"))
        list.add(Model(R.drawable.oval, "Mark Zuckerberg", "Hello"))
        list.add(Model(R.drawable.oval, "Jeff Bezos", "Hello"))
        list.add(Model(R.drawable.oval, "Batman", "I am Batman"))
        return list
    }

}