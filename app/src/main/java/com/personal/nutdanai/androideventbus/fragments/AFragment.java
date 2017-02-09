package com.personal.nutdanai.androideventbus.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.personal.nutdanai.androideventbus.R;
import com.personal.nutdanai.androideventbus.models.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AFragment extends Fragment {

    //region Views
    @BindView(R.id.event_message)
    TextView eventMessage;
    //endregion

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @OnClick(R.id.broadcast_event_btn)
    public void broadCastParentBtnClicked() {
        EventBus.getDefault().post(new MessageEvent.SearchActivityEvent("Hi my parent view"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent.SearchFragmentEvent event) {
        eventMessage.setText(event.getMessage());
    }

}
