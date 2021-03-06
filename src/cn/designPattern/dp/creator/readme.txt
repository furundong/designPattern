创建型模式的主要关注点是**怎样创建对象？**，它的主要特点是“将对象的创建与使用分离”。这样可以降低系统的耦合度，使用者不需要关注对象的创建细节，对象的创建由相关的工厂来完成。
就像我们去商场购买商品时，不需要知道商品是怎么生产出来一样，因为它们由专门的厂商生产。

创建型模式分为以下几种。
    单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
    原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
    工厂方法（FactoryMethod）模式：定义一个用于创建产品的接口，由子类决定生产什么产品。
    抽象工厂（AbstractFactory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
    建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。

以上 5 种创建型模式，除了工厂方法模式属于类创建型模式，其他的全部属于对象创建型模式，我们将在之后的教程中详细地介绍它们的特点、结构与应用。

但是我们这里先介绍简单工厂，它不属于23种设计模式之一。不过也很重要。首先，这些创建型模式，我们想想，为什么要用创建型。
你不需要知道，我是怎么创建的，就给你一个接口，告诉你，我可以生产，你不要问。 你问我，关你啥事。 但是对外的接口要承诺，不应该发生改变
就相当于，教导主任教每一个学生去学习，可能吗。不可能！应该是通过老师，此时老师就是i这个接口，两边一分，老师做这个中间的关联。且，我们应该承诺，老师是稳定不变的。一改老师~~

具体思路细节，可以看InterfaceOrientedProgramming.png。只有具体用到了，才能体会到，有多美妙。

请看1~6。 
。。。。。。。。。。。。。。。。。。。。。。
面向接口编程大概就是这么些内容了。 提供对外借口，且保持不变。