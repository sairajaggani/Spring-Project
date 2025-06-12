package LazylearnJava.learnJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// notes
/* Default initialization for spring is Eger(usefull), where object is automatically initialized at startup
* using @Lazy it is only initialized when we created when we use class using context.getBean*/
@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA){
		System.out.println("Test 1");
		this.classA= classA;
	}

	public void test(){
		System.out.println("Test2");
	}
}
@Configuration
@ComponentScan
public class Lazylearn {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(Lazylearn.class);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		context.getBean(ClassB.class).test();

	}
}
