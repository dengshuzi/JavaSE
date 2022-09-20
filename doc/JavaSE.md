# 第一章_初识JAVA

## 计算机语言的发展史

计算机编程语言的发展，是随着计算机本身硬件发展而发展的。硬件速度越快、体积越小、成本越低，应用到人类社会的场景就会越多，那么所需要的算法就会越复杂，也就要求计算机编程语言越高级。最初重达几十吨但一秒只能运算5000次的ENIAC(世界上第一台计算机)，只能做非常小的应用，比如：某些情况的弹道计算。现在任何一个人的手机运算能力都可以秒杀那个年代地球上所有计算机运算能力的总和。计算机编程语言的发展历经了从低级到高级发展。发展的核心思想就是“让人更容易编程”。越容易使用的语言，就有越多人使用；越多人使用，就有越多协作；越多协作，就可以创造越复杂的物体；计算机语言经历了三代：第一代是机器语言，第二代是汇编语言，第三代是高级语言。
<img src="images/1/1-1-1.png">

### 1. 第一代：机器语言（相当于人类的原始阶段）
机器语言是机器指令的集合，机器指令展开来讲就是一台机器可以正确执行的命令。电子计算机的机器指令是一列二进制数字。计算机将之转变为一列高低电平，以使计算机的电子器件受到驱动，从而进行运算。上面所说的计算机，指的是可以执行机器指令，进行运算的机器。这是早期计算机的概念。早期的程序设计均使用机器语言。程序员们将用 0、1 数字编程的程序代码打在纸袋或卡片上，1打孔，0不打孔，再将程序通过纸带机或卡片机输入计算机，从而进行运算。
应用8086CPU完成运算s=768+12288-1280，机器码如下:
<img src="images/1/1-1-2.png">
假如将程序错写成以下的错误，请你找出错误:
<img src="images/1/1-1-3.png">
书写和阅读机器码程序不是一件简单的工作，要记住所有抽象的二进制码。上面只是一个非常简单的小程序，就暴露出机器码的晦涩难懂和不易查错。写如此小的一个程序尚且如此，实际上一个有用的程序至少要有几十行的机器码。那么，情况将会怎么样呢？
在显示器输出“welcome to masm”，机器码如下：
<img src="images/1/1-1-4.png">
看到这样的程序，你有什么感想？如果程序里有一个“1”被误写成为“0”，又如何去查找错误呢？

### 2. 第二代：汇编语言（相当于人类的手工业阶段）
为了编程的方便，以及解决更加复杂的问题。程序员开始改进机器语言，使用英文缩写的助记符来表示基本的计算机操作。这些助记符构成了汇编语言的基础。如下是一些常见的汇编语言助记符(单词)比如：mov，add，sub之类，这样人更容易使用了。识别几百、几千个单词，感觉要比几百几千个数字，美妙多了。汇编语言相当于人类的手工业社会，需要技术极其娴熟的工匠，但是开发效率也非常低。汇编语言虽然能编写高效率的程序，但是学习和使用都不是易事，并且很难调试。另一个复杂的问题，汇编语言以及早期的计算机语言（Basic、Fortran等）没有考虑结构化设计原则，而是使用goto语句来作为程序流程控制的主要方法。这样做的后果是：一大堆混乱的调转语句使得程序几乎不可能被读懂。对于那个时代的程序员，能读懂上个月自己写的代码都成为一种挑战。 汇编语言仍然应用于工业电子编程领域、软件的加密解密、计算机病毒分析等。
下面以Masm软件为例，编写一个简单的“hello world!”程序。
<img src="images/1/1-1-5.png">

### 3. 第三代：高级语言（相当于人类的工业阶段）
对于简单的任务，汇编语言可以胜任。但是随着计算机的发展，渗透到了工作生活的更多的方面，一些复杂的任务出现了，汇编语言就显得力不从心（应该说是程序员使用汇编语言解决复杂问题出现了瓶颈）。于是，出现了高级语言。像我们熟知的C、C++、Java等等都是高级语言。
高级语言允许程序员使用接近日常英语的指令来编写程序。例如下图所示:
<img src="images/1/1-1-6.png">

## JAVA简史

### 1. SUN公司

美国SUN(Stanford University Network)公司
在中国大陆的正式中文名为“太阳计算机系统（中国）有限公司”
在台湾中文名为“升 阳电脑公司”。

### 2. Java为什么被发明

Green项目。
应用环境：像电视盒这样的消费类电子产品
要求： 语言本身是中立的，也就是跨平台
        1996年Java第一次发布就引起了人们的极大兴趣。关注Java的人士不仅限于计算机出版界，  还有诸如《纽约时报》《华盛顿邮报》《商业周刊》这样的主流媒体。Java 是第一种也是唯一种在National Public Radio上占用了10分钟时间来进行介绍的程序设计语言，并且还得到了$100000000的风险投资基金。这些基金全部用来支持用这种特别的计算机语言开发的产品。重温那些令人兴奋的日子是很有意思的。我们将简要地介绍一下Java语言的发展历史：
        Java的历史要追溯到1991年，由Patrick Naughton 及其伙伴James Gosling (一个全能的计算机奇才)带领的Sun公同的工程师小组想要设计一种小型的计算机语言，主要用于像有线电视转换盒这类的消费设备。由于这些消费设备的处理能力和内存都很有限，所以语言必须非常小且能够生成非常紧凑的代码。另外，由于不同的厂商会选择不同的中央处理器(CPU)，因此这种语言的关键是不能与任何特定的体系结构捆绑在一起。这个项目被命名为"Green"。
        所有就要求有这样的一种代码： 代码短小、紧凑且与平台无关。但是，Sun公司的人都有UNIX的应用背景。因此，所开发的语言以C++为基础。 是Gosling率先创造了这个语言，把这种语言称为“Oak"(这么起名的原因大概是因为他非常喜欢自己办公室外的橡树)。Sun 公司的人后来发现Oak是一种已有的计算机语言的名字，于是，将其改名为Java。
<img src="images/1/1-2-1.png">

### 3. Java的发明人

James  Gosling
<img src="images/1/1-2-2.png">

### 4. 经历阶段

