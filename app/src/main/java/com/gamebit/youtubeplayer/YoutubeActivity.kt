package com.gamebit.youtubeplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import java.lang.reflect.Constructor

class YoutubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_youtube)
        //val layout = findViewById<ConstraintLayout>(R.id.activity_youtube)

        val layout = layoutInflater.inflate(R.layout.activity_youtube, null) as ConstraintLayout
        setContentView(layout)
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        TODO("Not yet implemented")
    }
}





















