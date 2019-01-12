# AndroidEfficientBaseUtils

[![](https://jitpack.io/v/MeandNi/AndroidEfficientBaseUtils.svg)](https://jitpack.io/#MeandNi/AndroidEfficientBaseUtils)

## [README of English](https://github.com/MeandNi/AndroidEfficientBaseUtils/README-EN.md)

**收集一些使用的基类和工具类，提高开发效率，让开发更简单.**

本库本着将开发更简单高效的原则，尽量做到将所有共用代码部分抽象化（包括布局），相当于给你一个完完整整地漂亮的盒子，你只需吧自己需要的东西放进去就好。欢迎同学们一起加入～

## 更新日志

- **20190110** Base Avtivity and Fragment And examples
- **20190112** Many tools and optimized BaseDrawerActivity 

## 内容列表

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

## 作者

- Yangjiakang, **[MeandNi](https://meandni.com)**



## License

```
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
```