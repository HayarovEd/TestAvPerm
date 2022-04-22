package com.edurda77.testavperm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.testavperm.databinding.ActivityMainBinding
import com.edurda77.testavperm.model.data.AutoStation
import com.edurda77.testavperm.view.adapters.AutoStationAdapter
import com.edurda77.testavperm.viewmodel.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.getLiveData()
        viewModel.liveData.observe(this) {
            setOotRecycledView(it)
        }

    }
    private fun setOotRecycledView(list: List<AutoStation>) {

        val recyclerView: RecyclerView = binding.recycledView
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView.adapter = AutoStationAdapter(list)
    }
}