1991年，James Gosling在SUN公司的工程师小组想要设计这样一种小型计算机语言。该语言主要用于像电视盒这样的消费类电子产品。另外，由于不同的厂商选择不同的CPU和操作系统，因此，要求该语言不能和特定的体系结构绑在一起，要求语言本身是中立的，也就是跨平台的。所以，将这个语言命名为“Green”，类似于绿色软件的意思。后来，改名为Oak，橡树的意思。改名后发现已经有一种语言叫这个名字了，再改名叫Java。Java语言发展到今天经历了一系列的过程：
- 1991年，SUN公司的Green项目，Oak
- 1995年，推出Java测试版
- 1996年，JDK1.0
- 1997年，JDK1.1
- 1998年，JDK1.2，大大改进了早期版本缺陷，是一个革命性的版本，更名为Java2。
- 2004年，J2SE 5.0 (1.5.0)  Tiger老虎 成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE1.5更名为Java SE 5.0
- 2005年，Java的各种版本已经更名，以取消其中的数字"2"： J2ME更名为Java ME， J2SE更名为Java SE， J2EE更名为Java EE；
- 2006年，J2SE 6.0 (1.6.0)  Mustang野马
- 2009年，甲骨文(oracle)收购SUN，交易高达价格74亿
- 2011年，JavaSE7.0   Dolphin海豚
- 2014年，JavaSE8.0
- 2017年，JAVA 9.0
- 2018年3月，JAVA 10
- 2018年9月，JAVA 11
- 2019年3月，JAVA 12
- 2019年9月，JAVA 13
- 2020年3月，JAVA 14
> 注意：SUN公司已经被oracle公司收购，目前每半年更新一次java的版本。但是，企业中的主流仍然以7和8为主。对于初学者，应该以企业主流应用版本为核心进行学习，没有必须在此处追求最新版本。
<img src="images/1/1-2-3.png">

### 5. 不同版本JDK说明

- JDK Version 1.1
   于1997-02-19发行。
   引入的新特性包括：
   引入JDBC（Java Database Connectivity）；
   支持内部类；
   引入Java Bean；
   引入RMI（Remote Method Invocation）；
   引入反射（仅用于内省）。
- J2SE Version 1.2
   开发代号为Playground（操场），于1998-12-08发行。
   引入的新特性包括：
   引入集合（Collection）框架；
   对字符串常量做内存映射；
   引入JIT（Just In Time）编译器；
   引入对打包的Java文件进行数字签名；
   引入控制授权访问系统资源的策略工具；
   引入JFC（Java Foundation Classes），包括Swing 1.0、拖放和Java 2D类库；
   引入Java 插件；
   在JDBC中引入可滚动结果集、BLOB、CLOB、批量更新和用户自定义类型；
   在Applet中添加声音支持。
- J2SE Version 1.3
  开发代号为Kestrel（红隼），于2000-05-08发行。
   引入的新特性包括：
   引入Java Sound API；
   jar文件索引；
   对Java的各个方面都做了大量优化和增强。
- J2SE Version 1.4
   开发代号为Merlin（隼），于2004-02-06发行（首次在JCP下发行）。
   引入的新特性包括:
   XML处理；
   Java打印服务；
   引入Logging API；
   引入Java Web Start；
   引入JDBC 3.0 API；
   引入断言；
   引入Preferences API；
   引入链式异常处理；
   支持IPv6；
   支持正则表达式；
   引入Image I/O slot machine API。
- Java Version SE 5.0
   开发代号为Tiger（老虎），于2004-09-30发行。
   引入的新特性包括:
   引入泛型；
   增强循环，可以使用迭代方式；
   自动装箱与自动拆箱；
   类型安全的枚举；
   可变参数；
   静态引入；
   元数据（注解）；
   引入Instrumentation。
- Java Version SE 6
   开发代号为Mustang（野马），于2006-12-11发行。
   引入的新特性包括：
   支持脚本语言；
   引入JDBC 4.0 API；
   引入Java Compiler API；
   可插拔注解；
   增加对Native PKI(Public Key Infrastructure)、Java GSS(Generic Security Service)、Kerberos和LDAP(Lightweight Directory Access   Protocol)的支持；
   继承Web Services；
   做了很多优化。
- Java Version SE 7
   开发代号是Dolphin（海豚），于2011-07-28发行。
   引入的新特性包括：
   switch语句块中允许以字符串作为分支条件；
   在创建泛型对象时应用类型推断；
   在一个语句块中捕获多种异常；
   支持动态语言；
   支持try-with-resources；
   引入Java NIO.2开发包；
   数值类型可以用2进制字符串表示，并且可以在字符串表示中添加下划线；
   钻石型语法；
   null值的自动处理。
- Java Version SE 8
   开发代号是Spider（蜘蛛），于2014-03-18发行。
   支持 lambda支持；
   增强日期与时间API的功能；
   对垃圾回收的性能也进行了改进；
   并且移除了permgen区。
   Lambdas表达式与Functional接口
   接口的默认与静态方法
   方法引用
   重复注解
   更好的类型推测机制
   扩展注解的支持
<img src="images/1/1-2-4.png">

## JAVA体系结构

### JavaSE（Java  Standard  Edition）：标准版，定位在个人计算机上的应用
这个版本是Java平台的核心，它提供了非常丰富的API来开发一般个人计算机上的应用程序，包括用户界面接口AWT及Swing，网络功能与国际化、图像处理能力以及输入输出支持等。在上世纪90年代末互联网上大放异彩的Applet也属于这个版本。Applet后来为Flash取代，Flash即将被HTML5取代。

### JavaEE（Java  Enterprise Edition）：企业版，定位在服务器端的应用
JavaEE是JavaSE的扩展，增加了用于服务器开发的类库。如：JDBC是让程序员能直接在Java内使用的SQL的语法来访问数据库内的数据；Servlet能够延伸服务器的功能，通过请求-响应的模式来处理客户端的请求；JSP是一种可以将Java程序代码内嵌在网页内的技术；

### JavaME（Java  Micro  Edition）：微型版，定位在消费性电子产品的应用上
JavaME是JavaSE的内伸，包含J2SE的一部分核心类，也有自己的扩展类,增加了适合微小装置的类库：javax.microedition.io.*等。该版本针对资源有限的电子消费产品的需求精简核心类库，并提供了模块化的架构让不同类型产品能够随时增加支持的能力。
<img src="images/1/1-3-1.png">

## JAVA的特性和优势

- 跨平台/可移植性
这是Java的核心优势。Java在设计时就很注重移植和跨平台性。比如：Java的int永远都是32位。不像C++可能是16，32，可能是根据编译器厂商规定的变化。这样的话程序的移植就会非常麻烦。

- 安全性
Java适合于网络/分布式环境，为了达到这个目标，在安全性方面投入了很大的精力，使Java可以很容易构建防病毒，防篡改的系统。

