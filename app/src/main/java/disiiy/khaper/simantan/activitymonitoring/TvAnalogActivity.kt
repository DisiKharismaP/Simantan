package disiiy.khaper.simantan.activitymonitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityTvAnalogBinding

class TvAnalogActivity : AppCompatActivity() {
    private lateinit var tvAnalogBinding: ActivityTvAnalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tvAnalogBinding = ActivityTvAnalogBinding.inflate(layoutInflater)
        setContentView(tvAnalogBinding.root)
        supportActionBar?.hide()
    }
}