package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class DemoS3Tests {

	@Autowired DemoS3 demoS3;
	
	//	TODO:  Run this test, it should pass.
	@Test
	public void contextLoads() throws Exception {
		
		demoS3.createAndUpload();
	}

}
