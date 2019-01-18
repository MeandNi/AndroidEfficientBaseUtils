package meandni.com.androidefficientbaseutils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import meandni.com.androidefficientbaseutils.toast.ToastActivity;
import meandni.com.baseutils.base.BaseBackActivity;

public class UtilsActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, UtilsActivity.class);
        context.startActivity(starter);
    }

    public void toastClick(View view) {
        ToastActivity.start(this);
    }

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_utils;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {

    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