- 面向对象
面向对象是一种程序设计技术，非常适合大型软件的设计和开发。由于C++为了照顾大量C语言使用者而兼容了C，使得自身仅仅成为了带类的C语言，多少影响了其面向对象的彻底性！Java则是完全的面向对象语言。

- 简单性
Java就是C++语法的简化版，我们也可以将Java称之为“C++-”。跟我念“C加加减”，指的就是将C++的一些内容去掉；比如：头文件，指针运算，结构，联合，操作符重载，虚基类等等。同时，由于语法基于C语言，因此学习起来完全不费力。

- 高性能
Java最初发展阶段，总是被人诟病“性能低”；客观上，高级语言运行效率总是低于低级语言的，这个无法避免。Java语言本身发展中通过虚拟机的优化提升了几十倍运行效率。比如，通过JIT(JUST IN TIME)即时编译技术提高运行效率。 将一些“热点”字节码编译成本地机器码，并将结果缓存起来，在需要的时候重新调用。这样的话，使Java程序的执行效率大大提高，某些代码甚至接待C++的效率。
因此，Java低性能的短腿，已经被完全解决了。业界发展上，我们也看到很多C++应用转到Java开发，很多C++程序员转型为Java程序员。

- 分布式
Java是为Internet的分布式环境设计的，因为它能够处理TCP/IP协议。事实上，通过URL访问一个网络资源和访问本地文件是一样简单的。Java还支持远程方法调用(RMI,Remote Method Invocation)，使程序能够通过网络调用方法。

- 多线程
多线程的使用可以带来更好的交互响应和实时行为。 Java多线程的简单性是Java成为主流服务器端开发语言的主要原因之一。

- 健壮性
Java是一种健壮的语言，吸收了C/C++ 语言的优点，但去掉了其影响程序健壮性的部分（如：指针、内存的申请与释放等）。Java程序不可能造成计算机崩溃。即使Java程序也可能有错误。如果出现某种出乎意料之事，程序也不会崩溃，而是把该异常抛出，再通过异常处理机制加以处理。

总结：<strong style="color:#DD5145">一句话：java很好！</strong>
但是，并不是说学习了java，以后所有的东西都要用java开发了：某些领域其他语言有更出色的表现，比如，Objective C和后来的Swift在iOS设备上就有着无可取代的地位。浏览器中的处理几乎完全由JavaScript掌控。Windows程序通常都用C++或C#编写。Java在服务器端编程和跨平台客户端应用领域则很有优势。
只能说，<strong style="color:#DD5145">不同的语言之间，平分秋色！</strong>

## 核心机制

### 垃圾收集机制

垃圾收集的目的在除不再使用的对象，当对象建立的时候垃圾收集期，就开始监控对象的动态情况，垃圾收集主要是对内存的释放。创建对象的时候申请一个空间

    1.不再使用的内存空间应回收---》垃圾收集；
    2.Java消除了程序员回收无用内存空间的职责；提供一种系统级线程跟踪存储空间的分配情况。在JVM的空闲时，检查并释放可被释放的存储器空间；相比c++,开发人员负责要自己收回无用内存。
    3.垃圾收集在Java程序运行过程中自动进行，程序员无法精确控制和干预；
    4.GC的自动回收，提高了内存空间的利用效率，也提高了编程人员的效率，很大程度上减少了因为没有释放空间而导致的内存泄露。

后续：
更高级：
1. 垃圾收集器有几种
2. 垃圾收集器底层原理剖析
3. 垃圾收集器算法，优化     

### 跨平台原理

JAVA跨平台原理的解释：
<img src="images/1/1-4-1.png">
C语言的跨平台解释：
<img src="images/1/1-4-2.png">
- 总结
JVM(Java Virtual Machine)就是一个虚拟的用于执行bytecode字节码的”虚拟计算机”。他也定义了指令集、寄存器集、结构栈、垃圾收集堆、内存区域。JVM负责将Java字节码解释运行，边解释边运行，这样，速度就会受到一定的影响。
不同的操作系统有不同的虚拟机。Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，随处运行”。 Java虚拟机是实现跨平台的核心机制。如图所示：
<img src="images/1/1-4-3.png">
我们说的语言跨平台是编译后的文件跨平台，而不是源程序跨平台。
接下来我们再比较下两种方式的差异：第一，C语言是编译执行的，编译器与平台相关，编译生成的可执行文件与平台相关；第二，Java是解释执行的，编译为中间码的编译器与平台无关，编译生成的中间码也与平台无关（一次编译，到处运行），中间码再由解释器解释执行，解释器是与平台相关的，也就是不同的平台需要不同的解释器.

## 常用DOS命令

### 1. DOS操作系统

--Microsoft公司推出的操作系统。（在windows之前的操作系统）
--DOS是英文"Disk Operating System"的缩写,其中文含意是"磁盘操作系统".
--DOS是单用户、单任务的操作系统.（只能执行一个任务）
<img src="images/1/1-5-1.png">

### 2. DOS命令
--在windows中，我们通过鼠标菜单等来操作系统，而在dos操作系统中，要通过dos命令来操作系统。
--是DOS操作系统的命令，是一种面向磁盘的操作命令，
--不区分大小写。

### 3. 命令学习：
windows给我们保留了类似dos系统的操作界面，可以直接操作磁盘！
dos 也是一种操作系统，是在windows出现以前用的，后来windows出来后基本没人用了，但是当windows崩溃的时候，还是要的dos方式解决，它是一种纯命令方式，cmd其实就是在windows状态下进入dos方式。
<img src="images/1/1-5-2.png">

### 4. 具体dos命令：
1. 切换盘符： c:  d:  e:   大小写没有区分
2. 显示详细信息：dir
<img src="images/1/1-5-3.png">

3. 改变当前目录：cd
<img src="images/1/1-5-4.png">

4. . 当前目录  ..  代表上一层目录
<img src="images/1/1-5-5.png">
<img src="images/1/1-5-6.png">

5. 清屏：cls
6. 切换历史命令：上下箭头 
7. 补全命令： tab按键
8. 创建目录：md 删除目录：rd
<img src="images/1/1-5-7.png">

9. 复制文件命令：copy:
<img src="images/1/1-5-8.png">

10. 删除文件：del
del后面如果接的是文件夹/目录：那么删除的就是这个文件夹下的文件，而不是文件夹
<img src="images/1/1-5-9.png">

## JAVA环境准备-->JDK

### 1. 下载JDK

