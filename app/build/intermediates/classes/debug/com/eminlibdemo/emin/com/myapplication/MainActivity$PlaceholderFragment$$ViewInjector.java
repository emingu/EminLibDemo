// Generated code from Butter Knife. Do not modify!
package com.eminlibdemo.emin.com.myapplication;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$PlaceholderFragment$$ViewInjector<T extends com.eminlibdemo.emin.com.myapplication.MainActivity.PlaceholderFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296328, "field 'sectionLabel'");
    target.sectionLabel = finder.castView(view, 2131296328, "field 'sectionLabel'");
  }

  @Override public void reset(T target) {
    target.sectionLabel = null;
  }
}
