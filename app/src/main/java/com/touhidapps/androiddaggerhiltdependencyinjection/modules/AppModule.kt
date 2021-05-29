package com.touhidapps.androiddaggerhiltdependencyinjection.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.*
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

// Mark-5
@Module // Tell the hilt that this object is a module
@InstallIn(SingletonComponent::class) // This will alive for entire app lifecycle
//@InstallIn(ActivityComponent::class) // This will alive for Activity lifecycle
//@InstallIn(FragmentComponent::class) // This will alive for Fragment lifecycle
//@InstallIn(ViewComponent::class) // This will alive for view lifecycle
//@InstallIn(ServiceComponent::class) // This will alive for Service lifecycle
//@InstallIn(ViewModelComponent::class) // This will alive for ViewModel lifecycle
object AppModule {

    // Mark-6
    @Singleton // To make this function singleton and will not recreate instance, for SingletonComponent
    @Provides // Tell that we want to provide the dependency
    @Named("my_string") // Call by this name after inject
    fun provideMyString() = "This is a string"

}