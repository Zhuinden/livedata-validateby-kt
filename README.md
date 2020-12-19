# LiveData-ValidateBy-KT

LiveData-ValidateBy-KT contains helper functions for LiveData, to combine multiple LiveDatas that hold booleans into a single emitted boolean.

``` kotlin
validateBy(liveDataBoolean1, liveDataBoolean2, liveDataBoolean3)
    .observe(lifecycleOwner) { isEnabled ->
        // do something with combined boolean
    }
```

## Why?

It's useful when you want to combine multiple boolean streams together and simplify creating a condition based on them.

## Using LiveData-ValidateBy-KT

In order to use LiveData-ValidateBy-KT, you need to add `jitpack` to your project root `build.gradle.kts`
(or `build.gradle`):

``` kotlin
// build.gradle.kts
allprojects {
    repositories {
        // ...
        maven { setUrl("https://jitpack.io") }
    }
    // ...
}
```

or

``` groovy
// build.gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
    // ...
}
```

and then, add the dependency to your module's `build.gradle.kts` (or `build.gradle`):

``` kotlin
// build.gradle.kts
implementation("com.github.Zhuinden:livedata-validateby-kt:2.1.0")
```

or

``` groovy
// build.gradle
implementation 'com.github.Zhuinden:livedata-validateby-kt:2.1.0'
```

## License

    Copyright 2020 Gabor Varadi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
