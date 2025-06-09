package com.learn.Springboot;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.learn.Springboot")
public class SpringbootApplication {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(SpringbootApplication.class);
		//  	context.getBean(Console.class).up();
		context.getBean(Gamemain.class).run();
	}
}
