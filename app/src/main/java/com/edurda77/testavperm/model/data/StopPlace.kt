package com.edurda77.testavperm.model.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StopPlace(
    @SerializedName(NAME)
    val name: String,
    @SerializedName(ADDRESS)
    val addressLocation: String,
): Serializable
