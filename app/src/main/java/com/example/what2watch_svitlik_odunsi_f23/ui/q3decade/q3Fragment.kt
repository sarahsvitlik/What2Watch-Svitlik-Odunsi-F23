package com.example.what2watch_svitlik_odunsi_f23.ui.q3decade


import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.what2watch_svitlik_odunsi_f23.R
import com.example.what2watch_svitlik_odunsi_f23.databinding.FragmentQ3Binding
import com.example.what2watch_svitlik_odunsi_f23.ui.quizresults.AnswersData
import com.example.what2watch_svitlik_odunsi_f23.ui.quizresults.answersList


class q3Fragment : Fragment() {


    private var _binding: FragmentQ3Binding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val eighties = "1980"
    private val nineties = "1990"
    private val twothousands = "2000"
    private val twentytens = "2010"
    private val twentytwenies = "2020"
    private val recent = "2023"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val q3ViewModel =
            ViewModelProvider(this).get(q3ViewModel::class.java)


        _binding = FragmentQ3Binding.inflate(inflater, container, false)
        val root: View = binding.root


        val textView: TextView = binding.textQ3
        q3ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        // Buttons for the different decades
        val btnNext = binding.btnNext
        val btn80s = binding.btn80s
        val btn90s = binding.btn90s
        val btn00s = binding.btn00s
        val btn10s = binding.btn10s
        val btn20s = binding.btn20s
        val btnRecent = binding.btnRecent


        // Button click listeners
        btnNext.setOnClickListener {
            Log.d(TAG, "Next button was pressed!")
            findNavController().navigate(R.id.navigation_q4)
        }


        btn80s.setOnClickListener {
            Log.d(TAG, "80s button was pressed!")
            answersList.add(AnswersData(eighties))
            findNavController().navigate(R.id.navigation_q4)
        }


        btn90s.setOnClickListener {
            Log.d(TAG, "90s button was pressed!")
            answersList.add(AnswersData(nineties))
            findNavController().navigate(R.id.navigation_q4)
        }


        btn00s.setOnClickListener {
            Log.d(TAG, "00s button was pressed!")
            answersList.add(AnswersData(twothousands))
            findNavController().navigate(R.id.navigation_q4)
        }


        btn10s.setOnClickListener {
            Log.d(TAG, "10s button was pressed!")
            answersList.add(AnswersData(twentytens))
            findNavController().navigate(R.id.navigation_q4)
        }


        btn20s.setOnClickListener {
            Log.d(TAG, "20s button was pressed!")
            answersList.add(AnswersData(twentytwenies))
            findNavController().navigate(R.id.navigation_q4)
        }


        btnRecent.setOnClickListener {
            Log.d(TAG, "Recent button was pressed!")
            answersList.add(AnswersData(recent))
            findNavController().navigate(R.id.navigation_q4)
        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
