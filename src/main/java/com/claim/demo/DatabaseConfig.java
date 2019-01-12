package com.claim.demo;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableTransactionManagement
@EnableSpringDataWebSupport
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.claim.repository")
public class DatabaseConfig {

@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,DataSource dataSource) {
return builder.dataSource(dataSource)
.packages("com.claim.entity")
.build();
}

@Bean(name="transactionManager")
public PlatformTransactionManager barTransactionManager(
EntityManagerFactory factory) {
return new JpaTransactionManager(factory);
}
@Bean
public InternalResourceViewResolver resolver() {
    InternalResourceViewResolver vr = new InternalResourceViewResolver();
    vr.setPrefix("/WEB-INF/views/");
    vr.setSuffix(".jsp");
    System.out.println("**************Views set");
    return vr;
}
@Bean
public JavaMailSender getJavaMailSender() {
JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.gmail.com");
    mailSender.setPort(587);
    
    mailSender.setUsername("blacklionrepublic1@gmail.com");
    mailSender.setPassword("chrismfdavis123");

   Properties props = mailSender.getJavaMailProperties();
   props.put("mail.transport.protocol", "smtp");
    props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.debug", "true");
     
    return mailSender;
}
}

