package com.calendarevents;

import com.facebook.react.ReactPackage;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.turbomodule.core.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalendarEventsPackage extends TurboReactPackage implements ReactPackage {
    // TurboModule support for new architecture
    @Override
    public NativeModule getModule(String name, ReactApplicationContext context) {
        if (name.equals(CalendarEvents.NAME)) {
            return new CalendarEvents(context);
        }
        return null;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new CalendarEvents(reactContext));
        return modules;
    }

    public static void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        CalendarEvents.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
