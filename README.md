# ���ʵ��
## ����Ҫ��
�� Spring Boot ���
�� MySQL ���ݿ�
�� ����

## ������

## ���ϼ�¼
### ȱ����������
�ο����ϣ�<a href="https://blog.csdn.net/m0_62407354/article/details/132832762" target="_blank">CSDN</a>
�������ڰ汾�������ı���. . .
����˰汾���Ժ��������������

### @RestController
�ο����ϣ�<a href = "https://blog.csdn.net/weixin_44541213/article/details/118110869" target="_blank">CSDN</a>
�ǵģ��������Rest�Ͳ���������

## ���ݿⲿ��
������:
```
create table reactsql_user(
	userid int(11) primary key,
    psw varchar(36) default null,
    usertel int(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
��һ�ű�����û�����
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
�ڶ��±�����ڼ�¼��Ŀ
```
create table scores(
	userid int(11) primary key,
    highest int(4),
    titleid int(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
�����ű�����ڼ�¼�û�����߷֣��Լ������������Ŀ