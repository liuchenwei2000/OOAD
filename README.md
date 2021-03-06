## 面向对象分析与设计 ##

### 基本概念 ###

**OOA**、**OOD** 和 **OOP**（Object-Oriented Analysis、Design 和 Program）

设计一个 **OO** 系统包括识别系统包含那些对象、识别这些对象的行为和职责，以及对象之间是如何交互的。

#### OO 的优势 ####

面向对象的设计通常比较简洁并且易于理解。一旦完成设计，常常可以分开来实现和测试单独的对象。每个对象会比较健壮并且无错。当修改系统时，现存的对象仍能继续工作。

当改进现存的对象时，它们对外界的接口保存不变，所以整个系统能继续工作。正是这种易于改变的特性和健壮性，使得 OO 软件开发真正不同于其他开发方式。


#### 基本术语 ####

* 对象（Object）

	面向对象的基本单位。对象是一个拥有属性、行为和标识符的实体。对象是类的实例，对象的属性和行为在类定义中定义。

* 类（Class）

	类是一组对象的描述，这一组对象有共同的属性和行为。类的定义描述了这个类的所有对象的属性，也描述了实现该类对象的行为方法。

	类和对象的关系：

	类是对所有该类对象的特征的描述或定义；对象是类的一个实例，当程序运行时，对象被创建并存在。	在某一时刻，一个类可以只有一个对象存在，也可以有任意多对象存在。同一个类的对象有着相似的行为。


* 抽象类（abstract class）

	不能实例化的类。通常定义抽象类是基于这样的假设：将从它派生出具体的子类，扩展其基本属性和行为。它们从来不会有任何实例，设计它们是为了被子类使用。

* 类属性（class attribute）

	类的属性，由类的所有实例共享。每个类属性只有一份拷贝，无需创建任何类实例，也可以访问这些类属性。在 Java 中也被称为静态（static）属性。

* 类方法（class method）

	由类定义的方法，只能对类属性进行操作。类方法可以在没有创建任何类实例的情况下调用。在 Java 中也被称为静态（static）方法。

* 实例属性（instance attribute）

	与类的特定实例相联系的类的属性。每个实例都有自己的实例属性拷贝。

* 实例方法（instance method）

	类定义的用于操作实例属性的方法。这是类定义的最常见的一种类型的方法。实例方法只能用在相关的类的实例上。


* 关联

	两个类之间的一种关系，表明类的对象之间的相互关系是如何的。

* 整体/部分

	类之间的一种关系，一个类由其他类的对象组成或容纳了其他类的对象。

* 聚合（aggregation）

	一种整体/部分层次关系。一个聚合对象包括（拥有）其他对象，每个被包括的对象被认为是聚合对象的一部分，该对象可以来去自由，不是必需的。如图书馆和书。

* 组合（composition）

	组合是聚合的一种形式，在这种情况下，没有其组成部分，整体就不能存在，也就是对象是整体的不可缺少的部分。如书和页。

	聚合和组合的区别：

	在聚合中，销毁整体时，部分依然存在；在组合中，当整体销毁时，部分也就同时被销毁。


* 动态绑定

	在运行时刻才能确定对象实例究竟属于哪个类，从而调用该类的正确方法。

### 设计原则 ###

如何同时提高一个软件系统的**可维护性**（Maintainability）和**可复用性**（Reuseablity）是面向对象的设计要解决的核心问题。

通过学习和应用设计模式，可以更加深入的理解面向对象的设计观念，从而帮助设计师改善自己的系统设计。但是设计模式并不能够提供具有普遍性的设计指导原则。在经过一段时间的对设计模式的学习和使用之后，就会觉得这些孤立的设计模式的背后应当还有一些更为深层的、更具普遍性的、共同的思想原则。它们是隐藏在设计模式背后的、比设计模式本身更加基本和单纯的设计思想。

一个好的系统设计应该有如下的性质：

* 可扩展性（Extensibility）

	新的性能可以很容易的加入到系统中。是"过于僵硬"的属性的反面。

* 灵活性（Flexbility）

	可以允许代码修改平稳地发生，而不会波及很多其他的模块。是"过于脆弱"的属性的反面。

* 可插入性（Pluggability）

	可以很容易的将一个类抽出去，同时将另一个有相同接口的类加入进来。是"黏度过高"的反面。


#### 复用 ####

是指一个软件的组成部分，可以在同一个项目的不同地方甚至另一个项目中重复使用。

