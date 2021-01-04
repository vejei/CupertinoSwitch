![](https://img.shields.io/badge/English-inactive?style=for-the-badge&logo=google-translate)
[![](https://img.shields.io/badge/%E4%B8%AD%E6%96%87-informational?style=for-the-badge&logo=google-translate)](./README.zh.md)

# CupertinoSwitch
![Version](https://img.shields.io/badge/version-1.0.0--alpha-blue)
![License](https://img.shields.io/github/license/vejei/CupertinoSwitch)
![Min SDK](https://img.shields.io/badge/minSdkVersion-21-informational)
![Last Commit](https://img.shields.io/github/last-commit/vejei/CupertinoSwitch)

An iOS-style switch control for android.

<p align="center">
    <img src="cupertino_switch.gif">
</p>

## Quick Start
### Add dependency
```groovy
dependencies {
    implementation 'io.github.vejei.cupertinoswitch:cupertinoswitch:x.y.z'
}
```

### Set up
```xml
<io.github.vejei.cupertinoswitch.CupertinoSwitch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:trackOffColor="#dddddd"
    app:trackOnColor="@color/purple_500"/>
```
For more samples, check the [sample](./sample) app.

## `Xml` attributes
|Attribute|Description|Type|Sample Value|
|---|---|---|---|
|`switchWidth`|The width of whole switch.|`dimension`|`100dp`|
|`switchHeight`|The height of whole switch.|`dimension`|`20dp`|
|`switchDuration`|The duration of the switch slider animation, in milliseconds.|`integer`|`1000`|
|`trackOnColor`|The color of the switch track in the **on** state.|`color`|`#fa0000`|
|`trackOffColor`|The color of the switch track in the **off** state.|`color`|`#dddddd`|
|`sliderColor`|The slider's color|`color`|`#000000`|
|`sliderRadius`|The slider's radius|`dimension`|`20dp`|
|`sliderShadowEnabled`|Whether the slider turns on the shadow.|`boolean`|`true`|
|`sliderShadowColor`|The color of the slider shadow|`color`|`#eeeeee`|
|`sliderShadowRadius`|The radius of the slider shadow|`dimension`|`10dp`|

## Change Log
[Change Log](./CHANGELOG.md)

## License
[MIT](./LICENSE)
