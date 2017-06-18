package DivyaDesam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OtherTemples {

@Value("${OWNER_NAME}")
public String ownerName;

    public  int mySum(int i,int j){
        String m=ownerName;
        return (i+j);
    }
}
