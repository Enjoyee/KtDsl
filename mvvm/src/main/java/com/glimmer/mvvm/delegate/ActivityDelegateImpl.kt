package com.glimmer.mvvm.delegate

import android.app.Activity
import android.os.Bundle
import com.glimmer.mvvm.view.IActivity

open class ActivityDelegateImpl(private val activity: Activity) : ActivityDelegate {
    private val iActivity = activity as IActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        iActivity.initWidows()
        iActivity.initArgs(activity.intent.extras)
        activity.setContentView(iActivity.getLayoutId())
        iActivity.initBefore()
        iActivity.initView()
        iActivity.initData()
    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }

    override fun onSaveInstanceState(activity: Activity?, outState: Bundle?) {
    }
}