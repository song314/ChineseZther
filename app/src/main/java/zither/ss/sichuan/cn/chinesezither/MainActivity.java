package zither.ss.sichuan.cn.chinesezither;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import zither.ss.sichuan.cn.chinesezither.v.BasicKnowledgeFragment;
import zither.ss.sichuan.cn.chinesezither.v.CzBaseFragment;
import zither.ss.sichuan.cn.chinesezither.v.CzStoryFragment;
import zither.ss.sichuan.cn.chinesezither.v.CzTitleViewPagerAdapter;
import zither.ss.sichuan.cn.chinesezither.v.SampleFragment;

public class MainActivity extends FragmentActivity {


    @InjectView(R.id.sort_list_top_tab)
    TabLayout mTabLayout;
    @InjectView(R.id.sort_list_view_pager)
    ViewPager mViewPager;

    private String[] mTitle = {"指法", "基础知识", "单曲赏析", "名曲", "小故事", "关于我们"};

    private CzTitleViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        final TabLayout.TabLayoutOnPageChangeListener listener = new TabLayout.TabLayoutOnPageChangeListener(mTabLayout);
        mViewPager.addOnPageChangeListener(listener);


        ArrayList<CzBaseFragment> fragments = new ArrayList<>();

        for (int i = 0; i < mTitle.length; i++) {

            switch (i) {
                case 1:
                    fragments.add(new BasicKnowledgeFragment());
                    break;
                case 4:
                    fragments.add(new CzStoryFragment());
                    break;
                default:
                    fragments.add(new SampleFragment());
                    break;
            }

        }

        mAdapter = new CzTitleViewPagerAdapter(getSupportFragmentManager(), fragments, mTitle);

        mTabLayout.setTabsFromPagerAdapter(mAdapter);
        mViewPager.setAdapter(mAdapter);

        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
