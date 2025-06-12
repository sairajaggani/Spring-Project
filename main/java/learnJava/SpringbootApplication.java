package learnJava;



import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named // Replacement for Component
class BussinessClass{
//using Feild injection
//@Autowired
//Dependency1 dependency1;
//@Autowired
//Dependency2 dependency2;

Dependency1 dependency1;
Dependency2 dependency2;
//using setter based injection
	//@Autowired
	@Inject // Replacement for AUTOWIRED in jakartha
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("using setters");
		this.dependency2 = dependency2;
	}


	//using Constructer based // prefered in spring , easy to use and more efficient
	public BussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		System.out.println("This is from Constuctor based");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	public String test(){
	return "This is " + dependency1 + "this is dep 2 " + dependency2;
}

}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan()
public class SpringbootApplication {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(SpringbootApplication.class);
		//  	context.getBean(Console.class).up();
		//context.getBean(Gamemain.class).run();

		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BussinessClass.class).test());


	}
}
