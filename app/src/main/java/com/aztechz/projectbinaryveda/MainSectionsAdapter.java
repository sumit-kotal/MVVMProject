package com.aztechz.projectbinaryveda;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainSectionsAdapter extends FragmentPagerAdapter
{
    private static final int SKILL_SET = 0;
    private static final int WORK_FUNCTION = 1;
    private static final int  INDUSTRY= 2;

    private static final int[] TABS = new int[]{SKILL_SET, WORK_FUNCTION,INDUSTRY};

    private Context mContext;

    public MainSectionsAdapter(final Context context, final FragmentManager fm)
    {
        super(fm);
        mContext = context.getApplicationContext();
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (TABS[position])
        {
            case SKILL_SET:
                return ContactsFragment.newInstance();
            case WORK_FUNCTION:
                return CallsFragment.newInstance();
            case INDUSTRY:
                return ChatsFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return TABS.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (TABS[position])
        {
            case SKILL_SET:
                return mContext.getResources().getString(R.string.contacts);
            case WORK_FUNCTION:
                return mContext.getResources().getString(R.string.calls);
            case INDUSTRY:
                return mContext.getResources().getString(R.string.chats);
        }
        return null;
    }
}