package com.edurda77.testavperm.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.testavperm.R
import com.edurda77.testavperm.model.data.Autostation
import com.edurda77.testavperm.model.data.StopPlace


class AutoStationHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item, parent, false)) {

    private var nameTextView: TextView? = itemView.findViewById(R.id.item_name)
    private var locationTextView: TextView? = itemView.findViewById(R.id.item_location)

    fun bind(autostation: Autostation) {
        nameTextView?.text=autostation.stopPlace.name
        locationTextView?.text=autostation.stopPlace.addressLocation
    }
}