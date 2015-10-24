package _3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

public class DoctorGiftsAccount extends Helper{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		urlPath = "/doctors/" + doctor_id + "/account_gifts/?";
		connection = httpURLConnectionGET(urlPath);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
