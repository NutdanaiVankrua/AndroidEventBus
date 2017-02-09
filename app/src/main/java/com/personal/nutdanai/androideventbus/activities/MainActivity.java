package com.personal.nutdanai.androideventbus.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.personal.nutdanai.androideventbus.R;
import com.personal.nutdanai.androideventbus.models.MessageEvent;
import com.personal.nutdanai.androideventbus.utils.RedirectUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //region
    @BindView(R.id.event_message)
    TextView eventMessage;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.redirect_search)
    public void redirectSearchBtnClick() {
        RedirectUtils.redirectSearch(this);
    }

}
