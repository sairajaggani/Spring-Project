package LazylearnJava.learnJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;



@Configuration
@ComponentScan
public class Lazylearn {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(Lazylearn.class);


		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



	}
}
