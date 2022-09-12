package disiiy.khaper.simantan.activitymonitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityMicrowaveLinkBinding

class MicrowaveLinkActivity : AppCompatActivity() {
    private lateinit var microwaveLinkBinding: ActivityMicrowaveLinkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        microwaveLinkBinding = ActivityMicrowaveLinkBinding.inflate(layoutInflater)
        setContentView(microwaveLinkBinding.root)
        supportActionBar?.hide()
    }
}