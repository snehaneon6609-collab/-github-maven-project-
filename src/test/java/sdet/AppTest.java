package sdet;


import org.testng.Assert;
import org.testng.annotations.Test;

import java_source_code.App;

//unit test by dev
public class AppTest {
  @Test
 public void testlogin1() 
  {
	 App obj=new App();
	 Assert.assertEquals(0,obj.userLogin("izin","abc123"));//invalid data
	 
  
  }
  @Test
  public void testlogin2() 
  {
	  App obj=new App();
		 Assert.assertEquals(1,obj.userLogin("izin","izin"));//valid..return 1
  }
}