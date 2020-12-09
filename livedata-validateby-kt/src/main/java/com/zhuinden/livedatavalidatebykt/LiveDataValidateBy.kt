/*
 * Copyright 2020 Gabor Varadi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhuinden.livedatavalidatebykt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import com.zhuinden.livedatacombinetuplekt.combineTuple

fun validateBy(vararg liveDatas: LiveData<Boolean>): LiveData<Boolean> = MediatorLiveData<Boolean>().also { mediator ->
    mediator.value = liveDatas.all { it.value == true }

    for (current in liveDatas) {
        mediator.addSource(current, Observer { valid ->
            var isValid = valid
            if (isValid) {
                for (liveData in liveDatas) {
                    if (liveData !== current) {
                        if (liveData.value != true) {
                            isValid = false
                            break
                        }
                    }
                }
            }

            mediator.value = isValid
        })
    }
}