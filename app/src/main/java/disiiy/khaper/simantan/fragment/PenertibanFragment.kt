package disiiy.khaper.simantan.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import disiiy.khaper.simantan.R

class PenertibanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_penertiban, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            PenertibanFragment().apply {
                arguments = Bundle().apply {}
            }
    }

}