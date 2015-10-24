package _3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

public class DoctorsGiftsMonthly extends Helper{
	
	String after_pk;
	String offset;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		after_pk = "0";
		offset = "20";
		urlPath = "/doctors/" + doctor_id + "/gifts/monthly/?" + "gift_pk=" + gift_id + "&" +  "after_pk=" + after_pk +
				"&" + "offset=" + offset + "&";
		connection = httpURLConnectionGET(urlPath);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
