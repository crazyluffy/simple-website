package org.renm.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "org.renm.repository")
@EntityScan(basePackages = "org.renm.dao.entity")
@EnableTransactionManagement
public class ApplicationConfig {

/*
    @Value("${spring.datasource.driver")
    private String DBDriver;
    @Value("${spring.datasource.url}")
    private String DBAddress;
    @Value("${spring.datasource.username}")
    private String DBUsername;
    @Value("${spring.datasource.password}")
    private String DBPassword;
*/

//    org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration
 /*
    @Bean
    public DataSource dataSource() {
//        return new DruidDataSourceBuilder().build()
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(DBDriver);
        dataSource.setUrl(DBAddress);
        dataSource.setUsername(DBUsername);
        dataSource.setPassword(DBPassword);

        return dataSource;
    }
*/

 /*
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource,
                                                                           JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactoryBean.setPackagesToScan("org.renm.dao.entity");

        return entityManagerFactoryBean;
    }
*/
}
