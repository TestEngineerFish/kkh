package _4_2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//医生免费电话（返回错误码当病人没有手机号时）：
public class DoctorFreePhone extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/doctors/" + doctor_id + "/followers/" + patient_id
				+ "/freephone/";
		connection = super.httpURLConnectionPOST(urlPath, null);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}
}
