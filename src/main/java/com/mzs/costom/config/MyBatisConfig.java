/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Contact mengzs.java@qq.com
 */
package com.mzs.costom.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author mengzs
 * @Email mengzs.java@qq.com
 * @Phone 13211786302
 * @Date 2017年9月4日
 */
@Configuration
@MapperScan("com.mzs.costom.mapper")
public class MyBatisConfig {

	@Autowired
	private JdbcConfig jdbcConfig;

	@Bean
	public DataSource createDataSource() throws SQLException {
		return DataSourceBuilder.create(Thread.currentThread().getContextClassLoader())
				.driverClassName(jdbcConfig.getDriverClass()).url(jdbcConfig.url).username(jdbcConfig.userName)
				.password(jdbcConfig.password).build();
	}

	@PropertySource(value = "application.properties")
	@Component
	static class JdbcConfig {
		/** * 数据库用户名 */
		@Value("${spring.datasource.username}")
		private String userName;
		/** * 驱动名称 */
		@Value("${spring.datasource.driverClassName}")
		private String driverClass;
		/** * 数据库连接url */
		@Value("${spring.datasource.url}")
		private String url;
		/** * 数据库密码 */
		@Value("${spring.datasource.password}")
		private String password;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDriverClass() {
			return driverClass;
		}

		public void setDriverClass(String driverClass) {
			this.driverClass = driverClass;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
}
