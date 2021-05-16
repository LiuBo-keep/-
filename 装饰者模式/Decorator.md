## 装饰者模式

-  继承带来的问题
   案例： 话说xxx先出创业开店-卖豆浆，因为豆浆纯，分店几乎开遍全县城所有村，由于发展的是在太快，所以急于实现一套由计算机管理的自动化记账系统。
   
   主料： 豆浆
   配料：糖  黑豆   五谷  鸡蛋   ......
   
   
   ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210516231731898.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMDcyMzk5,size_16,color_FFFFFF,t_70) 
   
   
#### 装饰者模式

- 意图： 动态的给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。该模式以对客户端透明的方式扩展对象功能。

- 适用环境：在不影响其他对象的情况下，以动态，透明的方式给单个对象添加职责。处理那些可以撤销的职责。

- 类图： 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210516232718301.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMDcyMzk5,size_16,color_FFFFFF,t_70)

**Component(被装饰对象基类)** ：
定义对象的接口，可以给这些对象动态增加职责

**ConcreteComponent(具体被装饰对象)**：
定义具体的对象，Decorator可以给他增加额外的职责

**Decorator(装饰者抽象类)**：
维护指定Component实例的引用，定义与Component一致的接口

**ConcreteDecorator(具体装饰着)**：
具体的装饰者对象，给内部持有的具体被装饰对象增加具体的职责

 