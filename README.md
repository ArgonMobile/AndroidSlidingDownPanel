AndroidSlidingDownPanel
=======================
SlidingDownPanel provides a vertical, multi-pane layout for user at the top level of a UI, just like the usage in [Aviate](http://getaviate.com/).


Usage
=====
The layout could be usage as [SlidingPaneLayout]( http://developer.android.com/reference/android/support/v4/widget/SlidingPaneLayout.html). To use of the layout, simply include `com.argonware.slidingdownpanel.SlidingDownPanelLayout` as the root element for your multi pane layout. Add two children view. The first child is your main layout. The second child is your layout for the sliding down panel. 
```
<com.argonware.slidingdownpanel.SlidingDownPanelLayout
        android:id="@+id/sliding_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:id="@+id/main_content"
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:gravity="center"
            android:text="Main Content"
            android:background="@android:color/holo_blue_light"
            android:textAppearance="@android:style/TextAppearance.DeviceDefault.Large"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <TextView
                android:id="@+id/drag_view"
                android:layout_width="match_parent"
                android:layout_height="50dp"
                android:gravity="center"
                android:text="Sliding Down Panel"
                android:textAppearance="@android:style/TextAppearance.DeviceDefault.Large"
                android:textColor="@android:color/white"
                android:background="@android:color/holo_orange_light"/>

            <ImageView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:scaleType="fitXY"
                android:src="@drawable/test_bg"/>
        </LinearLayout>
    </com.argonware.slidingdownpanel.SlidingDownPanelLayout>
```
For more information, please refer to the [sample code](https://github.com/ArgonMobile/AndroidSlidingDownPanel/tree/master/demo).

Implementation
=======================
This code is heavily based on the opened-sourced [SlidingPaneLayout]( http://developer.android.com/reference/android/support/v4/widget/SlidingPaneLayout.html) component from the r13 of the Android Support Library.
And The demo is referenced to umano's project [AndroidSlidingUpPanel](https://github.com/umano/AndroidSlidingUpPanel).
Thanks for Android Team and Umano Team!
