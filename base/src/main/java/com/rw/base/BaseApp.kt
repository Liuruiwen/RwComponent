package com.rw.base

import android.app.Application

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
abstract class  BaseApp :Application(){
    /**
     * Application 初始化
     */
    abstract fun initModuleApp(application: Application?)

    /**
     * 所有 Application 初始化后的自定义操作
     */
    abstract fun initModuleData(application: Application?)
}