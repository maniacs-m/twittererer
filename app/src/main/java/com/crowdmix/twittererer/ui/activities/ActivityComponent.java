package com.crowdmix.twittererer.ui.activities;

import com.crowdmix.twittererer.App;

import dagger.Component;

@PerActivity
@Component(dependencies = App.BaseApplicationComponent.class)
public interface ActivityComponent {

    void inject(TimelineActivity activity);
}
