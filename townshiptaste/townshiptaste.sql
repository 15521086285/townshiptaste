/*
Navicat MySQL Data Transfer

Source Server         : hyx1
Source Server Version : 50712
Source Host           : 127.0.0.1:3306
Source Database       : townshiptaste

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-08-07 14:35:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pc_hp_carousel
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_carousel`;
CREATE TABLE `pc_hp_carousel` (
  `c_id` int(20) NOT NULL COMMENT '轮播图id',
  `c_imagePath` varchar(200) NOT NULL COMMENT '图片路径',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_carousel
-- ----------------------------
INSERT INTO `pc_hp_carousel` VALUES ('1', 'd:/');

-- ----------------------------
-- Table structure for pc_hp_commodity
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_commodity`;
CREATE TABLE `pc_hp_commodity` (
  `cp_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `cp_price` double(20,0) NOT NULL COMMENT '商品价格',
  `cp_productDescription` varchar(200) NOT NULL COMMENT '商品简介',
  `cp_sourceAddress` varchar(200) NOT NULL COMMENT '商品地址',
  `cp_commentId` int(20) NOT NULL COMMENT '评论ID',
  `cp_shopId` int(20) NOT NULL COMMENT '店铺ID',
  `cp_imagePath` varchar(200) NOT NULL COMMENT '图片路径',
  `cp_typesOfGoodsEntityId` int(20) NOT NULL COMMENT '商品种类',
  `cp_whetherShelves` int(10) NOT NULL COMMENT '商品是否上架',
  PRIMARY KEY (`cp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_commodity
-- ----------------------------
INSERT INTO `pc_hp_commodity` VALUES ('2', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('3', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('4', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('5', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('6', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('7', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('8', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('9', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('10', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('11', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('12', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('13', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('14', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('15', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('16', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('17', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('18', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('19', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('20', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('21', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('22', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('23', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('24', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('25', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('26', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('27', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('28', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('29', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('30', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('31', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('32', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('33', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('34', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('35', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('36', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('37', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('38', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('39', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('40', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('41', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('42', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('43', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('44', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('45', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('46', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('47', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('48', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('49', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('50', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('51', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('52', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('53', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('54', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('55', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('56', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('57', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('58', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('59', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('60', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('61', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('62', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('63', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('64', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('65', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('66', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('67', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('68', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('69', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('70', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('71', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('72', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('73', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('74', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('75', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('76', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('77', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('78', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('79', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('80', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('81', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('82', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('83', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('84', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('85', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('86', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('87', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('88', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('89', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('90', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('91', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('92', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('93', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('94', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('95', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('96', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('97', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('98', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('99', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');
INSERT INTO `pc_hp_commodity` VALUES ('100', '26', '自己种的白菜', '中国', '1', '1', 'd:\\image', '1', '1');

-- ----------------------------
-- Table structure for pc_hp_commoditycategories
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_commoditycategories`;
CREATE TABLE `pc_hp_commoditycategories` (
  `cc_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品大类id',
  `cc_categorieName` varchar(20) NOT NULL COMMENT '商品大类名称',
  `cc_featuresId` int(20) NOT NULL COMMENT '模块id',
  PRIMARY KEY (`cc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_commoditycategories
-- ----------------------------
INSERT INTO `pc_hp_commoditycategories` VALUES ('1', '新鲜果蔬', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('2', '粮油干货', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('3', '饮品佳酿', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('4', '营养保健', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('5', '家禽肉类', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('6', '地方特产', '0');
INSERT INTO `pc_hp_commoditycategories` VALUES ('7', '工艺饰品', '0');

-- ----------------------------
-- Table structure for pc_hp_features
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_features`;
CREATE TABLE `pc_hp_features` (
  `f_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '功能id',
  `f_name` varchar(10) NOT NULL COMMENT '功能名称',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_features
-- ----------------------------
INSERT INTO `pc_hp_features` VALUES ('1', '家乡新闻');
INSERT INTO `pc_hp_features` VALUES ('2', '厨艺展示');
INSERT INTO `pc_hp_features` VALUES ('3', '乡村购');
INSERT INTO `pc_hp_features` VALUES ('4', '免费大放送');

-- ----------------------------
-- Table structure for pc_hp_like
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_like`;
CREATE TABLE `pc_hp_like` (
  `l_id` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `l_userId` int(20) NOT NULL COMMENT '点赞者id',
  `l_commentId` int(20) NOT NULL COMMENT '评论id',
  PRIMARY KEY (`l_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_like
-- ----------------------------
INSERT INTO `pc_hp_like` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for pc_hp_merchantreply
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_merchantreply`;
CREATE TABLE `pc_hp_merchantreply` (
  `mr_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商家回复id',
  `mr_commentId` int(20) NOT NULL COMMENT '商品评论id',
  `mr_commentTime` datetime(6) NOT NULL COMMENT '商家回复时间',
  `mr_commentContent` varchar(255) NOT NULL COMMENT '商家回复内容',
  PRIMARY KEY (`mr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_merchantreply
-- ----------------------------

-- ----------------------------
-- Table structure for pc_hp_productreviewsentity
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_productreviewsentity`;
CREATE TABLE `pc_hp_productreviewsentity` (
  `pr_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `pr_userId` int(20) NOT NULL COMMENT '评论者id',
  `pr_commodityId` int(20) NOT NULL COMMENT '商品id',
  `pr_oderNumber` int(100) NOT NULL COMMENT '订单号',
  `pr_commentTime` datetime(6) NOT NULL COMMENT '评论时间',
  `pr_commenContent` varchar(255) NOT NULL COMMENT '评论内容',
  `pr_imagePath` varchar(255) NOT NULL COMMENT '评论图片路径',
  `pr_likeNumber` int(10) NOT NULL COMMENT '点赞数量',
  `pr_merchandiseCompliance` int(10) NOT NULL COMMENT '商品符合度',
  `pr_storeAttitude` int(10) NOT NULL COMMENT '店家态度',
  `pr_logisticsSpeed` int(10) NOT NULL COMMENT '物流速度',
  `pr_dispatcherAttitude` int(10) NOT NULL COMMENT '配送员态度',
  PRIMARY KEY (`pr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_productreviewsentity
-- ----------------------------
INSERT INTO `pc_hp_productreviewsentity` VALUES ('1', '1', '0', '1', '2017-07-07 00:00:00.000000', '好白菜', '/d:', '11', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for pc_hp_topursue
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_topursue`;
CREATE TABLE `pc_hp_topursue` (
  `tp_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '追评id',
  `tp_commentId` int(20) NOT NULL COMMENT '评论id',
  `tp_toPursueTime` datetime(6) NOT NULL COMMENT '追评时间',
  `tp_toPursueContent` varchar(255) NOT NULL COMMENT '追评内容',
  PRIMARY KEY (`tp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_topursue
-- ----------------------------

-- ----------------------------
-- Table structure for pc_hp_typesofgoods
-- ----------------------------
DROP TABLE IF EXISTS `pc_hp_typesofgoods`;
CREATE TABLE `pc_hp_typesofgoods` (
  `tog_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品具体种类id',
  `tog_categoryName` varchar(20) NOT NULL COMMENT '商品具体种类名称',
  `tog_commodityCategoriesId` int(20) NOT NULL COMMENT '商品所属大类id',
  PRIMARY KEY (`tog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_hp_typesofgoods
-- ----------------------------
INSERT INTO `pc_hp_typesofgoods` VALUES ('1', '白菜', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('2', '苹果', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('3', '萝卜', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('4', '黄瓜', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('5', '西瓜', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('6', '南瓜', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('7', '橘子', '1');
INSERT INTO `pc_hp_typesofgoods` VALUES ('8', '大豆', '2');
INSERT INTO `pc_hp_typesofgoods` VALUES ('9', '花生油', '2');
INSERT INTO `pc_hp_typesofgoods` VALUES ('10', '高粱酒', '2');
INSERT INTO `pc_hp_typesofgoods` VALUES ('11', '啤酒', '2');
INSERT INTO `pc_hp_typesofgoods` VALUES ('12', '茅台', '2');
INSERT INTO `pc_hp_typesofgoods` VALUES ('13', '米酒', '2');

-- ----------------------------
-- Table structure for us_user
-- ----------------------------
DROP TABLE IF EXISTS `us_user`;
CREATE TABLE `us_user` (
  `u_id` int(100) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(20) NOT NULL COMMENT '用户账号',
  `u_password` varchar(200) NOT NULL COMMENT '用户密码',
  `u_cellphonenumber` varchar(20) NOT NULL COMMENT '电话号码',
  `u_email` varchar(40) NOT NULL COMMENT '邮箱',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of us_user
-- ----------------------------
INSERT INTO `us_user` VALUES ('1', 'h123456', 'h1234567', 'h1234567', 'h670256910@163.com');
INSERT INTO `us_user` VALUES ('6', 'h12345', '465b2e47f2025769dbf7c1a9c1154498d9f3330ccf373bda64c35686f7de6f5571bab09347687b3e7a425d497432573a', '13543335545', 'h670256910@163.com');
INSERT INTO `us_user` VALUES ('7', 'h12345678', '48516143d0f38f2780aa91dbcf984711d48a1a6e5698578f431b5cdf89a7c6e25b869e393240664272627e525a726e79', '0', 'h670256910@163.com');
INSERT INTO `us_user` VALUES ('8', 'yanghaoge', '364f677dd4bd6b3fbe3cbaa6aa9be201ab8daeaa0e85eb1dfc3046b0ed8a40f3e437eb84787239667a47395770702876', '0', 'h670256910@163.com');
INSERT INTO `us_user` VALUES ('9', 'h123456789', '7d424e6241f0c79084d837c827fe62a83d2a556d7a76dadc1dc72bdd48909d7de09ff7276b28403b4743584c5a63662f', '15574589874', 'hhhh5555@163.com');
INSERT INTO `us_user` VALUES ('10', 'BAI_123456789', '6e432440d4012588378e8857554dc05c3da5fcf662e096b29f611a0c894366c872d5335652393a5363235a287d324b39', '13710556088', 'hy99yh@126.com');
