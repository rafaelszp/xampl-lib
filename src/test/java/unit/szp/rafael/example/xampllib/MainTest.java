package unit.szp.rafael.example.xampllib;

import org.testng.annotations.Test;
import szp.rafael.example.xampllib.Main;

/**
 * Created by rafael on 4/10/17.
 */
public class MainTest {

  @Test
  public void shouldTada(){
  	Main m = new Main();
  	m.tada();
	System.out.println("TADA WORKED");
  }

}
