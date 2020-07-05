# Spring-core

spring study

* autowired
  * @SpringBootApplication
    * @EnableAutoConfiguration
      * @AutoConfigurationPackage (将该注解的类所在的包及子包下所有组件扫描到Spring IOC容器)
      * @Import(AutoConfigurationImportSelector.class)
        * AutoConfigurationImportSelector实现ImportSelector接口，重写SelectImports
        * 通过Spring提供的SpringFactoriesLoader机制，扫描classpath路径下的META-INF/spring.factories,读取需要实现自动装配的配置类
        * 通过条件筛选的方式，把不符合条件的配置类移除，最终完成自动装配
    * @SpringBootConfiguration
    * @ComponentScan

