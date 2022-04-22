package com.edurda77.testavperm.view.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.testavperm.databinding.ActivityMainBinding
import com.edurda77.testavperm.model.data.Autostation
import com.edurda77.testavperm.viewmodel.MainActivityViewModel
import com.edurda77.testavperm.viewmodel.MainActivityViewModelContract

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModelContract.ViewModel by lazy {
        ViewModelProvider(this)[MainActivityViewModel::class.java]}
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.getLiveData()
        viewModel.liveData.observe(this) {
            setOotRecycledView(it)
        }

    }
    private fun setOotRecycledView(list: List<Autostation>) {

        val recyclerView: RecyclerView = binding.recycledView
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView.adapter = AutoStationAdapter(list)
    }
}