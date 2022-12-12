## 注意事项
1.首次启动程序会提示引擎激活失败，我们需要关闭应用重新启动

2.人脸识别需要注册登记，配置路径在：`\app\src\main\java\com\xiaoyou\face\common`

修改下面这两个地方

```java
    public static final String APP_ID = "xxxxxx";
    public static final String SDK_KEY = "xxxxx";
```

注册网址：[点击访问](https://www.arcsoft.com.cn/technology/face.html)

3.默认的SDK好像只有一年的有效期，所以需要进行替换

第一个就是 `libs` 目录下的两个jar文件。
然后就是 `app/src/main/jniLibs`目录下的so文件（包括face和image_util的）



## 功能介绍
放到

### 签到日历功能


### 人脸录入


### 签到功能

### 签到详情


### 签到数据查询


### 图表展示






