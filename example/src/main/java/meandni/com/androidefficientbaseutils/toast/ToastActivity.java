package meandni.com.androidefficientbaseutils.toast;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import meandni.com.androidefficientbaseutils.R;
import meandni.com.baseutils.base.BaseBackActivity;
import meandni.com.baseutils.utils.ToastUtils;

public class ToastActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ToastActivity.class);
        context.startActivity(starter);
    }

    public void show1(View view) {
        ToastUtils.showLong("显示长吐司");
    }


    public void show2(View view) {
        ToastUtils.showShort("显示短吐司");
    }

    public void show3(View view) {
        ToastUtils.setMsgColor(Color.GREEN);
        ToastUtils.showLong("字体颜色自定义");
    }

    public void show4(View view) {
        ToastUtils.setBgColor(ContextCompat.getColor(this, R.color.colorAccent));
        ToastUtils.showLong("背景颜色自定义");
    }

    public void show5(View view) {
        ToastUtils.showQQStyleShort("QQ样式吐司", Toast.LENGTH_SHORT);
    }

    public void show6(View view) {
        ToastUtils.showAlipayStyleShort("支付宝样式吐司", Toast.LENGTH_SHORT);
    }

    public void show7(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                CustomToast.showLong("自定义吐司");
            }
        }).start();
    }

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_toast;
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
