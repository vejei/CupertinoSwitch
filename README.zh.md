![](https://img.shields.io/badge/%E4%B8%AD%E6%96%87-inactive?style=for-the-badge&logo=google-translate)
[![](https://img.shields.io/badge/English-informational?style=for-the-badge&logo=google-translate)](./README.md)

# CupertinoSwitch
![Version](https://img.shields.io/badge/version-1.0.0--alpha-blue)
![License](https://img.shields.io/github/license/vejei/CupertinoSwitch)
![Min SDK](https://img.shields.io/badge/minSdkVersion-21-informational)
![Last Commit](https://img.shields.io/github/last-commit/vejei/CupertinoSwitch)

iOS 风格的开关控件
<p align="center">
    <img src="cupertino_switch.gif">
</p>

## 快速开始
### 添加依赖
```groovy
dependencies {
    implementation 'io.github.vejei.cupertinoswitch:cupertinoswitch:x.y.z'
}
```

### 设置
```xml
<io.github.vejei.cupertinoswitch.CupertinoSwitch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:trackOffColor="#dddddd"
    app:trackOnColor="@color/purple_500"/>
```

更多示例请查看 [sample](./sample)

## `Xml`属性
|属性|描述|类型|示例值|
|---|---|---|---|
|`switchWidth`|开关的整体宽度|`dimension`|`100dp`|
|`switchHeight`|开关的整体高度|`dimension`|`20dp`|
|`switchDuration`|开关滑块滑动动画的时间，单位是毫秒|`integer`|`1000`|
|`trackOnColor`|开关轨道在开启状态下的颜色|`color`|`#fa0000`|
|`trackOffColor`|开关轨道在关闭状态下的颜色|`color`|`#dddddd`|
|`sliderColor`|滑块的颜色|`color`|`#000000`|
|`sliderRadius`|滑块的半径|`dimension`|`20dp`|
|`sliderShadowEnabled`|滑块是否开启阴影|`boolean`|`true`|
|`sliderShadowColor`|滑块阴影的颜色|`color`|`#eeeeee`|
|`sliderShadowRadius`|滑块阴影的半径|`dimension`|`10dp`|

## Change Log
[Change Log](./CHANGELOG.md)

## License
[MIT](./LICENSE)
