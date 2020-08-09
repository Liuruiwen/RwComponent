package com.rw.person_center

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.rw.component_factory.EmptyAccountService
import com.rw.component_factory.ServiceFactory
import kotlinx.android.synthetic.main.activity_person_center.*
@Route(path = "/person_center/PersonCenterActivity")
class PersonCenterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_center)

        tv_desc.text=ServiceFactory.get().getAccountService()?.getLoginBean()?.userDesc
        tv_name.text=ServiceFactory.get().getAccountService()?.getLoginBean()?.userName
        btn_login_out.setOnClickListener {
            ServiceFactory.get().setAccountService(EmptyAccountService())
            ServiceFactory.get().getILoginStateListener()?.loginOut()
            finish()
        }
        btn_close.setOnClickListener {
            finish()
        }
    }
}
