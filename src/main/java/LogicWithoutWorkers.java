import java.util.Calendar;

/**
 * Created by Daniel on 2014/02/28.
 */
public class LogicWithoutWorkers {

    public String myLogicMethod(){
        if(Checksomething()){
           return doSomeWork();
        }
        return complain();
    }

    private boolean Checksomething(){
        return Calendar.getInstance().getTimeInMillis()%2 == 0;
    }

    private String doSomeWork(){
        return "I have done work in my standard implementation";
    }

    private String complain(){
        return "I hate doing work";
    }
}
