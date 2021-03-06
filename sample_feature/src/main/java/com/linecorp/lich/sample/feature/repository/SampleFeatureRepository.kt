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
package com.linecorp.lich.sample.feature.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.linecorp.lich.component.ComponentFactory
import com.linecorp.lich.sample.feature.R

class SampleFeatureRepository private constructor(private val context: Context) {

    fun getMessageAsLiveData(name: String): LiveData<String> =
        MutableLiveData(context.getString(R.string.repository_message, name))

    companion object : ComponentFactory<SampleFeatureRepository>() {
        override fun createComponent(context: Context): SampleFeatureRepository =
            SampleFeatureRepository(context)
    }
}
