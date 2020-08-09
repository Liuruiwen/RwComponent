package com.rw.component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.rw.component_factory.ServiceFactory
import com.rw.component_factory.inter.LoginListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_name.text="未登录状态"
        btn_looking.setOnClickListener {
              if (ServiceFactory.get().getAccountService().isLogin()){
                  ARouter.getInstance().build("/person_center/PersonCenterActivity").navigation()
              }else{
                  ARouter.getInstance().build("/login/LoginActivity").navigation()
              }
        }


        ServiceFactory.get().setLoginStateListener(object :LoginListener(){
            override fun login() {
                super.login()
                tv_name.text=ServiceFactory.get().getAccountService().getLoginBean()?.userName
            }

            override fun loginOut() {
                super.loginOut()
                tv_name.text="未登录状态"
            }
        })
    }
}
