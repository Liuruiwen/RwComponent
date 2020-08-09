package com.rw.component_factory.inter

import com.rw.component_factory.bean.AccountBean

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
interface IAccountService {
    fun isLogin(): Boolean
    fun getLoginBean(): AccountBean?
}