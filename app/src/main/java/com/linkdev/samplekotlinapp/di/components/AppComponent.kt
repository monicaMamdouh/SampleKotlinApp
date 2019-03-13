package com.linkdev.samplekotlinapp.di.components

import com.linkdev.samplekotlinapp.di.modules.AppModule
import com.linkdev.samplekotlinapp.utils.SampleKotlinApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): AppComponent
//    }

    fun inject(sampleKotlinApplication: SampleKotlinApplication)
}