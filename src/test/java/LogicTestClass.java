import javafx.beans.binding.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Daniel on 2014/02/28.
 */

@RunWith(MockitoJUnitRunner.class)
public class LogicTestClass {

    ILogicWithWorkers logicUnderTest;
    IWorker workerUnderTest;

    @Mock
    IWorker mockWorker;

    @Before
    public void setUp(){
        logicUnderTest = new LogicWithWorkers(mockWorker);
        workerUnderTest = new Worker();
    }

    @After
    public void tearDown(){
        mockWorker = null;
        logicUnderTest = null;
        workerUnderTest = null;
    }
    @Test
    public void myLogicMethodCheckSomethingTrue(){
        when(mockWorker.Checksomething()).thenReturn(true);

        logicUnderTest.myLogicMethod();

        verify(mockWorker,times(1)).Checksomething();
        verify(mockWorker, times(1)).doSomeWork();
        verify(mockWorker, never()).complain();
    }

    @Test
    public void myLogicMethodCheckSomethingFalse(){
        when(mockWorker.Checksomething()).thenReturn(false);

        logicUnderTest.myLogicMethod();

        verify(mockWorker,times(1)).Checksomething();
        verify(mockWorker, times(1)).complain();
        verify(mockWorker, never()).doSomeWork();
    }

    @Test
    public void checkDoWork(){
        assertEquals("Worker broken","I have done work in my standard implementation", workerUnderTest.doSomeWork());
    }

}
