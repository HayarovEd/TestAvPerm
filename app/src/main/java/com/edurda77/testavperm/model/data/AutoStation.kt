package com.edurda77.testavperm.model.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AutoStation(
    @SerializedName(NAME)
    val name: String,
    @SerializedName(STOPPLACE)
    val stopPlace: StopPlace
) : Serializable
