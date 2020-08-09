package com.rw.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.rw.component_factory.ServiceFactory
import com.rw.component_factory.bean.AccountBean
import kotlinx.android.synthetic.main.activity_login.*
@Route(path = "/login/LoginActivity")
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_close.setOnClickListener {
            finish()
        }
        btn_commit.setOnClickListener {
            val name=et_name.text.toString().trim()
            val pwd=et_pwd.text.toString().trim()
            if (name.isEmpty())
            {
                showToast("用户名不能为空")
                return@setOnClickListener
            }
            if (pwd.isEmpty())
            {
                showToast("密码不能为空")
                return@setOnClickListener
            }

            AccountUnit.userInfo= AccountBean(name,pwd,"这是一个牛x的人")
            ServiceFactory.get().setAccountService(AccountService())
            ServiceFactory.get().getILoginStateListener()?.login()
            finish()

        }
    }

    private fun showToast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}
