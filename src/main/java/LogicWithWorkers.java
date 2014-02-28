/**
 * Created by Daniel on 2014/02/28.
 */
public class LogicWithWorkers implements ILogicWithWorkers {

    private IWorker worker;

    public LogicWithWorkers(IWorker worker) {
        this.worker = worker;
    }

    @Override
    public String myLogicMethod(){
        if(worker.Checksomething()){
            return worker.doSomeWork();
        }
        return worker.complain();
    }
}
