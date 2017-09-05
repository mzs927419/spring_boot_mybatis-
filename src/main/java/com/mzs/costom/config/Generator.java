/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Contact mengzs.java@qq.com
 */
package com.mzs.costom.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @Author mengzs
 * @Email mengzs.java@qq.com
 * @Phone 13211786302
 * @Date 2017年9月5日
 */
public class Generator {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;// 加载上面的配置文件
		File configFile = new File("./src/main/resources/generatorconfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