https://www.oracle.com/java/technologies/downloads/
<img src="images/1/1-6-1.png">

### 2. 安装JDK

<img src="images/1/1-6-2.png">
<img src="images/1/1-6-3.png">
<img src="images/1/1-6-4.png">

### 3. 卸载JDK

控制面板卸载即可

<img src="images/1/1-6-5.png">

### 4. 验证JDK是否安装成功

1. 方式1：去安装目录下看一眼：
<img src="images/1/1-6-6.png">

2. 方式2：通过控制命令台查看：
<img src="images/1/1-6-7.png">

3. 方式3：通过控制面板查看：
<img src="images/1/1-6-8.png">

### 5. JDK和JRE：

JDK： Java Development kit   ---->编写Java程序的程序员使用的软件
JRE : Java Runtime Enviroment  ----》运行Java程序的用户使用的软件

## 安装notepad++，配置path环境变量

### 1. 安装记事本：notepad

### 2. 安装：一直下一步

<img src="images/1/1-7-1.png">

### 3. 打开记事本进行设置：

设置--》首选项：
<img src="images/1/1-7-2.png">

设置--》语言格式设置：
<img src="images/1/1-7-3.png">

### 4. 打开notepad++:

1. 方式1：通过快捷方式：
<img src="images/1/1-7-4.png">

2. 方式2：通过可执行文件：
<img src="images/1/1-7-5.png">

3. 方式3：利用控制命令台：
<img src="images/1/1-7-6.png">

4. 方式4：在任意的路径下去执行notepad++.exe这个命令：
但是发现报错：
<img src="images/1/1-7-7.png">

需要配置系统环境变量：
<img src="images/1/1-7-8.png">

找系统环境变量：
<img src="images/1/1-7-9.png">

<img src="images/1/1-7-10.png">

将notepad++.exe所在的路径配置到path环境变量中去：

<img src="images/1/1-7-11.png">

这样我就可以在任意的路径下去执行这个命令：（注意：控制命令台需要重启）

<img src="images/1/1-7-12.png">

path环境变量作用：
将命令所在的路径配置到path中去，就相当于在计算机中“注册”了一样，以后找这个命令，会直接去你配置的路径下寻找。
达到了一个效果：在任意的路径下去执行某个命令---》path环境针对整个操作系统而言。

## 第一段程序

### 1. 用notepad编写代码：

```java
public class HelloWorld{
        public static void main(String[] args){
                System.out.println("hi 这是一段Java程序。。。");
        }
}
```
记得保存  ctrl+s

### 2. 进行编译：

<img src="images/1/1-8-1.png">

发现出错了，分析出错原因：

<img src="images/1/1-8-2.png">

解决办法：
将javac.exe所在的路径 配置到 环境变量path中去，这样我就可以在任意的路径下去执行这个命令：

<img src="images/1/1-8-3.png">

配置好环境变量以后发现代码可以成功编译：

<img src="images/1/1-8-4.png">

验证：

<img src="images/1/1-8-5.png">

### 3. 进行解释/翻译/执行:

<img src="images/1/1-8-6.png">

上面执行过程成功的原因：

<img src="images/1/1-8-7.png">

## 程序中常见问题

### 1. 最低级的错误：单词拼写错误

### 2. 要求源文件名字和类名必须一模一样：

<img src="images/1/1-9-1.png">

出错：

<img src="images/1/1-9-2.png">

### 3. 所有的标点必须是英文状态下的：

中文状态：【】（）{} ！；：“‘《》？
英文状态：[]       ()  {}  !  ;   :   "  '  <> ?

### 4. 成对编程：

[] {} () <> ""  ''

### 5. 注意缩进 ：只要遇到{}就进行缩进  --->为了格式好看

缩进：tab 
向前缩进： shift+tab

### 6. 编译：

javac  HelloWorld.java

### 7. 执行：

java HelloWorld 

### 8. java中大小写严格区分，大小敏感：

HelloWorld   Helloworld
a   A  
public PUBLIC

### 9. 我们要写代码：就当做有一个“框子”

```java
public class HelloWorld{
  public static void main(String[] args){
  }
}
```

### 10. 一个源文件中可以有多个类，只能有一个类被public修饰，源文件的名字必须跟public修饰的那个类名保持一致。

<img src="images/1/1-9-3.png">

多个类会产生独立的字节码文件：

<img src="images/1/1-9-4.png">

执行的时候执行各自独立的字节码文件即可：

<img src="images/1/1-9-5.png">


## 编译方式

### 1. 方式1

<img src="images/1/1-10-1.png">

### 2. 方式2：

<img src="images/1/1-10-2.png">

### 3. 方式3：

<img src="images/1/1-10-3.png">

### 4. 方式4：

在notepad中右键文件 --》打开文件夹所在命令行

<img src="images/1/1-10-4.png">

## 5. 扩展：classpath环境变量

### 1. 系统有一个环境变量叫：classpath，现在我们将classpath环境变量显式的写出来：

<img src="images/1/1-11-1.png">

classpath作用：只要你配置到classpath中的路径，在执行java的字节码文件的时候，就会去这个配置的路径下找 对应的字节码文件：

现在我不配置.\了 我配置：

<img src="images/1/1-11-2.png">

自从我配置了这个环境变量以后，可以在任意的路径下去执行字节码文件：

### 总结：

classpath作用：针对java执行字节码文件而产生的环境变量，只要配置了字节码文件所在的路径以后，那么以后你在任意位置都可以执行对应的字节码文件

## 扩展：JAVA_HOME环境变量

后续我们会用到一个软件：tomcat，在执行startup.bat的时候会出现闪退问题：
解决：
必须要配置一个环境变量叫：JAVA_HOME 

<img src="images/1/1-12-1.png">

我再次启动才会成功：

然后我们的path环境变量中刚好可以借助JAVA_HOME里面的内容，通过%%做引入
%JAVA_HOME%\bin

<img src="images/1/1-12-2.png">

## API

<img src="images/1/1-13-1.png">

其实API没有什么神奇的，就是一个电子文档而已，帮助我们查看JAVA中涉及到的一些技能点：

<img src="images/1/1-13-2.png">

## 代码量统计工具

<img src="images/1/1-14-1.png">

## 注释

