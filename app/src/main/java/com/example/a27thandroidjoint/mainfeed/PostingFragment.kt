package com.example.a27thandroidjoint.mainfeed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a27thandroidjoint.mainfeed.adapter.MainFeedAdapter
import com.example.a27thandroidjoint.mainfeed.model.MainFeedModel
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.utils.VerticalItemDivider
import kotlinx.android.synthetic.main.fragment_posting.*

class PostingFragment : Fragment() {
    lateinit var mainFeedAdapter: MainFeedAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_posting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFeedAdapter(view)
        loadMainFeedDatas()
    }

    fun setFeedAdapter(view: View){
        mainFeedAdapter = MainFeedAdapter(view.context)
        recyclerview_feed.adapter = mainFeedAdapter
        recyclerview_feed.addItemDecoration(VerticalItemDivider(46))
    }

    fun loadMainFeedDatas(){
        var mainFeedDatas = mutableListOf<MainFeedModel>()

        mainFeedDatas.apply {
            add(
                MainFeedModel(
                    R.drawable.han_river,
                    getString(R.string.firstFeedTitle),
                    getString(R.string.firstFeedContent),
                    247
                )
            )
            add(
                MainFeedModel(
                    R.drawable.fish,
                    getString(R.string.secondFeedTitle),
                    getString(R.string.secondFeedContent),
                    123
                )
            )
            add(
                MainFeedModel(
                    R.drawable.mountain,
                    getString(R.string.thirdFeedTitle),
                    getString(R.string.thirdFeedContent),
                    54
                )
            )
            add(
                MainFeedModel(
                    R.drawable.house,
                    getString(R.string.fourthFeedTitle),
                    getString(R.string.fourthFeedContent),
                    247
                )
            )
        }
        mainFeedAdapter.mainFeedDatas = mainFeedDatas
        mainFeedAdapter.notifyDataSetChanged()
    }
}