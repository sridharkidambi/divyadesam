package DivyaDesam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by sridharkidambi on 31/03/17.
 */

@Component
@Qualifier("temple")
public class Temple {
    @Autowired
    private OtherTemples otherTemples;

    public  int iSum(int i,int j,OtherTemples othT){
        int k= otherTemples.mySum(i,j);

        boolean bresult=(othT==otherTemples);
        return k;
    }

    @PostConstruct
    public void templeInit(){
        System.out.println("I am initialized");
    }

    @PreDestroy
    public void templeDestroy(){
        System.out.println("I am Destoryed");
    }

}
