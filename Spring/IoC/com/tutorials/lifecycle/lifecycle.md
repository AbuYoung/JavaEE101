# Spring Bean 生命周期
当一个 bean 被实例化时，它可能需要执行一些初始化使它转换成可用状态。  
同样，当 bean 不再需要，并且从容器中移除时，可能需要做一些清除工作。  
为了定义安装和拆卸一个 bean，我们只要声明带有 **init-method** 和/或 **destroy-method** 参数的。  
**init-method** 属性指定一个方法，在实例化 bean 时，立即调用该方法。  
同样，**destroy-method** 指定一个方法，只有从容器中移除 bean 之后，才能调用该方法。  

> Bean的生命周期可以表达为：Bean的定义——Bean的初始化——Bean的使用——Bean的销毁  

在 HelloWorld.java 中可以看到声明的 **init** 和 **destory** 方法  
由 beans.xml 文件进行控制  
在 MainAPP 中进行 bean 的实例化控制