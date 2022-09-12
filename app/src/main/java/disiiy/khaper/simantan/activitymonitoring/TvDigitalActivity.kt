package disiiy.khaper.simantan.activitymonitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityTvDigitalBinding

class TvDigitalActivity : AppCompatActivity() {
    private lateinit var tvDigitalBinding: ActivityTvDigitalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tvDigitalBinding = ActivityTvDigitalBinding.inflate(layoutInflater)
        setContentView(tvDigitalBinding.root)
        supportActionBar?.hide()

    }
}