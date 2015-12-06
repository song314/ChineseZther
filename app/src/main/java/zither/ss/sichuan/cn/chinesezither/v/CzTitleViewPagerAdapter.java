package zither.ss.sichuan.cn.chinesezither.v;

import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

/**
 * time: 12/6/15
 * description:
 *
 * @author tangsong
 */
public class CzTitleViewPagerAdapter extends CzViewPagerAdapter {

    private String[] mTitle;

    public CzTitleViewPagerAdapter(FragmentManager fm, ArrayList<CzBaseFragment> pages, String[] title) {
        super(fm, pages);
        mTitle = title;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle[position];
    }
}
