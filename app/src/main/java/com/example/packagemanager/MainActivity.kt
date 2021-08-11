package com.example.packagemanager

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val intent:Intent  = Intent(Intent.ACTION_DELETE)
        intent.setData(Uri.parse("package:com.example.packagemanager"))
        startActivity(intent)

//        val youtubeInstalled: Boolean = appInstalled("com.google.android.youtube")
//        if (youtubeInstalled) {
//            Log.d("akshay-y", "youtube Installed");
//        } else
//            Log.d("akshay-y", "youtube not Installed");

//all package name
//        val packages = packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
//        for (packageInfo in packages) {
//            Log.d("akshay", "Package name:" + packageInfo.packageName)
//        }
    }

//        val packages2 = packageManager.getInstallSourceInfo("com.google.android.youtube")
//        val chkInstall= isPackageInstalled("com.google.android.youtube",packageManager)



//if package install
//    private fun appInstalled(uri: String): Boolean {
//        val pm = packageManager
//        var app_installed = false
//        app_installed = try {
//            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES)
//            true
//        } catch (e: PackageManager.NameNotFoundException) {
//            false
//        }
//        return app_installed
//    }

//    private fun isPackageInstalled(packageName: String, packageManager: PackageManager): Boolean {
//        return try {
//            packageManager.getPackageInfo(packageName, 0)
//            true
//        } catch (e: PackageManager.NameNotFoundException) {
//            false
//        }
//    }


}