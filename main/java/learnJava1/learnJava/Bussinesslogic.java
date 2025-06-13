package learnJava1.learnJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Component
// @Servive   can we used insterd of component for classes defining bussiness logic
//@Controller  can we used insterd of component for classes defining web controlletrs or APIS logic
//@Repository can we used insterd of component for classes defining databases logic

public class Bussinesslogic {

    //Dataservice dataservice;

    @Autowired
    Mongodb mongodb;
    @Autowired
    Sqldb sqldb;

//    public Bussinesslogic(Dataservice dataservice){
//        super();
//        this.dataservice= dataservice;
//    }

    public String findmax(){
        int x = Arrays.stream(mongodb.retrieveData()).max().orElse(0);
        int y = Arrays.stream(sqldb.retrieveData()).max().orElse(0);
        return "MongoDb = " + x + " MYSQL = " +  y;
    }

}
