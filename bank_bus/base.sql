/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : gep_test

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-01-03 14:41:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ls_admin_user
-- ----------------------------
DROP TABLE IF EXISTS `ls_admin_user`;
CREATE TABLE `ls_admin_user` (
  `id` varchar(24) NOT NULL,
  `username` varchar(20) NOT NULL DEFAULT '' COMMENT '管理员用户名',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '管理员密码',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '状态 1 启用 0 禁用',
  `create_time` varchar(20) NOT NULL DEFAULT '' COMMENT '注册时间',
  `last_login_time` varchar(20) DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(20) DEFAULT NULL COMMENT '最后登录IP',
  `salt` varchar(64) DEFAULT NULL COMMENT 'salt',
  `cid` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Table structure for ls_auth_group
-- ----------------------------
DROP TABLE IF EXISTS `ls_auth_group`;
CREATE TABLE `ls_auth_group` (
  `id` varchar(24) NOT NULL,
  `title` varchar(100) NOT NULL DEFAULT '',
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `rules` varchar(255) DEFAULT NULL COMMENT '权限规则ID',
  `cid` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限组表';

-- ----------------------------
-- Table structure for ls_auth_group_access
-- ----------------------------
DROP TABLE IF EXISTS `ls_auth_group_access`;
CREATE TABLE `ls_auth_group_access` (
  `uid` varchar(24) NOT NULL,
  `group_id` varchar(24) NOT NULL,
  `cid` varchar(6) DEFAULT NULL,
  UNIQUE KEY `uid_group_id` (`uid`,`group_id`),
  KEY `uid` (`uid`),
  KEY `group_id` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='权限组规则表';

-- ----------------------------
-- Table structure for ls_auth_rule
-- ----------------------------
DROP TABLE IF EXISTS `ls_auth_rule`;
CREATE TABLE `ls_auth_rule` (
  `id` varchar(24) NOT NULL,
  `name` varchar(80) NOT NULL DEFAULT '' COMMENT '规则名称',
  `title` varchar(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态',
  `pid` varchar(24) NOT NULL COMMENT '父级ID',
  `cid` varchar(6) DEFAULT NULL,
  `sort` int(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='规则表';

-- ----------------------------
-- Table structure for ls_file
-- ----------------------------
DROP TABLE IF EXISTS `ls_file`;
CREATE TABLE `ls_file` (
  `id` varchar(24) NOT NULL COMMENT '文件ID',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '原始文件名',
  `savename` varchar(255) NOT NULL DEFAULT '' COMMENT '保存名称',
  `savepath` varchar(255) NOT NULL DEFAULT '' COMMENT '文件保存路径',
  `ext` char(5) NOT NULL DEFAULT '' COMMENT '文件后缀',
  `mime` char(40) NOT NULL DEFAULT '' COMMENT '文件mime类型',
  `size` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '文件大小',
  `sha1` varchar(64) NOT NULL DEFAULT '' COMMENT '文件 sha1编码',
  `create_time` int(10) unsigned NOT NULL COMMENT '上传时间',
  `cid` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='文件表';

-- ----------------------------
-- Table structure for ls_user
-- ----------------------------
DROP TABLE IF EXISTS `ls_user`;
CREATE TABLE `ls_user` (
  `id` varchar(24) NOT NULL,
  `point` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
  `userip` varchar(32) NOT NULL COMMENT 'IP',
  `username` varchar(32) NOT NULL COMMENT '名称',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `userhead` varchar(100) DEFAULT '/public/images/default.png' COMMENT '头像',
  `usermail` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(11) DEFAULT '' COMMENT '手机',
  `regtime` varchar(32) NOT NULL COMMENT '注册时间',
  `grades` tinyint(1) NOT NULL DEFAULT '0' COMMENT '等级',
  `sex` tinyint(1) NOT NULL DEFAULT '0' COMMENT '性别',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '验证：-1不通过0未审核1正常2邮箱验证3手机认证5手机邮箱全部认证',
  `userhome` varchar(32) DEFAULT NULL COMMENT '家乡',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `last_login_time` varchar(20) DEFAULT NULL COMMENT '最后登陆时间',
  `last_login_ip` varchar(50) DEFAULT '' COMMENT '最后登录IP',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `collect` int(11) DEFAULT '0' COMMENT '被关注数',
  `zan` int(11) DEFAULT '0' COMMENT '被赞数',
  `tips` int(11) DEFAULT '0' COMMENT '被打赏次数',
  `cid` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `usermail` (`usermail`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for ls_usergrade
-- ----------------------------
DROP TABLE IF EXISTS `ls_usergrade`;
CREATE TABLE `ls_usergrade` (
  `id` varchar(24) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `score` int(11) NOT NULL COMMENT '等级所需积分',
  `cid` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员等级表';
