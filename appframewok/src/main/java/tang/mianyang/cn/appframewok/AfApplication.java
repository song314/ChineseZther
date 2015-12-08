package tang.mianyang.cn.appframewok;

import android.app.Application;
import android.content.Context;

/**
 * time: 12/7/15
 * description:
 *
 * @author tangsong
 */
public class AfApplication extends Application {

    public static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }
}
