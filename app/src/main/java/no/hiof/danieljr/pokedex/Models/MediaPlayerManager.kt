package no.hiof.danieljr.pokedex.Models

import androidx.compose.runtime.Composable



import android.content.Context
import android.media.MediaPlayer
import no.hiof.danieljr.pokedex.R

//A mediaplayer make too play the them song
object MediaPlayerManager {
    private var mediaPlayer: MediaPlayer? = null
    private var isMuted = false

    fun initialize(context: Context, audio : Int) {
        mediaPlayer = MediaPlayer.create(context, audio)
        mediaPlayer?.isLooping = true
    }

    fun start() {
        mediaPlayer?.start()
    }

    fun pause() {
        mediaPlayer?.pause()
    }

    fun toggleMute() {
        isMuted = !isMuted
        mediaPlayer?.setVolume(if (isMuted) 0f else 1f, if (isMuted) 0f else 1f)
    }

    fun isMuted(): Boolean {
        return isMuted
    }
}