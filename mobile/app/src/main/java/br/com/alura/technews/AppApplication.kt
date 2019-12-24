package br.com.alura.technews

import android.app.Application
import br.com.alura.technews.di.modules.appModules
import br.com.alura.technews.di.modules.appModulesUI
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(listOf(appModules, appModulesUI))
        }
    }
}