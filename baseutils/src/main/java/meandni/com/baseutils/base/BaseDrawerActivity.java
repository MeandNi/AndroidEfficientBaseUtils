package meandni.com.baseutils.base;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.OnClick;
import meandni.com.baseutils.R;


/**
 * <pre>
 *     author: Meandni
 *     blog  : http://meandni.com
 *     time  : 2019/01/10
 *     desc  : base about drawer activity
 * </pre>
 */
public abstract class BaseDrawerActivity extends BaseActivity {

    protected DrawerLayout rootLayout;
    protected FrameLayout flActivityContainer;
    protected NavigationView navigationView;

    @Override
    protected void setBaseView(@LayoutRes int layoutId) {
        mContentView = LayoutInflater.from(this).inflate(R.layout.activity_base_drawer, null);
        setContentView(mContentView);
        rootLayout = findViewById(R.id.root_layout);
        flActivityContainer = findViewById(R.id.activity_container);
        flActivityContainer.addView(LayoutInflater.from(this).inflate(layoutId, flActivityContainer, false));
        navigationView = findViewById(R.id.nav_view);
        navigationView.inflateHeaderView(bindHeaderlayout());
        navigationView.inflateMenu(bindMenu());
    }

    protected abstract int bindHeaderlayout();
    protected abstract int bindMenu();

    public interface MyNavigationItemSelectedListener {
        void OnClickItem(MenuItem item);
    }

    protected void setNavigationItemSelectedListener(final MyNavigationItemSelectedListener listener){
        NavigationView.OnNavigationItemSelectedListener mListener = new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                listener.OnClickItem(item);
                return false;
            }
        };
        navigationView.setNavigationItemSelectedListener(mListener);
    }
}
