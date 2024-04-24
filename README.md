# Jar OJ 题目评测系统

### 技术栈：

前端: Vue3 + Vuex + Arco Design + TypeScript + ESLint + Prettier + OpenAPI + Monaco Editor + ByteMD

前端仓库：https://github.com/Jarvlis/Jar-OJ-frontend

后端：Java8 + SpringBoot2.7 + MyBatis-Plus + Docker + MySQL5.7 + Redis

自主搭建的在线判题系统。系统可根据管理员发布的题目和预设的判题用例，将用户提交的代码执行与评测，并且系统提供了单独调用自主实现的代码沙箱的接口。

### 工具类

- Easy Excel 表格处理
- Hutool 工具库
- Gson 解析库
- Apache Commons Lang3 工具类
- Lombok 注解

### 后端功能

- Spring Session Redis 分布式登录
- 全局请求响应拦截器（记录日志）
- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- Swagger + Knife4j 接口文档
- 自定义权限注解 + 全局校验
- 全局跨域处理
- 多环境配置

## 系统功能

### 单元测试

- JUnit5 单元测试
- 示例单元测试类

### MySQL 数据库

1）修改 `application.yml` 的数据库配置为你自己的：

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/my_db
    username: root
    password: 123456
```

2）执行 `sql/create_table.sql` 中的数据库语句，自动创建库表

3）启动项目，访问 `http://localhost:8101/api/doc.html` 即可打开接口文档，不需要写前端就能在线调试接口了~

![](doc/swagger.png)

### Redis 分布式登录

1）修改 `application.yml` 的 Redis 配置为你自己的：

```yml
spring:
  redis:
    database: 1
    host: localhost
    port: 6379
    timeout: 5000
    password: 123456
```

2）修改 `application.yml` 中的 session 存储方式：

```yml
spring:
  session:
    store-type: redis
```

3）移除 `MainApplication` 类开头 `@SpringBootApplication` 注解内的 exclude 参数：

修改前：

```java
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
```

修改后：


```java
@SpringBootApplication 
```

### 项目时序图
(消息队列暂时未加入项目中, 过阵子会将RabbitMQ加入, 并且增设C++ 、 Python 、 JavaScript语言支持， 最后将项目改造为微服务)

![yuque_diagram (1)](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/8e640a87-3798-40b0-a0ba-ab7afc38eb91)

### 项目展示
登录页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/2aaa8df0-2054-449d-8960-f7c79297bf28)

注册页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/46e2b9de-3041-4f9d-a062-99874e8e8341)

题目页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/509cf672-2dff-4921-ba8d-ea279e55e1c0)

做题页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/2ce63970-3798-410a-a780-1782c310d114)

题目提交页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/544af9dc-b92e-4699-8614-a1dbb0329391)


管理题目页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/9c0bbf95-e4e1-45b9-9c31-b8324421999c)


创建题目页面

![image](https://github.com/Jarvlis/Jar-OJ-frontend/assets/96105888/a1fa2cbe-a4d2-4e35-bec4-0cf45aaf2d66)


### 项目待扩展点
- 消息队列暂时未加入项目中, 过阵子会将RabbitMQ加入
- 并且增设C++ 、 Python 、 JavaScript语言支持
- 最后将项目改造为微服务
- 增设更多用户友好型提示（如在做题页面即可浏览到做题结果）
- 根据输入的题目分析判题数据图
- 我的注销和个人做题分析页面
- 做题目前仅支持args模式，可以扩展acm模式和力扣模式
