package disiiy.khaper.simantan.activityizinkelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.databinding.ActivityGhz2Binding

class Ghz2Activity : AppCompatActivity() {
    private lateinit var ghz2Binding: ActivityGhz2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ghz2Binding = ActivityGhz2Binding.inflate(layoutInflater)
        setContentView(ghz2Binding.root)
        supportActionBar?.hide()
    }
}