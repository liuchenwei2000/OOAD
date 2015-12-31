## 类的设计原则 ##

### 类需要一个目的 ###

每个类都需要有职责，如果没有清楚的类职责和所需的操作，那么它可能是其他类的一部分。如果类没有目的，那么就不应该存在。

### 类与属性 ###

如果类拥有一组定义良好的属性，这些属性有一些相关的操作，这些操作实际上并不是类的一部分，而且有可能被其他的类独立地使用，那么这些属性和方法是一个候选的独立的类；另一方面，如果一个类没有操作，那么它的属性可以作为其他类的简单属性。

### 关联与继承 ###

常常使用继承的设计实际上更应该采用简单的关联或聚合/组合。在继承层次结构中的所有类必须通过"is-a"测试。

### 类不能什么事都做 ###

别把一个类弄得太大。类的职责应该适合在该类中实现并且与其他类无关。如果一个类试图做实际与它的主要职责无关的事，那么那些操作可能应该属于别的类。