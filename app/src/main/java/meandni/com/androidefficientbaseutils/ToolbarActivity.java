package meandni.com.androidefficientbaseutils;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import meandni.com.baseutils.base.BaseToolbarActivity;

public class ToolbarActivity extends BaseToolbarActivity {


    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_toolbar;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerActivity.start(ToolbarActivity.this);
            }
        });

    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
