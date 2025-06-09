package learnJava1.learnJava;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mongodb implements Dataservice {
    public int[] retrieveData(){
        return new int[]{11,12,13,45,85,65,15};
    }

}
