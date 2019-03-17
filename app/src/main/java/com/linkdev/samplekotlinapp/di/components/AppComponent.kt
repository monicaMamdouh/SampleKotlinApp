package com.linkdev.samplekotlinapp.di.components

import com.linkdev.samplekotlinapp.SampleKotlinApplication
import com.linkdev.samplekotlinapp.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun sampleApplicationBind(sampleKotlinApplication: SampleKotlinApplication): Builder

    }

    fun inject(sampleKotlinApplication: SampleKotlinApplication)


}