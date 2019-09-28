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
package com.linecorp.lich.viewmodel.test.mockitokotlin

import android.content.Context
import com.linecorp.lich.viewmodel.AbstractViewModel
import com.linecorp.lich.viewmodel.ViewModelFactory

// Since Mockito's inline mocking doesn't work on Android instrumentation tests,
// mocked class needs to be open.
open class FooViewModel : AbstractViewModel() {

    open fun greeting(): String {
        return "Hello, I'm Foo."
    }

    open fun countItem(): Int {
        return 10
    }

    companion object : ViewModelFactory<FooViewModel>() {
        override fun createViewModel(context: Context): FooViewModel = FooViewModel()
    }
}
