package Helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;





public class HelloWorld {

    public static void main(String[] args) {

//		//SpringApplication.run(SpringbootApplication.class, args);

        var context = new AnnotationConfigApplicationContext(Game1.class);
        //context.getBean(GameConfig.class).up();


        System.out.println(context.getBean("sai"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("add"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person1"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean("address1"));
        Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println);

    }

}
