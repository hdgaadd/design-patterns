# 设计模式

✅  策略模式

✅  观察者模式

✅  工厂模式

✅  单例模式

✅  迭代器与组合模式

✅  拦截过滤器模式

✅  责任链模式







## factory



## chain-of-responsibility-patterns

**process**

- 责任链模式就像踢皮球，遇到无法处理的困难，**抛给上级**去处理

## interceptor

**process**

- 在原本方法**执行前运行**拦截器方法
- 过滤管理器暴露调用接口，实现核心对象拦截链**不暴露**
- 拦截链包含**核心代码**，内含拦截的执行逻辑、所拦截对象
- 过滤管理器外面可包裹一层客户端**Client**，给用户进行调用，而过滤管理器给内部人员调用

**knowledge**

- why要**隐藏**核心逻辑

  避免核心逻辑被**轻易调用**而造成资源破坏

## iterator



## observer



## singleton



## strategy





