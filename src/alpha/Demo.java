package alpha;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.*;
public class Demo {



         private  static Logger log = LogManager.getLogger(Demo.class.getName());
    public static void main(String[] args) {
// TODO Auto-generated method stub

       log.debug("I am debugging");
   log.info("object is present");
   log.error("obeject is not present");

   log.fatal("this is fatal");
        log.fatal("this is fatal1");
        System.out.println(" redstop implementation");


    }
}