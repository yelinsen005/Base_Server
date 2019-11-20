nacos用standalone模式单机启动屏蔽mysql，在VM options配置-Dnacos.standalone=true
启用mysql的话需要添加配置
spring.datasource.platform=mysql
db.num=1
db.url.0=jdbc:mysql://localhost:3306/nacos_config?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
db.user=root
db.password=123456
数据库初始化文件为nacos-mysql.sql