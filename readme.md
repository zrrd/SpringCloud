1. igame      用来当做通用属性包(其他包导入这个包的话需要exclude = DataSourceAutoConfiguration.class)
              来排除mysql的自动配置
2. provide    服务提供者
3. consumer   服务消费者
4. eureka     服务注册的服务端 7001 7002 7003 共同实现集群功能