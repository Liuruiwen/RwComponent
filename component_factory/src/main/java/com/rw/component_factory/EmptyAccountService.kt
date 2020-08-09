package com.rw.component_factory

import com.rw.component_factory.bean.AccountBean
import com.rw.component_factory.inter.IAccountService
import com.rw.component_factory.inter.ILoginStateListener

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
class EmptyAccountService : IAccountService {
    override fun isLogin(): Boolean {
        return false
    }

    override fun  getLoginBean(): AccountBean? {
        return null
    }


}