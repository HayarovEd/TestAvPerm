package com.edurda77.testavperm.model.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StopPlace(
    @SerializedName(NAME)
    val name: String,
    @SerializedName(GUID)
    val guid: Int,
    @SerializedName(ADDRESS)
    val addressLocation: String,
): Serializable
