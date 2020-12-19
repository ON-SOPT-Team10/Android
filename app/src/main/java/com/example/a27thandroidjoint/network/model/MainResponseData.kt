package com.example.a27thandroidjoint.network.model

data class MainResponseData(
    val `data`: Data,
    val message: String,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val feeds: List<Feed>,
        val stories: List<Story>
    ) {
        data class Feed(
            val TagId: Int,
            val bookmarkCount: Int,
            val feedContents: String,
            val feedImage: String,
            val feedTitle: String,
            val id: Int,
            val isBookmarked: Boolean
        )

        data class Story(
            val id: Int,
            val storyImage: String,
            val storyTitle: String
        )
    }
}