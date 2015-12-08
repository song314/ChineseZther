package zither.ss.sichuan.cn.chinesezither.v;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.magiepooh.recycleritemdecoration.ItemDecorations;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import zither.ss.sichuan.cn.chinesezither.R;

/**
 * time: 12/7/15
 * description:
 *
 * http://blog.csdn.net/lmj623565791/article/details/45059587
 *
 * @author tangsong
 */
public class CzStoryFragment extends CzBaseFragment {

    @InjectView(R.id.story_recycler_view)
    RecyclerView mRecyclerView;

    private List<String> mDatas;

    @Override
    protected int setLayoutRes() {
        return R.layout.layout_story;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initData();
        RecyclerView.Adapter adapter = new HomeAdapter();
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerView.setAdapter(adapter);
        RecyclerView.ItemDecoration decoration = ItemDecorations.vertical(getActivity()).create();
        mRecyclerView.addItemDecoration(decoration);
    }

    protected void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add("" + (char) i);
        }
    }

    class HomeAdapter extends RecyclerView.Adapter<MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    CzStoryFragment.this.getContext()).inflate(R.layout.story_list, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv.setText(mDatas.get(position));
            holder.imageView.setBackgroundColor(Color.GREEN);
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.story_list_item_tv)
        TextView tv;
        @InjectView(R.id.story_list_item_bg)
        ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.inject(this, view);
        }
    }

}
