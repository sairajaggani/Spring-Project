package learnJava1.learnJava;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("learnJava1.learnJava")
public class RealworldExample {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(RealworldExample.class);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(Bussinesslogic.class).findmax());

	}
}
