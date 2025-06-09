package learnJava1.learnJava;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Bussinesslogic {

    Dataservice dataservice;

    public Bussinesslogic(Dataservice dataservice){
        super();
        this.dataservice= dataservice;
    }

    public int findmax(){
        return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
    }

}
