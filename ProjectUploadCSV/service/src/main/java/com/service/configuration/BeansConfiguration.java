package com.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.ConnectionFactory;

/*
 * Spring beans annotation based configuration
 * returns beans
 */
@Configuration
public class BeansConfiguration {
	
	@Bean
	public ConnectionFactory factory() {
		return (new ConnectionFactory());
	}
}
