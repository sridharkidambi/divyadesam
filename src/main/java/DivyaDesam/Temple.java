package DivyaDesam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sridharkidambi on 31/03/17.
 */

@Service
public class Temple {
    @Autowired
    private OtherTemples otherTemples;

    public  int iSum(int i,int j){
        int k= otherTemples.mySum(i,j);
        return k;
    }

}
