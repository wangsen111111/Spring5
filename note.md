##常用依赖
```xml
<!--单元测试-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.3.9</version>
        </dependency>
```
##注解说明
-@Autowired:自动装配通过类型，名字
   如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
-@Nullable  字段标记了这个注解，说明这个字段可以为null
-@Resource 自动装配通过名字，类型

-@Component 组件，放在类上，说明这个类被Spring管理了，就是bean