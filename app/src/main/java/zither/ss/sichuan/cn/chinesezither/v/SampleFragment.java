package zither.ss.sichuan.cn.chinesezither.v;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * time: 12/6/15
 * description:
 *
 * @author tangsong
 */
public class SampleFragment extends CzBaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        textView.setText(" this is a fragment : " + this.hashCode());
        return textView;
    }
}
