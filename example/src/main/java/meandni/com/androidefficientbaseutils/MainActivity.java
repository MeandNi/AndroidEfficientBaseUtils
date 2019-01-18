package meandni.com.androidefficientbaseutils;


import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;
import butterknife.OnClick;
import meandni.com.baseutils.base.BaseDrawerActivity;
import meandni.com.baseutils.utils.BarUtils;
import meandni.com.baseutils.utils.ToastUtils;

public class MainActivity extends BaseDrawerActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.fake_status_bar)
    View fakeStatusBar;

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {
        CollapsingToolbarLayout ctl = findViewById(R.id.ctl);
        ctl.setExpandedTitleColor(Color.parseColor("#00FFFFFF"));
        setSupportActionBar(mToolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                rootLayout,
                mToolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        rootLayout.addDrawerListener(toggle);
        toggle.syncState();

        setNavigationItemSelectedListener(new MyNavigationItemSelectedListener() {
            @Override
            public void OnClickItem(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_git_hub:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Config.GITHUB)));
                        break;
                    case R.id.action_blog:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Config.BLOG)));
                        break;
                }
            }
        });

        BarUtils.setStatusBarAlpha4Drawer(this, rootLayout, fakeStatusBar, 0, false);
        BarUtils.addMarginTopEqualStatusBarHeight(mToolbar);
    }

    @Override
    public void doBusiness() {

    }

    @Override
    @OnClick({R.id.btn_base, R.id.btn_utils})
    public void onWidgetClick(View view) {
        switch (view.getId()) {
            case R.id.btn_base:
                ToastUtils.showShort("base");
                break;
            case R.id.btn_utils:
                UtilsActivity.start(this);
                break;
        }
    }

    @Override
    protected int bindHeaderlayout() {
        return R.layout.nav_header_main;
    }

    @Override
    protected int bindMenu() {
        return R.menu.main_drawer;
    }
}
