# EminLibDemo

Demo演示:

![](https://github.com/emingu/EminLibDemo/blob/master/2015-04-30%2017_20_40.gif)  


右滑效果主要是@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)以上才支持的左右互换功能；
核心代码：

1 manifest.xml中application 设置android:supportsRtl="true"
```
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity
            android:name=".emin.com.myapplication.MainActivity"
            android:label="@string/app_name">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>

                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
    </application>

```
2  对activity左右处理
getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
```
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        
        
```
3 activity_main.xml中设置fragment_drawer属性 android:layout_gravity="start"
 ```
<!-- android:layout_marginTop="?android:attr/actionBarSize"-->
        <fragment
            android:id="@+id/fragment_drawer"
            android:name="com.eminlibdemo.emin.com.myapplication.materialdrawer.NavigationDrawerFragment"
            android:layout_width="@dimen/navigation_drawer_width"
            android:layout_height="match_parent"
            android:layout_gravity="start"
            app:layout="@layout/fragment_navigation_drawer"/>
    </android.support.v4.widget.DrawerLayout>



```


动画使用代码：

``` 
  YoYo.with(Techniques.Flash).playOn(yourView);
  
  YoYo.with(Techniques.Pulse).playOn(yourView);
  
  YoYo.with(Techniques.RubberBand).playOn(yourView);
  
  YoYo.with(Techniques.Shake).playOn(yourView);


```
主项目app中所引用到的库有：
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:support-v4:22.0.0'
    compile 'com.android.support:appcompat-v7:22.0.0'
    compile 'com.android.support:cardview-v7:21.0.3'
    compile 'com.android.support:recyclerview-v7:21.0.3'
    compile 'com.jakewharton:butterknife:6.1.0'
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'com.squareup.picasso:picasso:2.5.2'
}
```

module中只有动画代码，这里引用了nineoldandroids库:
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
   
    compile 'com.nineoldandroids:library:2.4.0'
}

```
动画jar文件：
[jar文件下载](https://github.com/emingu/EminLibDemo/blob/patch-1/app/libs/emin_animotion_lib.jar)  

