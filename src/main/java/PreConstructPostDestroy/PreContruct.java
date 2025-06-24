package PreConstructPostDestroy;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{
    private ClassDependency classDependency;

    public ClassA(ClassDependency classDependency){
        this.classDependency = classDependency;
    }

  @PostConstruct
    public void initilize(){   // used when function need to directly called without using Bean
        classDependency.Preconstruct();
  }

  @PreDestroy
  public String cleanup(){               // used when function to be run just before the IOc is about to distroy // used to close datbase connection at last
      System.out.println("Using Predestroy class directly");
      return null;
  }


}
@Component
class ClassDependency{

public void Preconstruct(){
    System.out.println("Using Postcontruct class directly");
}

}
@Configuration
@ComponentScan
public class PreContruct{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PreConstructPostDestroy.PreContruct.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Running maain class");
      // context.getBean(ClassA.class).cleanup();

    }
}

