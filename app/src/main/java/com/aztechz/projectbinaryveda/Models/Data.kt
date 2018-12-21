package com.aztechz.projectbinaryveda.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("image")
    @Expose
    var image: String? = null
    @SerializedName("designation")
    @Expose
    var designation: Designation? = null
    @SerializedName("roles")
    @Expose
    var roles: List<Role>? = null
    @SerializedName("industries")
    @Expose
    var industries: List<Industry>? = null
    @SerializedName("work_functions")
    @Expose
    var workFunctions: List<WorkFunction>? = null
    @SerializedName("skills")
    @Expose
    var skills: List<Skill>? = null
    @SerializedName("highest_qualification")
    @Expose
    var highestQualification: HighestQualification? = null
    @SerializedName("experience")
    @Expose
    var experience: String? = null
    @SerializedName("expected_ctc")
    @Expose
    var expectedCtc: String? = null
    @SerializedName("hide_from_companies")
    @Expose
    var hideFromCompanies: List<Any>? = null
    @SerializedName("location")
    @Expose
    var location: String? = null
    @SerializedName("latitude")
    @Expose
    var latitude: Double? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Double? = null
    @SerializedName("radius")
    @Expose
    var radius: Int? = null
    @SerializedName("city_list")
    @Expose
    var cityList: List<String>? = null
    @SerializedName("show_city_popup")
    @Expose
    var showCityPopup: Boolean? = null
    @SerializedName("city_popup_text")
    @Expose
    var cityPopupText: String? = null
    @SerializedName("city_popup_image")
    @Expose
    var cityPopupImage: String? = null

}
