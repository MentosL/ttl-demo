# ttl-demo


> 用于演示`ttl`是如何进行线程池以及线程增强的。 


当前在使用过程中，目的是通过`agent`形式进行线程方面的增强，但是往往在使用的过程中，没有attach进去，并没有增强线程。

在项目启动的过程中，需要加入下面的参数来进行`agent`启动

```linux
-javaagent:***/lib/transmittable-thread-local-2.14.0.jar
```