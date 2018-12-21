package com.aztechz.projectbinaryveda.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LastCompany {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

}
