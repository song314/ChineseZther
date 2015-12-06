package zither.ss.sichuan.cn.chinesezither.v;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.util.SparseArrayCompat;
import android.view.ViewGroup;

import java.util.ArrayList;
public class CzViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<CzBaseFragment> mPages;
    private final SparseArrayCompat<CzBaseFragment> mHolder;

    public CzViewPagerAdapter(FragmentManager fm, ArrayList<CzBaseFragment> pages) {
        super(fm);
        this.mPages = pages;
        this.mHolder = new SparseArrayCompat(pages.size());
    }

    @Override
    public int getCount() {
        return this.mPages.size();
    }

    @Override
    public CzBaseFragment getItem(int position) {
        return (CzBaseFragment) this.getPagerItem(position);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object item = getPage(position);
        if (item == null) {
            item = super.instantiateItem(container, position);
            this.mHolder.put(position, (CzBaseFragment) item);
        }

        return item;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //to reuse the fragment
        //super.destroyItem(container, position, object);
    }


    @Override
    public float getPageWidth(int position) {
        return super.getPageWidth(position);
    }

    public CzBaseFragment getPage(int position) {
        return this.mHolder.get(position);
    }

    protected Fragment getPagerItem(int position) {
        return  mPages.get(position);
    }
}