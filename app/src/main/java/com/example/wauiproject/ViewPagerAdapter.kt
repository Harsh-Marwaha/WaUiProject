package com.example.wauiproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position==0)
            return ChatsFragment()
        else if (position==1)
            return StatusFragment()
        else
            return CallsFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position==0)
            return "Chats"
        else if (position==1)
            return "Status"
        else
            return "calls"
    }
}