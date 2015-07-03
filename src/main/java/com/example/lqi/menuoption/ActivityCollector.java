package com.example.lqi.menuoption;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lqi on 7/2/15.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            } }
    }
}
