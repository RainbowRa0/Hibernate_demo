# Hibernate_demo
本次对于hibernate一对多的映射主要解决了一下问题
1.hibernate包的版本问题以及 导包要全
2.数据库的创建最好使用sql语句 以便于统一 xml配置中的参数表，在配置一对多或者多对一的时候，数据库需要设置外键，这个步骤很关键，不能漏掉!
3.hibernate.cfg.xml 需要配置关系表的映射关系
4.实体类的构造方法如果没有的话 也会报错
5.实体类的hbm.xml 要注意表以及属性名称的对应，名字不要写错，大小写要区分
4.可以编写hibernate.utils以方便连接数据库 等