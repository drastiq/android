package com.projekt.danielgrabowski.apka;

import android.content.Context;
import android.content.SharedPreferences;

public class ColumnNumberPreferences {

    private static final String PREFS_NAME = "columns_number";
    private static final String KEY_NUM_COLUMNS = "numColumns";

    private SharedPreferences preferences;

    public ColumnNumberPreferences(Context context) {
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void saveSelectedNumberOfColumns(int numberOfColumns) {
        preferences.edit().putInt(KEY_NUM_COLUMNS, numberOfColumns).commit();
    }

    public int getSelectedNumberOfColumns() {
        return preferences.getInt(KEY_NUM_COLUMNS, 1);
    }
}
