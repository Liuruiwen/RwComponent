package com.rw.login

import com.rw.component_factory.bean.AccountBean
import com.rw.component_factory.inter.IAccountService
import com.rw.component_factory.inter.ILoginStateListener

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
class AccountService :IAccountService{
    override fun isLogin(): Boolean {
        return AccountUnit.userInfo!=null
    }

    override fun  getLoginBean(): AccountBean? {
        return AccountUnit.userInfo
    }

//    override fun setLoginStateListener(listener: ILoginStateListener) {
//        AccountUnit.listener=listener
//    }
}