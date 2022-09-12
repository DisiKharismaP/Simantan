package disiiy.khaper.simantan.activitymonitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityRadioFmBinding

class RadioFmActivity : AppCompatActivity() {
    private lateinit var radioFmBinding: ActivityRadioFmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        radioFmBinding = ActivityRadioFmBinding.inflate(layoutInflater)
        setContentView(radioFmBinding.root)
        supportActionBar?.hide()
    }
}