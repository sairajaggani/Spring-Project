package Helloworld;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Address(String street, String city, int pin){ }
record Person(String name, int age, Address address){ }


@Configuration
public class Game1 {
    @Bean
    public String sai(){
        return "Padhmabushan";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean(name = "add")
    @Primary
    public Address address(){
        return new Address("1300, N oak st", "rolla", 65401);
    }
    @Bean
    @Qualifier("test")
    public Address address1(){
        return new Address("1301, N oak st", "bolla", 656401);
    }
    @Bean
    public Person person(){
        return new Person(sai(),age(),address() );
    }
    @Bean
    public Person person3(){
        return new Person(sai(),age(),address() );
    }
    @Bean
    public Person person1(String sai, int age, @Qualifier("test") Address address){
        return new Person("nandu", 25, address);
    }
    @Bean
    public Person person2(String sai, int age, @Qualifier("test") Address address){
        return new Person("Abhay", 24, address);
    }


}
