import org.testng.annotations.Test;

import com.completeproject.AppUnderTest;

public class TestDriver {
  @Test
  public void driverMethod() {
	  
	  AppUnderTest aut = new AppUnderTest();
	  aut.appMethod();
	  
	  System.out.println("@@@@@ In the Test Class Method @@@@ ");
	  
	  System.out.println("&&&&& second commit in Test class method &&&&&& ");
	  
	  
  }
}
