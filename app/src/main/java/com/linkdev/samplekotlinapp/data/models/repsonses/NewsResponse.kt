package com.linkdev.samplekotlinapp.data.models.repsonses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.linkdev.samplekotlinapp.data.models.News

class NewsResponse {

    @SerializedName("News")
    @Expose
    var news: List<News>? = null


}

