## 迪米特法则（LoD:Law of Demeter） ##

迪米特法则又叫做最少知识原则，就是说一个对象应当对其他对象有尽可能少的了解。

它有以下几种表述：

* 1，只与你直接的朋友们通信
* 2，不要跟陌生人说话
* 3，每一个软件单位对其他的单位都只有最少的知识，而且局限于那些与本单位密切相关的软件单位。


### 狭义的迪米特法则 ###

如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中的一个类需要调用另一个类的某一方法的话，可以通过第三者转发这个调用。

比如：
某人和朋友都需要和陌生人发生相互作用，其中朋友和陌生人也是朋友关系，那么迪米特法则建议某人不要直接与陌生人发生相互作用，而是通过朋友与之发生直接的相互作用。这就是调用转发，需要隐藏陌生人的存在，使得某人仅知道朋友，而不知道陌生人，某人会认为它所调用的这个方法是朋友的方法。

朋友条件：

* 1，当前对象本身(this)
* 2，以参数形式传入到当前对象方法中的对象
* 3，当前对象的实例变量直接引用的对象
* 4，当前对象的实例变量如果是一个聚集，那么聚集中的元素也都是朋友
* 5，当前对象所创建的对象

任何一个对象如果满足上面的条件之一，就是当前对象的朋友，否则就是陌生人。

#### 狭义迪米特法则的缺点 ####

明显的缺点是会在系统里造出大量的小方法，散落在系统的各个角落。这些方法仅仅是传递间接地调用，因此与系统的商务逻辑无关。当设计师试图从一张类图看出总体的架构时，这些小的方法会造成迷惑和困扰。遵循迪米特法则会使系统的局部设计简化，因此每一个局部都不会和远距离的对象有直接的关联。但是这也会造成系统的不同模块之间的通信效率降低，也会使系统的不同模块之间不容易协调。


### 广义迪米特法则 ###

迪米特法则所谈论的，就是对对象之间的信息流量、流向以及信息的影响的控制。

在软件系统中，一个模块设计得好不好的最主要、最重要的标志，就是该模块在多大程度上将自己的内部数据和其他与实现有关的细节隐藏起来。一个设计的好的模块可以将它所有的实现细节隐藏起来，彻底地将提供给外界的 API 和自己的实现分隔开来。这样一来，模块与模块之间就可以仅仅通过彼此的API相互通信，而不理会模块内部的工作细节。这就是封装，它的好处或者重要性有：

* 它可以使各个子系统之间脱耦，从而允许它们独立地被开发、优化、使用、阅读以及修改。这种脱耦化可以有效的加快系统的开发过程，因为可以独立地同时开发各个模块。它可以使维护过程变得更容易，因为所有的模块都容易读懂，特别是不必担心对其他模块的影响。封装本身并不能带来更好的性能，但是它可以使性能的有效调整变得更容易。一旦确认某一个模块是性能的障碍时，设计人员可以针对这个模块本身进行优化，而不必担心影响到其他的模块。

* 它可以促进软件的复用。由于每一个模块都不依赖于其他模块而存在，因此每一个模块都可以独立地在其他的地方使用。一个系统的规模越大，封装就越是重要，封装的威力也就越明显。

迪米特法则的主要用意是控制信息的过载，在将迪米特法则运用到系统设计中时，要注意下面几点：

* 在类的划分上，应当创建有弱耦合的类。类之间的耦合越弱，就越有利于复用。一个处在弱耦合中的类一旦被修改，不会对有关系的类造成波及。
* 在类的结构设计上，每一个类都应当尽量降低成员的访问权限。一个类不应当public自己的属性，而是应当提供取值和设值方法让外界间接访问自己的属性。
* 在类的设计上，只要有可能，一个类应当设计成不变类。
* 在对其他类的引用上，一个对象对其他对象的引用应当降到最低。