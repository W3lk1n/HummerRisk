

CREATE TABLE IF NOT EXISTS `webhook`
(
    `id`                         varchar(50)         NOT NULL COMMENT 'ID',
    `name`                       varchar(128)        DEFAULT NULL UNIQUE COMMENT '名称',
    `webhook`                    varchar(1024)       DEFAULT NULL COMMENT 'webhook',
    `status`                     tinyint(1)          DEFAULT 1 COMMENT '规则状态(启用1，停用0)',
    `create_time`                bigint(13)          DEFAULT NULL COMMENT '创建时间',
    `update_time`                bigint(13)          DEFAULT NULL COMMENT '更新时间',
    `creator`                    varchar(128)        DEFAULT NULL COMMENT '创建人',
    `proxy_id`                   int(11)             DEFAULT NULL COMMENT '代理ID',
    PRIMARY KEY (`id`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

ALTER TABLE `server` ADD `type` varchar(64) DEFAULT 'linux' COMMENT 'type: linux/windows';

ALTER TABLE `server_rule` ADD `type` varchar(64) DEFAULT 'linux' COMMENT 'type: linux/windows';

ALTER TABLE `server_result` ADD `type` varchar(64) DEFAULT 'linux' COMMENT 'type: linux/windows';

ALTER TABLE `history_server_result` ADD `type` varchar(64) DEFAULT 'linux' COMMENT 'type: linux/windows';

UPDATE `server` SET `type` = 'linux';

UPDATE `server_rule` SET `type` = 'linux';

UPDATE `server_result` SET `type` = 'linux';

UPDATE `history_server_result` SET `type` = 'linux';

INSERT INTO `plugin` (`id`, `name`, `icon`, `update_time`, `scan_type`, `order_`, `type`) VALUES ('hummer-jdcloud-plugin', '京东云', 'jdcloud.png', concat(unix_timestamp(now()), '003'), 'custodian', 21, 'cloud');
