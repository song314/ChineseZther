package zither.ss.sichuan.cn.chinesezither.m;

import android.content.Context;
import android.util.Log;

import com.litesuits.orm.LiteOrm;

import java.util.ArrayList;
import java.util.Random;

import zither.ss.sichuan.cn.chinesezither.bean.Users;

/**
 * time: 12/7/15
 * description:
 *
 * @author tangsong
 */
public class CzDatabaseModel {


    private LiteOrm mDb;

    public void create(Context context) {
        //TODO context 使用app里面的context，并且扩展需要appContext的框架
        mDb = LiteOrm.newSingleInstance(context, "cz.db");
    }

    public void addUser() {
        Users user = new Users("tangsong" + new Random().nextInt(100), new Random().nextInt(2), "12932" + new Random().nextInt(1000), "song314@qq.com");
        mDb.save(user);
    }

    public void getAll() {

        ArrayList<Users> alist = mDb.query(Users.class);

        for (Users u : alist) {
            Log.i("song", u.toString() + ", count = " + mDb.queryCount(Users.class));
        }
    }



}
