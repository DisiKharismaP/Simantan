package disiiy.khaper.simantan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import disiiy.khaper.simantan.activityizinkelas.Ghz2Activity
import disiiy.khaper.simantan.activityizinkelas.Ghz5Activity
import disiiy.khaper.simantan.databinding.FragmentIzinKelasBinding


class IzinKelasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentIzinKelasBinding.inflate(layoutInflater)

        bind.cd2Ghz.setOnClickListener {
            val intent = Intent(this.requireContext(), Ghz2Activity::class.java)
            startActivity(intent)
        }

        bind.cd5Ghz.setOnClickListener {
            val intent = Intent(this.requireContext(), Ghz5Activity::class.java)
            startActivity(intent)
        }

        return bind.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            IzinKelasFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}