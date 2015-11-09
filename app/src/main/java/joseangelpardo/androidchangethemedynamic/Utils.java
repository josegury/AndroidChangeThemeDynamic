package joseangelpardo.androidchangethemedynamic;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Jose Angel Pardo on 08/11/2015.
 */
public class Utils {
    public static int sTheme = R.style.FirstTheme;

    public static void savePreferences(Context context){
        SharedPreferences prefs =
                context.getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("email", sTheme );
        editor.commit();
    }
    public static void loadPreferences(Context context){
        SharedPreferences prefs =
                context.getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        sTheme = prefs.getInt("email", R.style.FirstTheme);
    }



}
