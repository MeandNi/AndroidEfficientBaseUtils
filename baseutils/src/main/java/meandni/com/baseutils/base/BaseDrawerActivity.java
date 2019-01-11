package meandni.com.baseutils.base;

import android.support.annotation.LayoutRes;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

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

//    NavigationView.OnNavigationItemSelectedListener mListener = new NavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.action_git_hub:
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Config.GITHUB)));
//                    break;
//                case R.id.action_blog:
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Config.BLOG)));
//                    break;
//            }
//            return false;
//        }
//    };

    @Override
    protected void setBaseView(@LayoutRes int layoutId) {
        mContentView = LayoutInflater.from(this).inflate(R.layout.activity_base_drawer, null);
        setContentView(mContentView);
        rootLayout = findViewById(R.id.root_layout);
        flActivityContainer = findViewById(R.id.activity_container);
        flActivityContainer.addView(LayoutInflater.from(this).inflate(layoutId, flActivityContainer, false));
        navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(getNavigationItemSelectedListener());
    }

//    protected abstract NavigationView.OnNavigationItemSelectedListener getNavigationItemSelectedListener();
}
