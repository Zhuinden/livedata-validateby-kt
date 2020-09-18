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
import androidx.lifecycle.Transformations
import androidx.lifecycle.map
import com.zhuinden.livedatacombinetuplekt.combineTuple
import com.zhuinden.tupleskt.*

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2)) { (t1, t2) ->
    (t1 ?: false) && (t2 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3)) { (t1, t2, t3) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4)) { (t1, t2, t3, t4) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5)) { (t1, t2, t3, t4, t5) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6)) { (t1, t2, t3, t4, t5, t6) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>): LiveData<Boolean>  = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7)) { (t1, t2, t3, t4, t5, t6, t7) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>): LiveData<Boolean>  = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8)) { (t1, t2, t3, t4, t5, t6, t7, t8) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>, f12: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false) && (t12 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>, f12: LiveData<Boolean>, f13: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false) && (t12 ?: false) && (t13 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>, f12: LiveData<Boolean>, f13: LiveData<Boolean>, f14: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false) && (t12 ?: false) && (t13 ?: false) && (t14 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>, f12: LiveData<Boolean>, f13: LiveData<Boolean>, f14: LiveData<Boolean>, f15: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false) && (t12 ?: false) && (t13 ?: false) && (t14 ?: false) && (t15 ?: false)
}

fun validateBy(f1: LiveData<Boolean>, f2: LiveData<Boolean>, f3: LiveData<Boolean>, f4: LiveData<Boolean>, f5: LiveData<Boolean>, f6: LiveData<Boolean>, f7: LiveData<Boolean>, f8: LiveData<Boolean>, f9: LiveData<Boolean>, f10: LiveData<Boolean>, f11: LiveData<Boolean>, f12: LiveData<Boolean>, f13: LiveData<Boolean>, f14: LiveData<Boolean>, f15: LiveData<Boolean>, f16: LiveData<Boolean>): LiveData<Boolean> = Transformations.map(combineTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) ->
    (t1 ?: false) && (t2 ?: false) && (t3 ?: false) && (t4 ?: false) && (t5 ?: false) && (t6 ?: false) && (t7 ?: false) && (t8 ?: false) && (t9 ?: false) && (t10 ?: false) && (t11 ?: false) && (t12 ?: false) && (t13 ?: false) && (t14 ?: false) && (t15 ?: false) && (t16 ?: false)
}