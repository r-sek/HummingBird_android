package dev.kurokiri.hummingbird.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.kurokiri.hummingbird.R
import dev.kurokiri.hummingbird.adapters.TweetListRecyclerViewAdapter
import dev.kurokiri.hummingbird.dummy.DummyContent

class TimeLineFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_time_line_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                adapter =
                    TweetListRecyclerViewAdapter(
                        DummyContent.ITEMS
                    )
            }
        }
        return view
    }

}