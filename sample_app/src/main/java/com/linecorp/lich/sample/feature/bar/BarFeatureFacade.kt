/*
 * Copyright 2019 LINE Corporation
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
package com.linecorp.lich.sample.feature.bar

import android.content.Context
import com.linecorp.lich.component.ComponentFactory

/**
 * The Facade of the "bar" feature.
 * https://en.wikipedia.org/wiki/Facade_pattern
 *
 * This component defines the API of the "bar" feature.
 */
interface BarFeatureFacade {
    /**
     * Launches `BarFeatureActivity`.
     */
    fun launchBarFeatureActivity()

    fun getMessage(): String

    companion object : ComponentFactory<BarFeatureFacade>() {
        override fun createComponent(context: Context): BarFeatureFacade =
            delegateToServiceLoader(context)
    }
}
