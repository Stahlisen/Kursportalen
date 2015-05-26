package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BetygTest.class, GruppTest.class, InlamningTest.class,
		KursplatsTest.class, KursportalTest.class, MomentTest.class,
		UppgiftTest.class })
public class AllTests {
	//Testar alla klasser

}
