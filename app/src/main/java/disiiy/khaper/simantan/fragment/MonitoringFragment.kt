package disiiy.khaper.simantan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.activitymonitoring.*
import disiiy.khaper.simantan.databinding.FragmentMonitoringBinding

class MonitoringFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentMonitoringBinding.inflate(layoutInflater)

        bind.cdTvDigital.setOnClickListener {
            val intent = Intent(this.requireContext(), TvDigitalActivity::class.java)
            startActivity(intent)
        }

        bind.cdTvAnalog.setOnClickListener {
            val intent = Intent(this.requireContext(), TvAnalogActivity::class.java)
            startActivity(intent)
        }

        bind.cdRadioFm.setOnClickListener {
            val intent = Intent(this.requireContext(), RadioFmActivity::class.java)
            startActivity(intent)
        }

        bind.cdRadioAm.setOnClickListener {
            val intent = Intent(this.requireContext(), RadioAmActivity::class.java)
            startActivity(intent)
        }

        bind.cdMicrowaveLink.setOnClickListener {
            val intent = Intent(this.requireContext(), MicrowaveLinkActivity::class.java)
            startActivity(intent)
        }

        return bind.root

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MonitoringFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}