为了方便程序的阅读，Java语言允许程序员在程序中写上一些说明性的文字，用来提高程序的可读性，这些文字性的说明就称为注释。
注释不会出现在字节码文件中，即Java编译器编译时会跳过注释语句。
在Java中根据注释的功能不同，主要分为单行注释、多行注释和文档注释。
- 单行注释
单行注释使用“//”开头，“//”后面的单行内容均为注释。
- 多行注释
多行注释以“/*”开头以“*/”结尾，在“/*”和“*/”之间的内容为注释，我们也可以使用多行注释作为行内注释。但是在使用时要注意，多行注释不能嵌套使用。
- 文档注释
文档注释以“/**”开头以“*/”结尾， 注释中包含一些说明性的文字及一些JavaDoc标签（后期写项目时，可以生成项目的API）

### 反编译工具的使用

- 编译
代码----->class

- 反编译
cass---->源代码

- 反编译工具
jd-gui.exe

<img src="images/1/1-15-1.png">

### 本章最后一段代码

```java
public class HiWorld{
  public static void main(String[] args){
    //进行自我介绍：
    System.out.print("姓名：");
    System.out.print("\t丽丽\n");
    System.out.print("职业：");
    System.out.print("\t学生");
    /*
    (1)System.out.print和System.out.println区别联系：
    System.out.print ： 将双引号中内容原样输出，不换行
    System.out.println ：将双引号中内容原样输出，换行
    (2)转义字符：
    \就是转义字符：作用：将后面普通的字母转换为特殊含义
    \n  : 换行
    \t  : 距离前面有一个制表符位置
    */
    
    System.out.println();//换行
    System.out.println("1111111111111111111");
    System.out.println("11111111\t2222");
  }
}
```

### 扩展面试题：JDK，JRE，JVM的区别

#### JDK,JRE,JVM的关系:

<img src="images/1/1-16-1.png">

#### 先说JDK和JRE:

初学JAVA很容易被其中的很多概念弄的傻傻分不清楚，首先从概念上理解一下吧，JDK（Java Development Kit）简单理解就是Java开发工具包，JRE(Java Runtime Enviroment)是Java的运行环境，JVM( java virtual machine)也就是常常听到Java虚拟机。JDK是面向开发者的，JRE是面向使用JAVA程序的用户，上面只是简单的区别

通过上图发现发现有两个JRE文件夹，如果细看里面的内容基本上是一样的，如果是只是Java程序使用者，那么只会有最外层的那个JRE目录，JDK中是JRE自带的，你如果安装了JDK必然里面会有一个JRE.那么问题来了，为什么会有两套JRE呢？
从侧面证明:
利用javac.exe进行编译:

<img src="images/1/1-16-2.png">

然后我将C:\Program Files\Java\jdk1.8.0_151\lib\tools.jar改个名字,再去编译:

<img src="images/1/1-16-3.png">

证明:dt.jar和tools.jar是两个java最基本的包，里面包含了从java最重要的lang包到各种高级功能如可视化的swing包，是java必不可少的。而path下面的bin里面都是java的可执行的编译器及其工具，如java，javadoc等,报错的原因就是输入的javac的命令不是去JDK中bin目录去找的javac.exe，而是去JDK中lib目录中的tools.jar中com.sun.tools.javac.Main中执行，因此javac.exe只是一个包装器（Wrapper），存在的目的是为了让开发者免于输入过长的指命。<strong style="color:#DD5145">这个时候发现JDK里的工具几乎是用Java所编写，同属于Java应用程序，因此要使用JDK所附的工具来开发Java程序，所以自身需要附一套JRE才能运行。</strong>上图中与jdk同级目录下的JRE就是用来运行一般Java程序用的。
两套JRE运行的时候究竟运行哪一个呢，<strong style="color:#DD5145">这个时候JDK中java.exe先从自身目录中找，然后父级目录中找，如果都没有就去注册表中找</strong>

<img src="images/1/1-16-4.png">

#### 再说JRE和JVM:

JVM -- java virtual machineJVM就是我们常说的java虚拟机，它是整个java实现跨平台的最核心的部分，所有的java程序会首先被编译为.class的类文件，这种类文件可以在虚拟机上执行，class文件并不直接与机器的操作系统相对应，而是经过虚拟机间接与操作系统交互，由虚拟机将程序解释给本地系统执行，类似于C#中的CLR。
<strong style="color:#DD5145">JVM不能单独搞定class的执行，解释class的时候JVM需要调用解释所需要的类库lib。在JDK下面的的jre目录里面有两个文件夹bin和lib,在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库</strong>，而jvm和 lib和起来就称为jre。

<img src="images/1/1-16-5.png">

JVM+Lib=JRE，<strong style="color:#DD5145">如果讲的具体点就是bin目录下的jvm.dll文件， jvm.dll无法单独工作</strong>，当jvm.dll启动后，会使用explicit的方法(就是使用Win32 API之中的LoadLibrary()与GetProcAddress()来载入辅助用的动态链接库)，而这些辅助用的动态链接库(.dll)都必须位 于jvm.dll所在目录的父目录之中。因此想使用哪个JVM，只需要设置PATH，指向JRE所在目录下的jvm.dll。

<img src="images/1/1-16-6.png">


# 第二章_数据类型

## 标识符

### 1. 标识符：读音   biao <strong style="color:orange">zhi</strong> fu

### 2. 什么是标识符？ 

  包，类，变量，方法.....等等,只要是起名字的地方,那个<strong style="color:#DD5145">名字</strong>就是标识符

### 3. 标识符定义规则：

1. 四个可以（组成部分）：数字，字母，下划线_，美元符号$
注意：字母概念比较宽泛，指的是英文字母，汉字，日语，俄语......
但是我们一般起名字尽量使用英文字母
2. 两个不可以：不可以以数字开头，不可以使用java中的关键字
3. 见名知意：增加可读性
4. 大小写敏感：  int a ;  int A;
5. 遵照驼峰命名：
        类名：首字母大写，其余遵循驼峰命名
        方法名，变量名：首字母小写，其余遵循驼峰命名
        包名：全部小写，不遵循驼峰命名
6. 长度无限制，但是不建议太长  asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasfd

## 关键字

关键字：被JAVA语言赋予了特殊含义，用作专门用途的单词
特点：JAVA中所有关键字都为小写
官网: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

<img src="images/2/2-1-1.png">

<img src="images/2/2-1-2.png">

## 变量和常量

举例：
丽丽的年龄：去年17岁，今年18岁，明年19岁
年龄：17--》18---》19  --》值不断变化  

年龄---》变量
常量：  17  ，  18  ，  19    ----》 常量中的字面常量 

### 字面常量

