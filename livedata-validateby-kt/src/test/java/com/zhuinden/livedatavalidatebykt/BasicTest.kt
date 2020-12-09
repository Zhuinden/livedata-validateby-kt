package com.zhuinden.livedatavalidatebykt


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test


class BasicTest {
    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun checkLiveDatas() {
        val liveData1 = MutableLiveData<Boolean>()
        val liveData2 = MutableLiveData<Boolean>()
        val liveData3 = MutableLiveData<Boolean>(true)

        val validated = validateBy(liveData1, liveData2, liveData3)

        assertThat(validated.value).isFalse()

        liveData1.value = true

        assertThat(validated.value).isFalse()
        validated.observeForTesting { assertThat(it).isFalse() }

        liveData2.value = true
        assertThat(validated.value).isFalse() // Mediator only runs when active
        validated.observeForTesting { assertThat(it).isTrue() }

        liveData2.value = false
        assertThat(validated.value).isTrue() // Mediator only runs when active
        validated.observeForTesting { assertThat(it).isFalse() }
    }

    @Test
    fun checkInitialTrue() {
        val liveData1 = MutableLiveData<Boolean>(true)
        val liveData2 = MutableLiveData<Boolean>(true)
        val liveData3 = MutableLiveData<Boolean>(true)

        val validated = validateBy(liveData1, liveData2, liveData3)

        assertThat(validated.value).isTrue()

        liveData3.value = false

        validated.observeForTesting { assertThat(it).isFalse() }

        liveData3.value = true

        validated.observeForTesting { assertThat(it).isTrue() }
    }
}