package com.nano.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.nano.myappportfolio.Utils.Utility;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnSpotifyStmr, mBtnScoresAp, mBtnLibrary, mBtnBuildIt, mBtnXyxRdr, mBtnCapstone;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        iniViewReferences();


    }

    private void iniViewReferences() {
        setUpToolBar();
        mBtnSpotifyStmr = (Button) findViewById(R.id.home_spotify_btnvw);
        mBtnScoresAp = (Button) findViewById(R.id.home_scores_btnvw);
        mBtnLibrary = (Button) findViewById(R.id.home_library_btnvw);
        mBtnBuildIt = (Button) findViewById(R.id.home_build_it_btnvw);
        mBtnXyxRdr = (Button) findViewById(R.id.home_xyz_btnvw);
        mBtnCapstone = (Button) findViewById(R.id.home_capstone_btnvw);
        setListners();
    }

    private void setListners() {
        mBtnSpotifyStmr.setOnClickListener(this);
        mBtnScoresAp.setOnClickListener(this);
        mBtnLibrary.setOnClickListener(this);
        mBtnBuildIt.setOnClickListener(this);
        mBtnXyxRdr.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);


    }

    private void setUpToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.home_spotify_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_spotify_app));
                break;
            case R.id.home_scores_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_scores_app));
                break;
            case R.id.home_library_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_library_app));
                break;
            case R.id.home_build_it_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_build_it_app));
                break;
            case R.id.home_xyz_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_xyx_reader_app));
                break;
            case R.id.home_capstone_btnvw:
                Utility.showToast(mContext, getResources().getString(R.string.msg_capstone_app));
                break;
            default:
                break;

        }
    }


}
