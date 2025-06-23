package Jakartha;

import com.learn.Springboot.Gamemain;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfig {

    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("Configration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("game"));
            context.getBean(Gamemain.class).run();

        }

    }
}
