import android.content.Context;
import android.preference.PreferenceManager;

public class QueryPreferences {

    public static String getStoredQuery(Context context, String key) {
        return PreferenceManager
                .getDefaultSharedPreferences(context)
                .getString(key, null);
    }
    public static void setStoredQuery(Context context, String key, String query) {
        PreferenceManager
                .getDefaultSharedPreferences(context)
                .edit()
                .putString(key, query)
                .apply();
    }
}
