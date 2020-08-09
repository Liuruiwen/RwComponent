package com.rw.component_factory

import com.rw.component_factory.bean.AccountBean
import com.rw.component_factory.inter.IAccountService
import com.rw.component_factory.inter.ILoginStateListener

/**
 * Created by Amuse
 * Date:2020/8/9.
 * Desc:
 */
class ServiceFactory {
    private var accountService: IAccountService? = null
    private var listener: ILoginStateListener?=null
    private var accountBean: AccountBean?=null
    companion object{
        private var instance: ServiceFactory? = null
            get() {
                if (field == null) {
                    field = ServiceFactory()
                }
                return field
            }
        fun get(): ServiceFactory{
            return instance!!
        }
    }

    /**
     * 设置登录信息
     */
    fun setAccountService(accountService: IAccountService?) {
        this.accountService = accountService
    }

    /**
     * 获取登录信息
     */
    fun getAccountService(): IAccountService {
        if (accountService == null) {
            accountService = EmptyAccountService()
        }
        return accountService!!
    }

    fun setLoginStateListener(listener: ILoginStateListener){
        this.listener=listener
    }

    fun getILoginStateListener():ILoginStateListener?{
        return this.listener
    }


}
