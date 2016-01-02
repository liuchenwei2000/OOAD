## UML视图概念 ##

视图只是表达系统某一方面特征的 UML 建模组件的子集。

UML包括如下几种图：
类图、用例图、构件图、部署图、状态图、活动图、顺序图、协作图。


它们可以被分为两类：

* 结构型图
	
	* 类图（Class Diagram）：描述一些类、包的静态结构和它们之间的静态关系。
	* 对象图（Object Diagram）：给出了一个系统中的对象的快照。
	* 构件图（Component Diagram）：描述可以部署的软件构件（比如 EJB、Jar 文件）之间的静态关系。
	* 部署图（Deployment Diagram）：描述一个系统的拓扑结构。

* 行为型图

	* 用例图（User Case Diagram）：描述一系列的角色和用例及它们之间的关系。可以用来对一个系统的最基本的行为进行建模。
	* 活动图（Activity Diagram）：描述不同过程之间的动态解除。是用例图所描述的行为的具体化。
	* 状态图（State Diagram）：描述一系列对象的内部状态及状态的变化和转移。注意一个类不能有两个不同的状态图。
	* 时序图（Sequence Diagram）：是一种相互作用图，描述不同对象之间信息传递的时序。
	* 合作图（Collaboration Diagram）：是一种相互作用图，描述发出消息、接收消息的一系列对象的组织结构。