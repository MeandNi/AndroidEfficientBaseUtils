package meandni.com.baseutils.base;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
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
public abstract class BaseToolbarActivity extends BaseActivity {

    protected CoordinatorLayout rootLayout;
    protected Toolbar mToolBar;
    protected FrameLayout flActivityContainer;

    @Override
    protected void setBaseView(@LayoutRes int layoutId) {
        mContentView = LayoutInflater.from(this).inflate(R.layout.activity_base_toolbar, null);
        setContentView(mContentView);
        rootLayout = findViewById(R.id.root_layout);
        flActivityContainer = findViewById(R.id.activity_container);
        flActivityContainer.addView(LayoutInflater.from(this).inflate(layoutId, flActivityContainer, false));
        initToolbar();
    }

    public void initToolbar()
    {
        mToolBar = (Toolbar)findViewById(R.id.toolbar);
        setTitle("ToolBar Activity");
    }

    protected void setLogo(Drawable paramDrawable)
    {
        if (this.mToolBar != null) {
            this.mToolBar.setLogo(paramDrawable);
        }
    }

    protected void setMenu(int paramInt, Toolbar.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
        if (this.mToolBar != null)
        {
            this.mToolBar.inflateMenu(paramInt);
            this.mToolBar.setOnMenuItemClickListener(paramOnMenuItemClickListener);
        }
    }

    protected void setNavigationIcon(Drawable paramDrawable)
    {
        if (this.mToolBar != null) {
            this.mToolBar.setNavigationIcon(paramDrawable);
        }
    }

    protected void setSubTitle(String paramString)
    {
        if (this.mToolBar != null) {
            this.mToolBar.setSubtitle(paramString);
        }
    }

    public void setTitle(int paramInt)
    {
        if (this.mToolBar != null) {
            this.mToolBar.setTitle(paramInt);
        }
    }

    protected void setTitle(String paramString)
    {
        if (this.mToolBar != null) {
            this.mToolBar.setTitle(paramString);
        }
    }

    public void setToolBarColor(int paramInt)
    {
        this.mToolBar.setTitleTextColor(paramInt);
    }

    @TargetApi(19)
    protected void setTranslucentStatus(boolean paramBoolean) {
        Window localWindow = getWindow();
        WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
        if (paramBoolean) {
        }
        for (localLayoutParams.flags |= 0x4000000; ; localLayoutParams.flags &= 0xFBFFFFFF) {
            localWindow.setAttributes(localLayoutParams);
            return;
        }
    }
}