常量分为两种：
常量通常指的是一个固定的值，例如：1、2、3、’a’、’b’、true、false、”helloWorld”等。
在Java语言中，主要是利用关键字final来定义一个常量。 常量一旦被初始化后不能再更改其值。
为了更好的区分和表述，一般将1、2、3、’a’、’b’、true、false、”helloWorld”等称为<strong style="color:#DD5145">字面常量</strong>，而使用final修饰的PI等称为<strong style="color:#DD5145">符号常量（字符常量）</strong>。


字面常量的类型：

<img src="images/2/2-2-1.png">

注意：逻辑常量就两个值，一个是true，一个是false

### 变量

变量本质上就是代表一个”可操作的存储空间”，空间位置是确定的，但是里面放置什么值不确定。我们可通过变量名来访问“对应的存储空间”，从而操纵这个“存储空间”存储的值。Java是一种强类型语言，每个变量都必须声明其数据类型。变量的数据类型决定了变量占据存储空间的大小。 比如，int a=3; 表示a变量的空间大小为4个字节。变量作为程序中最基本的存储单元，其要素包括变量名，变量类型和作用域。变量在使用前必须对其声明, 只有在变量声明以后，才能为其分配相应长度的存储空间。

#### 1. 变量声明格式：
type  varName [=value][,varName[=value]...]; //[ ]中的内容为可选项，即可有可无
数据类型  变量名  [=初始值] [,变量名  [=初始值]…];
案例：
int     age   = 19 , age2 = 90  ;
int  age,age2;
#### 2. 变量的声明：
1. 如果你只定义一个变量，没有给变量进行赋值的话，那么其实这个变量相当于没有定义：

<img src="images/2/2-3-1.png">

2. 变量如果没有进行赋值的话，那么使用的时候会出错，告诉你：尚未初始化变量：

<img src="images/2/2-3-2.png">

#### 3. 变量的赋值：

<img src="images/2/2-3-3.png">

我们自己定义的时候直接就可以用一句话定义：
int age = 10;

变量的值可以更改：
```java
public class TestVar01{
  public static void main(String[] args){
    //变量的声明（定义变量）（以年龄为案例讲解）
    //java是一个强类型的语言，只要声明变量就必须定义类型：定义整数类型
    int age ; //定义一个整数类型的变量，变量名字为age 
    //对变量进行赋值操作：
    age = 10; //变量名字为age，具体的值为10 
    age = 12;
    age = 20;
    age = age + 4;
    age = 9;
    age = 9;
    System.out.println(age);
  }
}
```
变量不可以重复定义：

<img src="images/2/2-3-4.png">

#### 4. 变量的使用：

```java
public class TestVar01{
  public static void main(String[] args){
    //变量的声明（定义变量）（以年龄为案例讲解）
    //java是一个强类型的语言，只要声明变量就必须定义类型：定义整数类型
    int age ; //定义一个整数类型的变量，变量名字为age 
    //对变量进行赋值操作：
    age = 10; //变量名字为age，具体的值为10 
    age = 12;
    age = 20;
    age = age + 4;
    age = 9;
    age = 9;
    System.out.println(age);
    System.out.println(age-2);
    System.out.println(age+10);
    int num = age + 66;
    System.out.println(num);
  }
}
```

#### 扩展：

```java
public class TestVar02{
  public static void main(String[] args){
    int a = 10;
    int b = 20;
    int c = a + b ;
  }
}
```
现在对上述代码进行“反编译过程”“反汇编过程”

<img src="images/2/2-3-5.png">

<img src="images/2/2-3-6.png">

#### 5. 变量的内存：

<img src="images/2/2-3-7.png">

#### 6. 习题：

```java
public class TestVar03{
  public static void main(String[] args){
    int num1 = 10;
    int num2 = 20;
    num1 = num2;
    num2 = num2 + 10;
    num1 = num2 - 10;
    num2 = num1;
    System.out.println("num1="+num1);
    System.out.println("num2="+num2);
  }
}
```
内存分析：

<img src="images/2/2-3-8.png">基本数据类型

结果：

<img src="images/2/2-3-9.png">

#### 7. 变量的作用域：
作用域指的就是作用范围，变量在什么范围中有效
作用范围就是离它最近的{}

备注：一会我们写的代码，不要去运行，会出错
```java
/*
局部变量：定义在方法中
成员变量：定义在类中，方法外
*/
public class TestVar04{
  int b = 20;
  public static void main(String[] args){
    System.out.println(a);//no
    int a = 10;
    System.out.println(a);//yes
    System.out.println(b);//yes
    {
      int c = 40;
      System.out.println(c);//yes
      int a = 50;//属于变量的重复定义
    }
    System.out.println(c);//no
  }
  
  public void eat(){
    System.out.println(b);//yes
    System.out.println(a);//no
    int a = 30;//不是变量的重复定义
    System.out.println(a);//yes
  }
}
```

## 基本数据类型

Java是一种强类型语言，每个变量都必须声明其数据类型。 
Java的数据类型可分为两大类：基本数据类型（primitive data type）和引用数据类型（reference data type）。

<img src="images/2/2-4-1.png">

> PS:巧妙记忆：除了基本数据类型以外的所有类型都属于引用数据类型，本章重点：基本数据类型

### 整数类型

#### 整数类型常量

十进制整数，如：99, -500, 0
八进制整数，要求以 0 开头，如：015
十六进制数，要求 0x 或 0X 开头，如：0x15
二进制：要求0b或者0B开头，如：0b11


几进制：就是逢几进1的问题：

平时实际生活中用的最多的是：十进制
计算机用二进制最多

<img src="images/2/2-4-2.png">

##### 扩展：进制转换问题

###### 1. 二进制转换为十进制：
二进制： 1101

    1*2^3  +   1*2^2   +  0*2^1  +     1*2^0
=    8         +      4       +     0       +      1
=  13 


###### 2. 十进制转换为二进制：
十进制  13   

<img src="images/2/2-4-3.png">

##### 3. 八进制转换十进制：
八进制： 16

1*8^1 +   6*8^0
=   8     +  6
=14


##### 4. 十进制转换为八进制：
十进制14：

<img src="images/2/2-4-4.png">

##### 5. 八进制转换为十六进制：

把十进制当做一个中转站：

八进制---》十进制---》十六进制

实际上根本不用自己转换这么麻烦：我们可以直接用系统中提供给我们的计算器：

<img src="images/2/2-4-5.png">

#### 整数类型变量

整型数据类型：

<img src="images/2/2-4-6.png">

