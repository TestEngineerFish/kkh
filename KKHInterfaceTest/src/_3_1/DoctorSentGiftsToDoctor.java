package _3_1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;
//医生送苹果给医生
public class DoctorSentGiftsToDoctor extends Helper{

	String amount;
	String message;
	
	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	@Test
	public void test() throws Exception{
		amount = "10";
		message = "测试";
		urlPath = "/doctors/" + doctor_id + "/gifts/send_to_doctor/";
		map.put("to_doctor_pk", to_doctor_pk);
		map.put("gift_pk", gift_id);
		map.put("amount", amount);
		map.put("message", message);
		connection = super.httpURLConnectionPOST(urlPath, map);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
