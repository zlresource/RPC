package com.zl.constant;
/**
 * Constant:定义需要使用的常用
 * @author 周力
 */
public interface Constant {
	int ZK_SESSION_TIMEOUT = 5000;

	String ZK_REGISTRY_PATH = "/registry";
	String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
