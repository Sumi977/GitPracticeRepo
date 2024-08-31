package setup;

import java.time.Duration;

public class Util {
    public static void pauseExecutionForSeconds(){
        try{
            Thread.sleep(Duration.ofSeconds(2));
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
