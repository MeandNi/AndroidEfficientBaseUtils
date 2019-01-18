# AndroidEfficientBaseUtils

[![](https://jitpack.io/v/MeandNi/AndroidEfficientBaseUtils.svg)](https://jitpack.io/#MeandNi/AndroidEfficientBaseUtils)

**Collecting the following utils and build some base Classes.**

This library is based on the principle of making development simpler and more efficient. Try to abstract all the shared code parts (including the layout). It is equivalent to giving you a beautiful and complete box. You just need to put in what you need. it is good. Welcome students to join us

## Update Log

 - **20190110** Base Avtivity and Fragment And examples
 - **20190112** Many tools and optimized BaseDrawerActivity 
 - **20190118** Optimize ToastUtils And add SPUtils

## Table of Contents

1. [Get started](#get-started)
2. [base](#base)
   1. BaseActivity
   2. BaseToolbarActivity
   3. BaseBackActivity
   4. BaseDrawerActivity
   5. BaseFragment
   6. BaseLazyFragment
3. [utils](#utils)
   1. Utils
   2. ActivityUtils
   3. FragmentUtils
   4. ToastUtils
   5. BarUtils
   6. LogUtils
   7. PermissionUtils
   8. SPUtils

## get-started

**Step 1.** Add the JitPack repository to your build file

 ```groovy
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```

**Step 2.** Add the dependency

```groovy
	dependencies {
	        implementation 'com.github.MeandNi:AndroidSampleBaseUtils:Tag'
	}
```

## Author

-	Yangjiakang, **[MeandNi](https://meandni.com)**



## License

	Copyright (c) 2014 Drew Heavner
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
	either express or implied. See the License for the specific
	language governing permissions and limitations under the License.
