package com.example.a27thandroidjoint.mainfeed.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import com.example.a27thandroidjoint.mainfeed.adapter.MainFeedAdapter
import com.example.a27thandroidjoint.mainfeed.model.MainFeedModel
import com.example.a27thandroidjoint.R
import com.example.a27thandroidjoint.mainfeed.adapter.UserAdapeter
import com.example.a27thandroidjoint.mainfeed.model.UserModel
import com.example.a27thandroidjoint.utils.HorizontalItemDivider
import com.example.a27thandroidjoint.utils.VerticalItemDivider
import kotlinx.android.synthetic.main.fragment_posting.*

class PostingFragment : Fragment() {
    lateinit var mainFeedAdapter: MainFeedAdapter
    lateinit var userAdapeter: UserAdapeter
    var buttonCheckList = mutableListOf<Boolean>()
    var buttonList = mutableListOf<Button>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_posting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerview_feed.isNestedScrollingEnabled = false

        setUserAdapter(view)
        loadUserDatas()

        setFeedAdapter(view)
        loadMainFeedDatas()

        changeButtonAttribute(view)
    }

    private fun setUserAdapter(view: View){
        userAdapeter = UserAdapeter(view.context)
        recyclerview_user.adapter = userAdapeter
        recyclerview_user.addItemDecoration(HorizontalItemDivider(25))
    }

    private fun setFeedAdapter(view: View){
        mainFeedAdapter = MainFeedAdapter(view.context)
        recyclerview_feed.adapter = mainFeedAdapter
        recyclerview_feed.addItemDecoration(VerticalItemDivider(46))
    }

    private fun loadUserDatas(){
        var userDatas = mutableListOf<UserModel>()

        userDatas.apply {
            add(
                UserModel(R.drawable.list_btn_curator_1, "할리스커피")
            )
            add(
                UserModel(R.drawable.list_btn_curator_2, "동역사거주자")
            )
            add(
                UserModel(R.drawable.list_btn_curator_3, "뮤지컬볼래")
            )
            add(
                UserModel(R.drawable.list_btn_curator_4, "퇴근하고싶다")
            )
        }
        userAdapeter.userDatas = userDatas
        userAdapeter.notifyDataSetChanged()
    }

    private fun loadMainFeedDatas(){
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

    private fun changeButtonAttribute(view: View){

        val applesdgothicBold = ResourcesCompat.getFont(view.context, R.font.applesdgothic_bold)
        val applesdgothicRegular = ResourcesCompat.getFont(view.context, R.font.applesdgothic_regular)

        buttonList = arrayListOf(button_pick1, button_pick2, button_pick3, button_pick4,
                                    button_pick5, button_pick6, button_pick7, button_pick8)
        for (i in 0..7) buttonCheckList.add(false)

        for (i in 0..7) {
            buttonList[i].setOnClickListener {
                if(buttonCheckList[i]){
                    buttonList[i].setBackgroundResource(R.drawable.pick_unclick)
                    buttonList[i].setTextColor(Color.parseColor("#929292"))
                    buttonList[i].typeface = applesdgothicRegular
                    buttonCheckList[i] = false

                }else{
                    buttonList[i].setBackgroundResource(R.drawable.pick_onclick)
                    buttonList[i].setTextColor(Color.parseColor("#ffffff"))
                    buttonList[i].typeface = applesdgothicBold
                    buttonCheckList[i] = true
                }
            }
        }
    }
}