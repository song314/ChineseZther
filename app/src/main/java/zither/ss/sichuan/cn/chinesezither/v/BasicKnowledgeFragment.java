package zither.ss.sichuan.cn.chinesezither.v;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.InjectView;
import zither.ss.sichuan.cn.chinesezither.R;

/**
 * time: 12/6/15
 * description:
 *
 * @author tangsong
 */
public class BasicKnowledgeFragment extends CzBaseFragment {


    @InjectView(R.id.basic_list_view)
    ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayoutRes() {
        return R.layout.layout_basic_knowledge;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mListView.setAdapter(ArrayAdapter.createFromResource(getActivity(), android.R.array.phoneTypes, android.R.layout.simple_list_item_1));
    }
}
