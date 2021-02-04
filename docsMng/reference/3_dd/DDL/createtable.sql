-- Project Name : MinesO
-- Date/Time    : 2020/07/07 22:10:29
-- Author       : MewW6m
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
*/

-- アプリ情報テーブル
--* BackupToTempTable
drop table if exists apps cascade;

--* RestoreFromTempTable
create table apps (
  aid int auto_increment not null comment 'アプリID'
  , adisabled bit(1) comment '使用可否'
  , aimgpath varchar(255) comment '画像パス'
  , aname varchar(255) not null comment '名前'
  , aurl varchar(255) not null comment 'URL'
  , constraint apps_PKC primary key (aid)
) comment 'アプリ情報テーブル' ;

alter table apps add unique UK_mlijtd7t8f36dteoqieterg0n (aname) ;

-- フォローテーブル
--* BackupToTempTable
drop table if exists follow cascade;

--* RestoreFromTempTable
create table follow (
  followid int not null comment 'フォローID'
  , followerid int not null comment 'フォロワーID'
) comment 'フォローテーブル' ;

create index FK3qa4finl2noongf5ffljbp0sx
  on follow(followerid);

create index FKl0dq021y87jngr1e7t2r372lo
  on follow(followid);

-- 通知情報テーブル
--* BackupToTempTable
drop table if exists nortifications cascade;

--* RestoreFromTempTable
create table nortifications (
  nid int auto_increment not null comment '通知ID'
  , ndate datetime comment '通知日時'
  , ndetail varchar(255) comment '通知詳細'
  , ntitle varchar(255) comment '通知タイトル'
  , ntype varchar(255) comment '通知種類'
  , uid int not null comment 'ユーザー固有ID'
  , constraint nortifications_PKC primary key (nid)
) comment '通知情報テーブル' ;

create index FK3ovues3ug4aw4p34xktkb2tgk
  on nortifications(uid);

-- 設定情報テーブル
--* BackupToTempTable
drop table if exists settings cascade;

--* RestoreFromTempTable
create table settings (
  sid int auto_increment not null comment '設定ID'
  , accountsetting1 varchar(255) comment 'アカウント設定1'
  , customizesetting1 varchar(255) comment 'カスタム設定'
  , norsetting1 varchar(255) comment '通知設定'
  , profilesetting1 varchar(255) comment 'プロフィール設定'
  , uid int not null comment 'ユーザー固有ID'
  , uservisibled bit(1) comment 'ユーザー閲覧可否'
  , constraint settings_PKC primary key (sid)
) comment '設定情報テーブル' ;

create index FK1uqq8cp0p4oetssi3aalwq72l
  on settings(uid);

-- タグ情報テーブル
--* BackupToTempTable
drop table if exists tags cascade;

--* RestoreFromTempTable
create table tags (
  tid int auto_increment not null comment 'タグID'
  , tname int comment 'タグ名'
  , constraint tags_PKC primary key (tid)
) comment 'タグ情報テーブル' ;

alter table tags add unique UK_lue8ev0k78gossarqmm2gvupy (tname) ;

-- ユーザーアプリ中間テーブル
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

-- ユーザー情報テーブル
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
  , userid varchar(255) not null comment 'ユーザーID'
  , constraint users_PKC primary key (uid)
) comment 'ユーザー情報テーブル' ;

alter table users add unique UK_jyjiwnaabof8kpd0gclhcj2lh (userid) ;

-- ユーザータグ中間テーブル
--* BackupToTempTable
drop table if exists usertag cascade;

--* RestoreFromTempTable
create table usertag (
  uid int not null comment 'ユーザー固有ID'
  , tid int not null comment 'タグID'
) comment 'ユーザータグ中間テーブル' ;

create index FKps4gynjrauigakr48icmfyoyd
  on usertag(tid);

create index FKa3r9xi2vvkv5aih22212ly0ey
  on usertag(uid);

alter table follow
  add constraint follow_FK1 foreign key (followerid) references users(uid)
  on delete no action
  on update no action;

alter table follow
  add constraint follow_FK2 foreign key (followid) references users(uid)
  on delete no action
  on update no action;

alter table nortifications
  add constraint nortifications_FK1 foreign key (uid) references users(uid)
  on delete no action
  on update no action;

alter table settings
  add constraint settings_FK1 foreign key (uid) references users(uid)
  on delete no action
  on update no action;

alter table userapp
  add constraint userapp_FK1 foreign key (uid) references users(uid)
  on delete no action
  on update no action;

alter table userapp
  add constraint userapp_FK2 foreign key (aid) references apps(aid)
  on delete no action
  on update no action;

alter table usertag
  add constraint usertag_FK1 foreign key (uid) references users(uid)
  on delete no action
  on update no action;

alter table usertag
  add constraint usertag_FK2 foreign key (tid) references tags(tid)
  on delete no action
  on update no action;

