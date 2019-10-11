package com.zsy.utilsktx.app

import android.app.Application
import zsy.utils.Utils

class AppContext : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }

}
