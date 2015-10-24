package _3_1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//医生送苹果给客服
public class DoctorSendGiftsToSupport extends Helper{

	String amount;
	
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
		urlPath = "/doctors/" + doctor_id + "/gifts/send_to_support/";
		map.put("gift_pk", gift_id);
		map.put("amount", amount);
		connection = httpURLConnectionPOST(urlPath, map);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
