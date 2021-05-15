package com.example.isaccanedo;

import com.example.isaccanedo.service.NotesChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableCaching
public class isaccanedoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(isaccanedoApplication.class, args);
		System.out.println("+++++++++++++");
		context.getBean(NotesChecker.class).test();
		System.out.println("+++++++++++++------------");
		context.getBean(NotesChecker.class).test();
		System.out.println("+++++++++++++------------+++++++++++++");
		context.getBean(NotesChecker.class).test();
		System.out.println("+++++++++++++--------------++++++++++++-------------");
	}
}
