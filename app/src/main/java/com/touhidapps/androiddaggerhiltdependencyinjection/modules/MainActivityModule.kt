package com.touhidapps.androiddaggerhiltdependencyinjection.modules

import android.content.Context
import com.touhidapps.androiddaggerhiltdependencyinjection.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

// Mark-9
@Module
@InstallIn(ActivityComponent::class) // This object will alive as long as implemented activity
object MainActivityModule {

    // Mark-10
    @ActivityScoped
    @Provides
    @Named("my_string_2")
    fun provideMyAnotherString(
        @ApplicationContext context: Context,
        @Named("my_string") string: String
    ) = context.getString(R.string.my_another_string) + " - " + string

}