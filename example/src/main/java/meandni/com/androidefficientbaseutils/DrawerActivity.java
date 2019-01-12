package meandni.com.androidefficientbaseutils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;

import meandni.com.baseutils.base.BaseDrawerActivity;

public class DrawerActivity extends BaseDrawerActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, DrawerActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_drawer;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {
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
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

    @Override
    protected int bindHeaderlayout() {
        return R.layout.nav_header;
    }

    @Override
    protected int bindMenu() {
        return R.menu.main_drawer;
    }
}
