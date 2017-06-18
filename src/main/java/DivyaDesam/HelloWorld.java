package DivyaDesam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sridharkidambi on 31/03/17.
 */
@Configuration
@ComponentScan( basePackages = {"DivyaDesam"})
public class HelloWorld {

    @Autowired
    private Temple temple;

    @Autowired
    private OtherTemples otherTemples;

    public  static  void  main(String[] str){

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(new String[] {"beanconfig.xml"});

        System.out.print("Hello World");

        HelloWorld helloWorld=new HelloWorld();
        helloWorld.runMethod(ctx);

    }

    public  void  runMethod(ApplicationContext ctx){
       temple= (Temple)ctx.getBean("temple");
        otherTemples= (OtherTemples) ctx.getBean("otherTemples");
        System.out.println(temple.iSum(1,4,otherTemples));
    }
}
