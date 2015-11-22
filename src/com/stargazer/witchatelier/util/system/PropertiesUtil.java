package com.stargazer.witchatelier.util.system;

import org.apache.log4j.Logger;

public class PropertiesUtil {
	static Logger logger = Logger.getLogger(PropertiesUtil.class.getName());
	public static String getValue(String key)
	{
	if(System.getProperty(key)==null)
	{
		PropertyInit propertyInit = new PropertyInit();
		logger.info("Pisual Witch Atelier System 系统启动中 正在加载系统核心参数 连接主数据库");
		System.out.println("Pisual Witch Atelier System 启动完毕");
		System.out.println("Pisual Witch Atelier System 2.12 Online");
	}
	return System.getProperty(key);
	}
}
