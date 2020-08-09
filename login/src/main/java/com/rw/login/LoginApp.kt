package com.rw.login

import android.app.Application
import com.rw.base.BaseApp
import com.rw.component_factory.ServiceFactory

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
class LoginApp :BaseApp(){
    override fun onCreate() {
        super.onCreate()
        initModuleApp(this)
        initModuleData(this)
    }
    override fun initModuleApp(application: Application?) {
        ServiceFactory.get().setAccountService(AccountService())
    }

    override fun initModuleData(application: Application?) {

    }
}