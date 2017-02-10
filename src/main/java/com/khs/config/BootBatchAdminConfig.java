package com.khs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={
	"classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml",
	"classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml"
})
@EnableAutoConfiguration(exclude = { BatchAutoConfiguration.class, DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class })
public class BootBatchAdminConfig  extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(BootBatchAdminConfig.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootBatchAdminConfig.class);
	}
}
