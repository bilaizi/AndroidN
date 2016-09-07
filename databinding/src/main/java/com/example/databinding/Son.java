package com.example.databinding;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by bilaizi on 16-9-7.
 */

public class Son {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}