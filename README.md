# EminLibDemo

Demo演示:

![](https://github.com/emingu/EminLibDemo/blob/master/2015-04-30%2017_20_40.gif)  



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

module中只有动画代码:
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:22.0.0'
    compile 'com.nineoldandroids:library:2.4.0'
}

```

[jar文件下载](https://github.com/emingu/EminLibDemo/blob/patch-1/app/libs/emin_animotion_lib.jar)  

