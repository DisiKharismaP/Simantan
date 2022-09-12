package disiiy.khaper.simantan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import disiiy.khaper.simantan.R
import disiiy.khaper.simantan.activitymonitoring.TvDigitalActivity
import disiiy.khaper.simantan.activitypenertiban.PenangananActivity
import disiiy.khaper.simantan.activitypenertiban.PenertibanActivity
import disiiy.khaper.simantan.databinding.FragmentPenertibanBinding

class PenertibanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentPenertibanBinding.inflate(layoutInflater)

        bind.cdPenertiban.setOnClickListener {
            val intent = Intent(this.requireContext(), PenertibanActivity::class.java)
            startActivity(intent)
        }

        bind.cdPenanganan.setOnClickListener {
            val intent = Intent(this.requireContext(), PenangananActivity::class.java)
            startActivity(intent)
        }

        return bind.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            PenertibanFragment().apply {
                arguments = Bundle().apply {}
            }
    }

}