比如：byte的右侧表数范围127怎么算出来的？
byte: 1字节 =  8位 
二进制：01111111
   1*2^6  + 1*2^5  +  1*2^4 + 1*2^3  + 1*2^2 +   1*2^1 +   1*2^0
= 64     +     32       +     16      +8         +4             +    2       +1
= 127

代码：
```java
public class TestVar05{
  public static void main(String[] args){
    //定义整数类型的变量：
    //给变量赋值的时候，值可以为不同进制的：
    int num1 = 12 ;//默认情况下赋值就是十进制的情况
    System.out.println(num1);
    int num2 = 012;//前面加上0，这个值就是八进制的
    System.out.println(num2);
    int num3 = 0x12;//前面加上0x或者0X，这个值就是十六进制的
    System.out.println(num3);
    int num4 = 0b10;//前面加上0b或者0B,这个值就是二进制的
    System.out.println(num4);
    
    //定义byte类型的变量：
    byte b = 126;//定义了一个byte类型的变量，名字叫b，赋值为12
    System.out.println(b);
    //注意：超范围的赋值会报错。
    short s = 30000;
    System.out.println(s);
    int i = 1234;
    System.out.println(i);
    //整数类型默认就是int类型的，所以12345678910是一个int类型的数，对于int类型来说，它超出范围了
    //要想把一个数给long类型变量，那么后面加上L(推荐)或者l就可以了
    long num5 = 12345678910L;
    System.out.println(num5);
    //注意：只有这个数超出int类型的范围了后面才需要加上L，否则无需加L也可以赋值给long类型：
    long num6 = 12;
    System.out.println(num6);
  }
}
```



### 浮点类型

#### 浮点类型常量

1. 十进制数形式，例如:                              
3.14       314.0      0.314
2. 科学记数法形式，如
314e2      314E2 (E的大小写没有区分)    314E-2
double  f = 314e2;  //314*10^2-->31400.0
double  f2 = 314e-2; //314*10^(-2)-->3.14

#### 浮点类型变量

float类型又被称作单精度类型，尾数可以精确到7位有效数字，在很多情况下，float类型的精度很难满足需求。
而double表示这种类型的数值精度约是float类型的两倍，又被称作双精度类型，绝大部分应用程序都采用double类型。
float类型的数值有一个后缀F或者f ，没有后缀F/f的浮点数值默认为double类型。
也可以在浮点数值后添加后缀D或者d， 以明确其为double类型。

<img src="images/2/2-5-1.png">

PS：有效数字指的是从左开始第一个不为0的数到最后一个数

代码：
```java
public class TestVar06{
  public static void main(String[] args){
    //浮点类型的常量有两种形式：
    //十进制形式：
    double num1 = 3.14;
    System.out.println(num1);
    //科学计数法形式：
    double num2 = 314E-2;
    System.out.println(num2);
    
    //浮点类型的变量：
    //注意：浮点型默认是double类型的，要想将一个double类型的数赋给float类型，必须后面加上F或者f
    float f1 = 3.14234567898623F;
    System.out.println(f1);
    //注意：double类型后面可以加D或者d，但是一般我们都省略不写
    double d1 = 3.14234567898623D;
    System.out.println(d1);
    
    //注意：我们最好不要进行浮点类型的比较：
    float f2 = 0.3F;
    double d2 = 0.3;
    System.out.println(f2==d2);
    /*
    区别：
    = 赋值运算：  将等号右侧的值赋给等号左侧
    == 判断==左右两侧的值是否相等  ：结果要么相等 要么不相等
    ==运算符的结果就是要么是true，要么是false
    */
  }
}
```

### 字符类型

#### 1. Java中使用单引号来表示字符常量，字符型在内存中占2个字节。

char 类型用来表示在Unicode编码表中的字符。Unicode编码被设计用来处理各种语言的文字，它占2个字节，可允许有65536个字符。

#### 2. 转义字符：

<img src="images/2/2-6-1.png">

#### 3. ASCII表：

<img src="images/2/2-6-2.png">

#### 4. Unicode编码表：
https://www.cnblogs.com/csguo/p/7401874.html

代码1：
```java
public class TestVar07{
  public static void main(String[] args){
    //定义字符类型的变量：
    char ch1 = 'a';
    System.out.println(ch1);
    char ch2 = 'A';
    System.out.println(ch2);
    char ch3 = '4';
    System.out.println(ch3);
    char ch4 = '中';
    System.out.println(ch4);
    char ch5 = '?';
    System.out.println(ch5);
    //java中无论：字母，数字，符号，中文都是字符类型的常量，都占用2个字节。
    char ch6 = ' ';
    System.out.println(ch6);
    //字符类型：单引号引起来的单个字符
    System.out.println("--------------------------------");
    /*
    转义字符：
    \将后面的普通字符转换为特殊含义
    */
    char ch7 = '\n';
    System.out.println("aaa"+ch7+"bbb");
    
    System.out.println("aaa\nbbb");// \n  换行
    
    System.out.println("aaaaaaa\tbbb");  //  \t  制表符
    
    System.out.println("aaa\bbbb");//aabbb  \b  向前退一格
    System.out.println("aaa\rbbb");//bbb   \r 将光标到本行开头 ：回车
    
    System.out.println("\"java\""); // \" 将双引号原样输出  \' 将单引号原样输出 \\ 将\原样输出
  }
}
```

代码2：
```java
public class TestVar08{
  public static void main(String[] args){
    char ch1 = 'A';
    System.out.println(ch1);//A
    System.out.println(ch1+90);//155
    System.out.println(155-ch1);//90
    //char类型我们看到的样子就是它本身的字面常量,但是底层在进行计算的时候，实际上是按照一个码进行计算的。
    //这个码就是ASCII
    //之前说char类型是按照Unicode码表进行存储的 (Unicode兼容了ASCII码，Unicode的前128位置ASCII)
    
    char ch2 = '中';
    System.out.println(ch2);// 中
    System.out.println(ch2+90);// 20103
    System.out.println(20103-ch2);// 90
    
    //转换：
    int num1 = (int)ch2;
    System.out.println(num1);//20013
    
    char ch = (char)20013;
    System.out.println(ch);
    
    int num2 = '中';
    char ch5 = 20013;
    System.out.println(ch5);
    
    //面试题：
    char ch6 = '2'+2;
    System.out.println(ch6);//'4'--->4
  }
}
```

#### 编码和字符集

##### 1. 什么是编码？

<img src="images/2/2-7-1.png">

##### 2. 通过生活案例：

