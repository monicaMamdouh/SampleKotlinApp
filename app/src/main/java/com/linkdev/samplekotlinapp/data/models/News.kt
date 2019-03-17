package com.linkdev.samplekotlinapp.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class News() {


    @SerializedName("NewsTitle")
    @Expose
    var newsTitle: String? = null
    @SerializedName("Nid")
    @Expose
    var nid: String? = null
    @SerializedName("PostDate")
    @Expose
    var postDate: String? = null
    @SerializedName("ImageUrl")
    @Expose
    var imageUrl: String? = null
    @SerializedName("NewsType")
    @Expose
    var newsType: String? = null
    @SerializedName("NumofViews")
    @Expose
    var numofViews: String? = null
    @SerializedName("Likes")
    @Expose
    var likes: String? = null


}