/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Contact mengzs.java@qq.com
 */
package com.mzs.costom.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @Author mengzs
 * @Email mengzs.java@qq.com
 * @Phone 13211786302
 * @Date 2017年9月4日
 */
@Configuration
public class SessionFactoryConfig {
	/** * mybatis 配置路径 */
	private static String MYBATIS_CONFIG = "mybatis-config.xml";
	/** * mybatis mapper resource 路径 */
	private static String MAPPER_PATH = "mapper/xml/*.xml";
	@Autowired
	private DataSource dataSource;
	private String typeAliasPackage = "com.mzs.costom.model";

	/**
	 * *创建sqlSessionFactoryBean 实例 * 并且设置configtion 如驼峰命名.等等 * 设置mapper 映射路径 *
	 * 设置datasource数据源 * @return
	 */
	@Bean
	public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		/** 设置mybatis configuration 扫描路径 */
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
		/** 添加mapper 扫描路径 */
		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("classpath:com/mzs/costom/*"+MAPPER_PATH));
		/** 设置datasource */
		sqlSessionFactoryBean.setDataSource(dataSource);
		/** 设置typeAlias 包扫描路径  别名/实体*/
		sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
		return sqlSessionFactoryBean;
	}
}
