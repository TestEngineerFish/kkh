package _4_2;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//医生添加患者后提示患者关注
public class PromptPatientAttention extends Helper {


	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	@Test
	public void test() throws Exception {
		
		urlPath = "/doctors/" + doctor_id + "/followers/" + patient_id
				+ "/remind_follow/";
		
		connection = super.httpURLConnectionPOST(urlPath, null);
		
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
