package com.example.setmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.sample_music)

        val playButton: Button = findViewById(R.id.play_button)
        playButton.setOnClickListener { playMusic() }

        val stopButton: Button = findViewById(R.id.stop_button)
        stopButton.setOnClickListener { stopMusic() }
    }

    private fun playMusic() {
        mediaPlayer.start()
    }

    private fun stopMusic() {
        mediaPlayer.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}