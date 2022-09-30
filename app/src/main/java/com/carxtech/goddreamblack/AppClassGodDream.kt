package com.carxtech.goddreamblack

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AppClassGodDream : Application() {
    companion object {
        const val SJSJDQWD = "2kwLuWc8LufgzSWpLB7mYa"
        const val jsuwuwdw = "3c1c"
        const val YSUUDUWQD = "38495978-2f7a-4c80-911b-0c6974ac4014"

        val ahhahhdwjdjw = "http://godsofdream"
        val bxgxgcgqwwd = ".xyz/go.php?to=1&"
        val isisdiwowodow = "http://godsofdream"
        val xcxcsccqdwqd = ".xyz/apps.txt"


        val sgsggdgwd = "sub_id_1="

        var AHHASHQHS: String? = ""
        var AASQSQSQSQ: String? = "c11"
        var SPDPWPDOWOD: String? = "d11"

    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            iwidiwdqdwqfqwf(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(YSUUDUWQD)


    }

    private suspend fun iwidiwdqdwqfqwf(context: Context) {
        val advertisingInfo = GodAdv(context)
        val idInfo = advertisingInfo.ospsdooodwd()

        val prefs = getSharedPreferences("SP", MODE_PRIVATE)
        val editor = prefs.edit()

        editor.putString(AHHASHQHS, idInfo)
        editor.apply()
    }
}

class GodAdv (context: Context) {
    private val adInfo = AdvertisingIdClient(context.applicationContext)
    suspend fun ospsdooodwd(): String =
        withContext(Dispatchers.IO) {
            adInfo.start()
            val adIdInfo = adInfo.info
            Log.d("getAdvertisingId = ", adIdInfo.id.toString())
            adIdInfo.id
        }
}