对于像Java这样的面向对象的语言，本身提供了抽象化、继承、封装和多态这些语言特征。使得一个系统可以在更高层次上提供可复用性。数据的抽象化和继承关系使得概念和定义可以重复使用，多态性使得实现和应用可以复用，抽象化和封装可以保持和促进系统的可维护性。这样一来，复用的焦点不再集中具体实现细节上，而是集中在最重要的含有宏观商业逻辑的抽象层次上。

抽象层次是一个应用系统做战略性判断和决定的地方，那么抽象层次就应当是较为稳定的，应该是复用的重点。如果抽象层次的模块相对独立于具体层次的模块的话，要么具体层次内部的变化就不会影响到抽象层次的结构，所以抽象层次的模块的复用就会较为容易。

#### 面向对象设计的原则 ####

![](http://imgsrc.baidu.com/forum/w%3D580/sign=9b6f34eae7fe9925cb0c695804a85ee4/dd9ff68065380cd730658ec2a644ad3458828183.jpg)


* 单一职责原则（SRP:Single-Responsibility Principle）：就一个类而言，应该仅有一个引起它变化的原因。

* 开闭原则（OCP:Open-Closed Principle）：软件实体（类、模块、函数等）应该是可以扩展的，但是不可修改。

* 里氏替换原则（LSP:Liskov Substitution Principle）：子类型必须能够替换掉它们的基类型。

* 依赖倒置原则（DIP:Dependency Inversion Principle）：高层模块不应该依赖于低层模块，二者都应该依赖于抽象。抽象不应该依赖于细节，细节应该依赖于抽象。

* 接口隔离原则（ISP:Interface Segregation Principle）：不应该强迫客户依赖于他们不用的方法，接口属于客户，不属于他所在的类层次结构。

* 组合/聚合复用原则（CARP:Composition/Aggregation Principle）              

* 迪米特法则（LoD:Law of Demeter）


### OO 系统特性 ###

任何面向对象软件系统都具备以下6个特性：

* 利用对象进行抽象

	抽象（abstract）：真实世界的对象或概念的模型。

* 封装的类

	封装（encapsulation）：向外界隐藏对象的所有内部细节的过程。
	在 Java 中，通过在类定义里面来定义属性和方法的方式，强制实现封装过程。

	将抽象出来的状态和行为结合在一个封装的整体里，这个封装体称为类。对系统的其他部分来说，状态和行为的真实内部实现被隐藏起来了。

	封装保证了对象的内部细节被隐藏起来，不被其他对象发现，也保证了每个对象维护它自己唯一的标识符和状态，还保证了对象状态只能通过定义良好的消息来改变。

	封装使得软件更健壮，更易于调试，更易于修改，也更易于长期维护。

	**封装的原则**：

	* 最大化封装
	
	每个类越独立越好，每个类都不应该对它的内部属性提供直接的访问。类应该向外界提供能实现其职责的最少数目的方法。向外界提供的接口应该尽量少地受到类内部设计变化的影响。

	* 最小化耦合
	
	作为最大化封装的一部分工作，应该将类之间的耦合最小化。类应该只依赖于其他类提供的公有接口，而不依赖于其他类的内部工作原理。在某些情况下，类必须耦合以实现共同的职责，这时也必须把耦合对外界的影响减到最低。

* 通过消息进行通信

	为了能完成有用的任务，对象需要与其他对象进行互操作。通过发送消息给其他对象，传递消息或请求动作，互操作得到处理（Java中是通过方法调用完成的）。消息可用来改变对象的状态或请求该对象完成一个动作。

* 对象生命周期

	所有对象都有生命周期。在程序运行过程中，对象在需要时被创建并初始化，继而存在并执行其功能，最终被销毁。当对象存在时，它们维护自身的标识符和状态。每个对象都有独一无二的标识符，其属性值也和同类的其他对象实例有差别。

* 类层次结构

	对象所属的类被组织成层次结构，借此对类之间的关系进行建模和描述。类之间的关系包括关联、聚合（组合）、继承等。

* 多态性

	多态（polymorphism）：多态使得对任何对象自动调用其恰当的方法称为可能。

	多态现象总是和继承以及从通用超类得到派生类一起发生。它是通过将对象与恰当的方法进行动态绑定来实现的。

	多态性是面向对象系统最终表现出来的基本特征。当使用继承扩展通用的类来得到特殊的类时，通常也会对通用类的一些行为进行扩展。

	特殊类常常会实现与通用类有些差别的行为，但是行为的名字会保持一致。给定一个对象实例，正确地使用它的行为非常重要，而多态性保证这一点自动并且无缝地实现。