package com.zhan.hy.ktarmor.account

import android.app.Application
import android.text.TextUtils
import com.zhan.hy.ktarmor.R
import com.zhan.hy.ktarmor.account.data.AccountRepository
import com.zhan.hy.mvvm.common.SharedData
import com.zhan.hy.mvvm.mvvm.BaseViewModel

/**
 * @author  hyzhan
 * @date    2019/5/23
 * @desc    TODO
 */
class AccountViewModel(application: Application) : BaseViewModel<AccountRepository>(application) {

    override fun bindRepository(): AccountRepository = AccountRepository()

    fun login(account: String, password: String) {

        if (TextUtils.isEmpty(account) || TextUtils.isEmpty(password)) {
            sharedData.value = SharedData(strRes = R.string.account_or_password_empty)
        }else{
            repository.login(account, password)
        }
    }
}