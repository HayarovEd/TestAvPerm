package com.edurda77.testavperm.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.testavperm.model.data.StopPlace


class AutoStationAdapter(
    private val list: List<StopPlace>) :
    RecyclerView.Adapter<AutoStationHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AutoStationHolder {
        val inflater = LayoutInflater.from(parent.context)
        return AutoStationHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: AutoStationHolder, position: Int) {
        val stopPlace: StopPlace = list[position]
        holder.bind(stopPlace)
    }

    override fun getItemCount(): Int = list.size
}

