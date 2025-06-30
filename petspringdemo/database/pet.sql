/*
 Navicat Premium Dump SQL

 Source Server         : frank
 Source Server Type    : MySQL
 Source Server Version : 90001 (9.0.1)
 Source Host           : localhost:3306
 Source Schema         : pet

 Target Server Type    : MySQL
 Target Server Version : 90001 (9.0.1)
 File Encoding         : 65001

 Date: 30/12/2024 11:02:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pet
-- ----------------------------
DROP TABLE IF EXISTS `pet`;
CREATE TABLE `pet`  (
  `pet_id` int NOT NULL AUTO_INCREMENT,
  `add_time` datetime NULL DEFAULT NULL,
  `name` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `avatar` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `kind` enum('cat','dog') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `species` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` enum('male','female') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` int NOT NULL,
  `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `lng` double(15, 5) NOT NULL,
  `lat` double(15, 5) NOT NULL,
  `status` enum('1','2','3','4','5','6','7') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `belonging` int NULL DEFAULT NULL,
  PRIMARY KEY (`pet_id`) USING BTREE,
  INDEX `belonging`(`belonging` ASC) USING BTREE,
  CONSTRAINT `pet_ibfk_1` FOREIGN KEY (`belonging`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of pet
-- ----------------------------
INSERT INTO `pet` VALUES (7, '2024-12-30 10:59:34', 'Max', 'https://tse3-mm.cn.bing.net/th/id/OIP-C.I4F8myLkyWhoOjdVlTZgvgAAAA?w=267', 'dog', '哈士奇犬', 'male', 1, 'fw', 13514166.60603, 3651826.87725, '6', NULL);
INSERT INTO `pet` VALUES (8, '2024-12-30 11:00:31', 'Lucy', 'https://tse4-mm.cn.bing.net/th/id/OIP-C.5xAgxwljfeS9C5bTx6pQuQHaEo?w=312', 'cat', '波斯猫', 'female', 3, 'cute', 13513818.31085, 3651444.70166, '6', NULL);
INSERT INTO `pet` VALUES (9, '2024-12-30 11:01:00', 'Buddy', 'https://img0.baidu.com/it/u=2205376118,3235587920&fm=253&fmt=auto&app=120&f=JPEG?w=846&h=800', 'dog', '金毛犬', 'male', 2, 'active', 13513818.31085, 3651444.70166, '1', NULL);
INSERT INTO `pet` VALUES (10, '2024-12-30 11:02:00', 'Molly', 'https://img0.baidu.com/it/u=518644774,2375219161&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=1155', 'cat', '暹罗猫', 'female', 4, 'friendly', 13514166.60603, 3651826.87725, '2', NULL);
INSERT INTO `pet` VALUES (11, '2024-12-30 11:03:00', 'Charlie', 'https://img1.baidu.com/it/u=1354167855,2469565320&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=1071', 'dog', '拉布拉多犬', 'male', 5, 'energetic', 13513818.31085, 3651444.70166, '3', NULL);
INSERT INTO `pet` VALUES (12, '2024-12-30 11:04:00', 'Luna', 'https://qcloud.dpfile.com/pc/gYdOXlLWFgKnQ4iXGionK8xEhxKk8MWD9pj9bHc2IS2ZCJcBAmuvpeV0dDPaOhRI.jpg', 'cat', '英短猫', 'female', 6, 'lazy', 13514166.60603, 3651826.87725, '4', NULL);
INSERT INTO `pet` VALUES (13, '2024-12-30 11:05:00', 'Rocky', 'https://img0.baidu.com/it/u=4104493933,570191119&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=1132', 'dog', '柯基犬', 'male', 1, 'playful', 13513818.31085, 3651444.70166, '5', NULL);
INSERT INTO `pet` VALUES (14, '2024-12-30 11:06:00', 'Daisy', 'https://b0.bdstatic.com/94733f9e5c58118aa214011f34b58ae4.jpg@h_1280', 'cat', '布偶猫', 'female', 3, 'gentle', 13514166.60603, 3651826.87725, '6', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nickname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `identity` enum('用户','管理员') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `reg_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `account`(`account` ASC) USING BTREE,
  UNIQUE INDEX `email`(`email` ASC) USING BTREE,
  UNIQUE INDEX `phone`(`phone` ASC) USING BTREE,
  UNIQUE INDEX `nickname`(`nickname` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', 'root', '123456', '1543168578@qq.com', '18321918131', '管理员', NULL);
INSERT INTO `user` VALUES (6, 'frank', 'Frankchicken', '123456', '3443487582@qq.com', '19921133976', '用户', '2024-12-30 10:18:57');
INSERT INTO `user` VALUES (8, 'admin', 'admin123', '123123', '19921133975@163.com', '19921133975', '用户', '2024-12-30 10:35:56');

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE announcement (
           announcement_id INT PRIMARY KEY,
           title VARCHAR(255) NOT NULL COMMENT '公告标题',
           content TEXT NOT NULL COMMENT '公告内容',
           created_by INT NOT NULL COMMENT '创建者ID',
           created_at DATETIME NOT NULL COMMENT '创建时间',
           updated_at DATETIME COMMENT '更新时间',
           is_active TINYINT(1) NOT NULL DEFAULT 1 COMMENT '公告是否有效 1: 是, 0: 否'
);
ALTER TABLE announcement MODIFY announcement_id INT AUTO_INCREMENT;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO announcement (announcement_id, title, content, created_by, created_at, updated_at, is_active) VALUES
(1, '宠物领养活动', '本周六将在公园举行宠物领养活动。', 2, '2025-01-19 14:01:09', '2025-01-19 14:01:09', 1),
(2, '欢迎新成员', '我们很高兴地欢迎您加入我们。', 1, '2025-01-19 14:02:34', '2025-01-19 14:02:34', 1),
(3, '欢迎下次光临', '山水有相逢。', 1, '2025-01-19 14:03:13', '2025-01-19 14:25:29', 0);

