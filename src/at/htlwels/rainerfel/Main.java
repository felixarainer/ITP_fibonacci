/**
 * Created by felix on 03.03.2017.
 */

package at.htlwels.rainerfel;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args){
            Result result = JUnitCore.runClasses(FibonacciTest.class);
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
    }
}
