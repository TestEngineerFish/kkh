package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

//病人直接给医生送苹果(暂未被应用)
public class PatientSendToDoctorGift extends Helper {
	String amount;

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	
	@Ignore@Test
	public void test() throws Exception {
		amount = "10";
		urlPath = "/patients/"+ patient_id + "/gifts/send_to_doctor/";
		map.put("doctor_pk", doctor_id);
		map.put("gift_pk", gift_id);
		map.put("amount", amount);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.fail("暂未被应用");
//		Assert.assertTrue(errorMsg(connection), assertCode(connection));
		
	}

}
