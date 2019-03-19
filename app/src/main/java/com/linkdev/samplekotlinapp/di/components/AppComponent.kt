package com.linkdev.samplekotlinapp.di.components

import com.linkdev.samplekotlinapp.SampleKotlinApplication
import com.linkdev.samplekotlinapp.di.modules.ActivityModule
import com.linkdev.samplekotlinapp.di.modules.AppModule
import com.linkdev.samplekotlinapp.di.modules.FragmentModule
import com.linkdev.samplekotlinapp.di.modules.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [RepositoryModule::class, AppModule::class, AndroidSupportInjectionModule::class, ActivityModule::class, FragmentModule::class])
interface AppComponent : AndroidInjector<SampleKotlinApplication> {
    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun sampleApplicationBind(sampleKotlinApplication: SampleKotlinApplication): Builder

    }


}