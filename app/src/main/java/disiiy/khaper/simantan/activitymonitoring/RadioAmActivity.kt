package disiiy.khaper.simantan.activitymonitoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityRadioAmBinding

class RadioAmActivity : AppCompatActivity() {
    private lateinit var radioAmBinding: ActivityRadioAmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        radioAmBinding = ActivityRadioAmBinding.inflate(layoutInflater)
        setContentView(radioAmBinding.root)
        supportActionBar?.hide()
    }
}