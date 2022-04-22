package com.edurda77.testavperm.model.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Autostation(
    @SerializedName(NAME)
    val name: String,
    @SerializedName(GUID)
    val guidSourceRace: String,
    @SerializedName(STOPPLACE)
    val stopPlace: StopPlace
) : Serializable
