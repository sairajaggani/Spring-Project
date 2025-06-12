package Scope.learnJava;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;

// notes
/* 2 types
* 1. Singleton or Normal scope : everytime same bean is initialized with same ID

 * 2. Prototype : everytime new object is initialized with new ID per one IOC
 * Can be used when we need to use different bean each time it is called*/
@Component
class ClassNormal{

}
@Component
@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Protype{
	private ClassNormal classA;



	public void test(){
		System.out.println("Test2");
	}
}
@Configuration
@ComponentScan
public class Scope {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(Scope.class);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBean(ClassNormal.class));
		System.out.println(context.getBean(ClassNormal.class));
		System.out.println(context.getBean(ClassNormal.class));

		System.out.println(context.getBean(Protype.class));
		System.out.println(context.getBean(Protype.class));
		System.out.println(context.getBean(Protype.class));
		System.out.println(context.getBean(Protype.class));




	}
}
