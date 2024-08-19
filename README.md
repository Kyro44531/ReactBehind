# 后端实践
## 技术要点
· Spring Boot 框架
· MySQL 数据库
· 其他

## 整体框架

## 故障记录
### 缺少运行配置
参考资料：<a href="https://blog.csdn.net/m0_62407354/article/details/132832762" target="_blank">CSDN</a>
这是由于版本号引发的悲剧. . .
添加了版本号以后就有运行配置了

### @RestController
参考资料：<a href = "https://blog.csdn.net/weixin_44541213/article/details/118110869" target="_blank">CSDN</a>
是的，少了这个Rest就不行呃呃呃

### 妈的8月19号解决的最大的一个问题
竟然是客户端的'Content-Type':'application/json,'
是的！！ 没错！！ 他妈吧逗号写进引号里面了！！！！！
然后一直415 415我还在想哪里出问题了

### 跨域问题：
加个CrossOrigin就可以解决了，没别的

## 数据库部分
表单定义:
```
create table reactsql_user(
	userid int(11) primary key,
    psw varchar(36) default null,
    usertel int(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
第一张表就是用户数据
```
create table titles(
	titleid int(11) primary key,
    userid int(11),
    sbjct varchar(20),
    qstn varchar(180),
    frqcy int(8),
    series int(10)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
第二章表格用于记录题目
```
create table scores(
	userid int(11) primary key,
    highest int(4),
    titleid int(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
第三张表格用于记录用户的最高分，以及曾经错过的题目