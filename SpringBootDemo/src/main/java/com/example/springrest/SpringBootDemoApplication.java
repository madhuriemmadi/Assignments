package com.example.springrest;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	/*@Bean(name = { "dataSource", "mysystemDataSource" })
	@ConfigurationProperties(prefix = "spring.mysystem.datasource")
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}*/

	/*@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

	    return sessionFactory;
	} */
	}


