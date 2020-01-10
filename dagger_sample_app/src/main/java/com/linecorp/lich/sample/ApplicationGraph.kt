/*
 * Copyright 2020 LINE Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linecorp.lich.sample

import android.content.Context
import com.linecorp.lich.component.ComponentFactory
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * The root Dagger [Component] for this application.
 */
@Singleton
@Component(modules = [AppModule::class])
interface ApplicationGraph {

    fun applicationContext(): Context

    fun viewModelsGraphFactory(): AppViewModelsGraph.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationGraph
    }

    companion object : ComponentFactory<ApplicationGraph>() {
        override fun createComponent(context: Context): ApplicationGraph =
            DaggerApplicationGraph.factory().create(context)
    }
}