<img src="images/2/2-7-2.png">

##### 3. 由权威机构形成的编码表才可以称之为：字符集

ASCII
                                        <strong>英文字符集</strong>    
                                        <strong>用一个字节的7位表示</strong>

IOS8859-1
                                        <strong>西欧字符集</strong>
                                        <strong>用一个字节的8位表示</strong>

GB2312
                                        <strong>简体中文字符集</strong>
                                        <strong>最多使用两个字节编码</strong>

PS：中文：2个字节

GB2312兼容了ASCII中的字符：

GBK
                                        <strong>GB2312的升级，加入了繁体字</strong>
                                        <strong>最多使用两个字节编码</strong>

<strong>疑问：</strong>

<img src="images/2/2-7-3.png">

首位如果是0：一个字节代码代表一个字符

首位如果是1：那么一个字节不够，要加上后面的字节才能完整的表示一个字符。



Unicode
                                            国际通用字符集，融合了目前人类使用的所有字符。为每个字符分配唯一的字符码。

退出了UTF标准：

三种编码方案：  UTF-8，UTF-16,UTF-32 



以UTF-8为案例讲解：

中文： 珊     ---》Unicode  ： 29642

<img src="images/2/2-7-4.png">

<img src="images/2/2-7-5.png">

底层存储：

<img src="images/2/2-7-6.png">

UTF-8标准最多可以用6个字节表示：

<img src="images/2/2-7-7.png">

#### 解释乱码问题

<img src="images/2/2-8-1.png">

用记事本选择编码方法的时候一般要选择为ANSI---》获取当前操作系统的编码格式：GBK

### 布尔类型

boolean类型有两个常量值，true和false，在内存中占一位（不是一个字节），不可以使用 0 或非 0 的整数替代 true 和 false ，这点和C语言不同。 boolean 类型用来判断逻辑条件，一般用于程序流程控制 。
```java
public class TestVar09{
  public static void main(String[] args){
    //创建一个布尔类型的变量：
    boolean flag1 = true;
    System.out.println(flag1);
    boolean flag2 = false;
    System.out.println(flag2);
    boolean flag3 = 5==9;
    System.out.println(flag3);
    boolean flag4 = 5<9;
    System.out.println(flag4);
  }
}
```

### 基本数据类型的转换

#### 1. 什么是类型转换：
在赋值运算或者算数运算的时候，要求数据类型一致，就要进行类型的转换。

#### 2. 类型转换的种类：
自动转换，强制转换

#### 3. 内存演示：

<img src="images/2/2-9-1.png">

#### 4. 代码:

```java
public class TestVar10{
  public static void main(String[] args){
    //类型转换的两种形式：
    double d = 6;//int-->double  自动类型转换
    System.out.println(d);
    int i = (int)6.5;//double--->int  强制类型转换 （强转）
    System.out.println(i);
    
    //在同一个表达式中，有多个数据类型的时候，应该如何处理：
    //多种数据类型参与运算的时候，整数类型，浮点类型，字符类型都可以参与运算，唯独布尔类型不可以参与运算。
    //double d2 = 12+1294L+8.5F+3.81+'a'+true;
    double d2 = 12+1294L+8.5F+3.81+'a';
    System.out.println(d2);
    /*
    类型级别：(从低到高的)
    byte,short,char-->int--->long--->float--->double
    级别用来做什么？当一个表达式中有多种数据类型的时候，要找出当前表达式中级别最高的那个类型，然后
    其余的类型都转换为当前表达式中级别最高的类型进行计算。
    double d2 = 12+1294L+8.5F+3.81+'a';
              = 12.0+1294.0+8.5+3.81+97.0
    */
    int i2 = (int)(12+1294L+8.5F+3.81+'a');
    System.out.println(i2);
    /*
    在进行运算的时候：
    左=右  : 直接赋值
    左<右  ：强转
    左>右  ：直接自动转换
    */
    
    //以下情况属于特殊情形：对于byte，short，char类型来说，只要在他们的表数范围中，赋值的时候就不需要进行
    //强转了直接赋值即可。
    byte b = 12;
    System.out.println(b);
    byte b2 = (byte)270;
    System.out.println(b2);
  }
}
```

### 练习：final，字符常量，Scanner的使用

```java
import java.util.Scanner;//形象理解：在java.util下将Scanner拿过来用
public class TestVar11{
  public static void main(String[] args){
    //实现功能：求圆的周长和面积
    //【1】提取变量：提取变量，就是为了一劳永逸，以后只要改变变量的值，下面只要用到这个变量的地方，取值也都发生变化了
    //【2】一个变量被final修饰，这个变量就变成了一个常量，这个常量的值就不可变了
    //     这个常量就是我们所说的 字符常量  ---》pi
    //     约定俗成的规定：字符常量的名字全部大写
    //【3】使用扫描器：Scanner的使用--》注意通过形象的理解去使用
    final double PI = 3.14;
    //拿来一个扫描器：
    Scanner sc = new Scanner(System.in);
    //给一个友好性的提示：
    System.out.print("请录入一个半径：");
    //让扫描器扫描键盘录入的int类型的数据：
    int r = sc.nextInt();
    
    //求周长：
    double c = 2*PI*r;
    System.out.println("周长为："+c);
    
    //求面积：
    //PI = 9.29;报错：TestVar11.java:12: 错误: 无法为最终变量pi分配值
    double s = PI*r*r;
    System.out.println("面积为："+s);
  }
}
```

### 练习：加深对Scanner的使用

<img src="images/2/2-10-1.png">

```java
import java.util.Scanner;
public class TestVar12{
  public static void main(String[] args){
    //键盘录入学生的信息：年龄，身高，姓名，性别：
    //键盘录入年龄：(接收int类型数据)
    Scanner sc = new Scanner(System.in);
    System.out.print("请录入年龄：");
    int age = sc.nextInt();
    //键盘录入身高：（接收double类型数据）
    System.out.print("请录入身高：");
    double height = sc.nextDouble();
    //键盘录入姓名：(接收String类型数据--》字符串)
    System.out.print("请录入姓名：");
    String name = sc.next();
    //键盘录入性别：(接受char类型)
    System.out.print("请录入性别：");
    String sexStr = sc.next();
    char sex = sexStr.charAt(0);
    //上面两句可以合为一句表示：char sex = sc.next().charAt(0);
    System.out.println("该学生的信息为:姓名是："+name+",年龄是："+age+",身高为："+height+",性别是："+sex);
  }
}
```