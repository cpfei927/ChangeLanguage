package com.cpfei.changelanguage;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by cpfei on 2018/3/13.
 */

public class SPUtils {

    public static void saveLanguage(Context context, int i) {
        SharedPreferences language = context.getSharedPreferences("language", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = language.edit();
        edit.putInt("key", i);
        edit.commit();
    }

    public static int getLanguage(Context context) {
        SharedPreferences language = context.getSharedPreferences("language", Context.MODE_PRIVATE);
        return language.getInt("key", 0);
    }


}
