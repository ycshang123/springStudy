#### ioc容器笔记总结

- 使用xml方式做bean的配置

  - <bean>标签的使用

    - <bean id ="" class="实体类位置">

  - 依赖注入的两种方式

    - 构造器注入

      - ```xml
        <constructor-arg name=" " value=" " />
        ```

    - setter注入

      - ```xml
        <property name=" " value=" "/>
        ```

      

      - ```xml
        <property name=" " ref=" "/>(使用对象)
        ```

      - ```xml
         <bean id ="book" class="com.soft1851.spring.ioc.entity.Book" p:name="Java零基础学习"/>
        ```

        

  - 使用xml自动导包

  - ```xml
     <context:component-scan base-package="配置文件地址"/>
    ```

  - 注解导包 ：@ComponentScan( )

  - 联系上下文

  - ```xml
    @ContextConfiguration(locations = {"xml文件地址"})
    ```

  - ```java
    ApplicationContext ac = new ClassPathXmlApplicationContext("xml文件地址");
    ```

- 使用注解

  - 新建配置类

  - 类上面使用@Configuration、@ComponentScan(basePackages = {"配置文件地址"})

  - ```java
      @Bean         （相当于bean中的id）
        public User userOne(){
            User user = new User();
            user.setAccount("盏茶浅抿");
            user.setPassword("123123");
            return  user;
        }
    ```

  - 单元测试类上的注解@ContextConfiguration(classes = {“配置文件地址”})