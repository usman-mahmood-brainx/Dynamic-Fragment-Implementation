package com.example.fragmentimplementation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat


/**
 * A simple [Fragment] subclass.
 * Use the [dynamicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class dynamicFragment(val fragmentNumber:String,var color:Int) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.dynamic_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.fragmentNumber)
        val rl = view.findViewById<RelativeLayout>(R.id.fragmentRL)
        var tempColor = ContextCompat.getColor(requireContext(), color)
        rl.setBackgroundColor(tempColor)

        textView.text = fragmentNumber

        return view
    }


}