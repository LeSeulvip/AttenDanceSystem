use information_schema;
drop database if exists AttenDanceSystem;
create database AttenDanceSystem default charset utf8 collate utf8_general_ci;
use AttenDanceSystem;


/*权限*/
DROP TABLE IF EXISTS TbAdmin;
CREATE TABLE TbAdmin 
(
  aid int NOT NULL primary key  AUTO_INCREMENT,
  userName varchar(255) unique DEFAULT NULL comment '用户名',
  userPwd varchar(255) DEFAULT NULL comment '密码',
  name varchar(255) DEFAULT NULL comment '员工姓名',
  tel varchar(255) DEFAULT NULL comment '电话',
  inductionInfo varchar(255) DEFAULT NULL comment '入职信息',
  permissions enum('1','2') default '2' comment '权限 默认为2 1:管理员，2:普通员工',
  dept varchar(255) DEFAULT NULL comment '部门'
)comment '管理权限';


/*打卡*/
DROP TABLE IF EXISTS TbClock;
CREATE TABLE TbClock 
(
  id int NOT NULL primary key AUTO_INCREMENT comment '主键',
  cname varchar(255) DEFAULT NULL comment '姓名',
  sdate varchar(255) DEFAULT NULL comment '开始日期',
  edate varchar(255) DEFAULT NULL comment '结束日期'
) comment '打卡表';



/*部门*/
DROP TABLE IF EXISTS TbDept;
CREATE TABLE TbDept 
(
  id int NOT NULL primary key AUTO_INCREMENT,
  dname varchar(255) DEFAULT NULL comment '部门名称',
  info varchar(255) DEFAULT NULL comment '部门描述',
  tel varchar(255) DEFAULT NULL comment '部门电话'
)comment '部门';


/*考勤*/
DROP TABLE IF EXISTS TbAttendance;

CREATE TABLE TbAttendance 
(
  id int NOT NULL primary key AUTO_INCREMENT comment '主键',
  aname varchar(255) DEFAULT NULL comment '姓名',
  bmonth varchar(255) DEFAULT NULL comment '月份',
  holiday varchar(255) DEFAULT NULL comment '假期',
  absenteeism varchar(255) DEFAULT NULL comment'旷工',
  late varchar(255) DEFAULT NULL comment'迟到',
  early varchar(255) DEFAULT NULL comment'早退',
  note varchar(255) DEFAULT NULL comment'备注',
  adate varchar(255) DEFAULT NULL comment'日期'
) comment '考勤表';



/*请假*/
DROP TABLE IF EXISTS TbLeave;

CREATE TABLE TbLeave 
(
  id int NOT NULL primary key AUTO_INCREMENT comment '主键',
  bname varchar(255) DEFAULT NULL comment '姓名',
  bdate varchar(255) DEFAULT NULL comment '开始日期',
  edate varchar(255) DEFAULT NULL comment '结束日期',
  info varchar(255) DEFAULT NULL comment '描述'
)comment '请假表';



create table TbConfig
(
  configKey varchar(50) primary key comment '配置键值，主键',
  configValue varchar(2000) comment '配置值',
  lastupdate timestamp comment '最后更新时间'
)comment '系统配置表';

create table TbToken
(
  token varchar(50) primary key comment '令牌值，自然主键',
  lastupdate timestamp comment '令牌环最后更新时间'
)comment 'token追踪表';

create table TbTokenInfo
(
  token varchar(50) comment '令牌',
  infoKey varchar(50) comment '令牌信息key值',
  info varchar(2000) comment '令牌信息值',
  lastupdate timestamp comment '令牌信息最后更新时间',
  constraint pkTbTokenInfo primary key(token,infoKey)
)comment 'token附加信息表';

/* 系统配置数据 */
/* token过期时间配置，值是分钟数 */
insert into TbConfig(configKey,configValue,lastupdate) values('token.timeout','10',now());

/* 查询 */
select configKey,configValue,lastupdate from TbConfig;
select token,lastupdate from TbToken;
select token,infoKey,info,lastupdate from TbTokenInfo;