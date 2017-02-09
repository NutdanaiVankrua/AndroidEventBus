package com.personal.nutdanai.androideventbus.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.personal.nutdanai.androideventbus.R;
import com.personal.nutdanai.androideventbus.models.MessageEvent;
import com.personal.nutdanai.androideventbus.utils.AlertUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchActivity extends BaseActivity {

    //region
    @BindView(R.id.event_message)
    TextView eventMessage;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent.SearchActivityEvent event) {
        eventMessage.setText(event.getMessage());
    }

    @OnClick(R.id.broadcast_event_btn)
    public void broadCastButtonClicked() {
        EventBus.getDefault().post(new MessageEvent.SearchFragmentEvent("Hi every fragments inside me"));
        AlertUtils.showSnackBar(getWindow().getDecorView(), "Broadcast message");
    }

}
