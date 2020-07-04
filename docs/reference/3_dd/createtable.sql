-- Project Name : noname
-- Date/Time    : 2020/07/04 21:28:23
-- Author       : choke
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
*/

-- apps
--* BackupToTempTable
drop table if exists apps cascade;

--* RestoreFromTempTable
create table apps (
  aid int auto_increment not null comment 'アプリID'
  , adisabled bit(1) comment '使用可否'
  , aimgpath varchar(255) comment '画像パス'
  , aname varchar(255) not null comment '名前'
  , aurl varchar(255) not null comment 'URL'
) comment 'アプリ情報テーブル' ;

-- nortifications
--* BackupToTempTable
drop table if exists nortifications cascade;

--* RestoreFromTempTable
create table nortifications (
  nid int auto_increment not null comment '通知Id'
  , ndate datetime comment '通知日時'
  , ndetail varchar(255) comment '通知詳細'
  , ntitle varchar(255) comment '通知タイトル'
  , ntype varchar(255) comment '通知種類'
  , uid int not null comment 'ユーザー固有ID'
) comment '通知情報テーブル' ;

create index FK3ovues3ug4aw4p34xktkb2tgk
  on nortifications(uid);

-- settings
--* BackupToTempTable
drop table if exists settings cascade;

--* RestoreFromTempTable
create table settings (
  sid int auto_increment not null comment '設定ID'
  , accountsetting1 varchar(255) comment 'accountsetting1'
  , customizesetting1 varchar(255) comment 'customizesetting1'
  , norsetting1 varchar(255) comment 'norsetting1'
  , profilesetting1 varchar(255) comment 'profilesetting1'
  , uid int not null comment 'ユーザー固有ID'
  , uservisibled bit(1) comment 'ユーザー閲覧可否'
) comment '設定情報テーブル' ;

create index FK1uqq8cp0p4oetssi3aalwq72l
  on settings(uid);

-- tags
--* BackupToTempTable
drop table if exists tags cascade;

--* RestoreFromTempTable
create table tags (
  tid int auto_increment not null comment 'タグId'
  , tagname int comment 'タグ名'
) comment 'タグ情報テーブル' ;

create unique index UK_lue8ev0k78gossarqmm2gvupy
  on tags(tagname);

-- userapp
--* BackupToTempTable
drop table if exists userapp cascade;

--* RestoreFromTempTable
create table userapp (
  uid int not null comment 'ユーザー固有ID'
  , aid int not null comment 'アプリID'
) comment 'ユーザーアプリ中間テーブル' ;

create index FKt5ofwg4g81oec3n3mb53oa05v
  on userapp(aid);

create index FKrtpo8c0u5qb926q52jv53trvg
  on userapp(uid);

-- users
--* BackupToTempTable
drop table if exists users cascade;

--* RestoreFromTempTable
create table users (
  uid int auto_increment not null comment 'ユーザー固有ID'
  , udesc varchar(255) comment '説明'
  , udisabled bit(1) comment '使用可否'
  , uimgpath varchar(255) comment '画像パス'
  , umail varchar(255) comment 'メールアドレス'
  , uname varchar(255) not null comment 'ユーザー名'
  , userid varchar(255) not null comment 'ユーザーId'
) comment 'ユーザー情報テーブル' ;

-- usertag
--* BackupToTempTable
drop table if exists usertag cascade;

--* RestoreFromTempTable
create table usertag (
  uid int not null comment 'ユーザー固有ID'
  , tid int not null comment 'タグId'
) comment 'ユーザータグ中間テーブル' ;

create index FKps4gynjrauigakr48icmfyoyd
  on usertag(tid);

create index FKa3r9xi2vvkv5aih22212ly0ey
  on usertag(uid);

