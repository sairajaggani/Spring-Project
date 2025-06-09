package learnJava1.learnJava;


import org.springframework.stereotype.Component;

@Component
public class Sqldb implements Dataservice{
    public int[] retrieveData(){
        return new int[]{1,2,3,5,8,6,125};
    }
}
