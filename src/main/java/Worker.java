import java.util.Calendar;
import java.util.Date;

/**
 * Created by Daniel on 2014/02/28.
 */
public class Worker implements IWorker {
    @Override
    public boolean Checksomething(){
        return Calendar.getInstance().getTimeInMillis()%2 == 0;
    }

    @Override
    public String doSomeWork(){
        return "I have done work in my standard implementation";
    }

    @Override
    public String complain(){
        return "I hate doing work";
    }
}
