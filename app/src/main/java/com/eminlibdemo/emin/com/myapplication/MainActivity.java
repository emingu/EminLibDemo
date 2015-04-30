package com.eminlibdemo.emin.com.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.emin.androidanimations.library.Techniques;
import com.emin.androidanimations.library.YoYo;
import com.eminlibdemo.R;
import com.eminlibdemo.emin.com.myapplication.materialdrawer.NavigationDrawerCallbacks;
import com.eminlibdemo.emin.com.myapplication.materialdrawer.NavigationDrawerFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerCallbacks {

    public final static String ARG_SECTION_NUMBER = "positon";
    private Toolbar mToolbar;
    private CharSequence mTitle;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private DrawerLayout mDrawerLayout;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setElevation(0);
        mNavigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
//        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
//                .commit();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, PlaceholderFragment.newInstance(position + 1)).commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = YoYo.with(Techniques.Flash).getClass().getSimpleName();
                break;
            case 2:
                mTitle = YoYo.with(Techniques.Pulse).getClass().getSimpleName();
                break;
            case 3:
                mTitle = YoYo.with(Techniques.RubberBand).getClass().getSimpleName();
                break;
            case 4:
                mTitle = YoYo.with(Techniques.Shake).getClass().getSimpleName();
                break;
            case 5:
                mTitle = YoYo.with(Techniques.Swing).getClass().getSimpleName();
                break;
            case 6:
                mTitle = YoYo.with(Techniques.Wobble).getClass().getSimpleName();
                break;
            case 7:
                mTitle = YoYo.with(Techniques.Bounce).getClass().getSimpleName();
                break;
            case 8:
                mTitle = YoYo.with(Techniques.Tada).getClass().getSimpleName();
                ;
                break;
            case 9:
                mTitle = YoYo.with(Techniques.StandUp).getClass().getSimpleName();
                ;
                break;
            case 10:
                mTitle = YoYo.with(Techniques.Wave).getClass().getSimpleName();
                ;
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            mToolbar.setTitle(mTitle);
            return true;
        }
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            if (mDrawerLayout.isDrawerOpen(Gravity.START)) {
                mDrawerLayout.closeDrawer(Gravity.START);
            } else {
                mDrawerLayout.openDrawer(Gravity.START);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        @InjectView(R.id.section_label)
        TextView sectionLabel;

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ButterKnife.inject(this, rootView);
            int arg = getArguments().getInt(ARG_SECTION_NUMBER);
            switch (arg) {
                case 1:
                    YoYo.with(Techniques.Flash).playOn(sectionLabel);
                    break;
                case 2:
                    YoYo.with(Techniques.Pulse).playOn(sectionLabel);
                    break;
                case 3:
                    YoYo.with(Techniques.RubberBand).playOn(sectionLabel);
                    break;
                case 4:
                    YoYo.with(Techniques.Shake).playOn(sectionLabel);
                    break;
                case 5:
                    YoYo.with(Techniques.Swing).playOn(sectionLabel);
                    break;
                case 6:
                    YoYo.with(Techniques.Wobble).playOn(sectionLabel);
                    break;
                case 7:
                    YoYo.with(Techniques.Bounce).playOn(sectionLabel);
                    break;
                case 8:
                    YoYo.with(Techniques.Tada).playOn(sectionLabel);
                    break;
                case 9:
                    YoYo.with(Techniques.StandUp).playOn(sectionLabel);
                    break;
                case 10:
                    YoYo.with(Techniques.Wave).playOn(sectionLabel);
                    break;

            }

            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            ButterKnife.reset(this);
        }
    }

}
