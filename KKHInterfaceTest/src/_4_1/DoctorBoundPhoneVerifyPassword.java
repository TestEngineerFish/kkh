package _4_1;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

public class DoctorBoundPhoneVerifyPassword extends Helper {

//	ccount_num=&password=&channel= // option: channel
	String account_num;
	String password;
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
//		account_num = "14444444446";
//		password = "5233";
//		urlPath = "doctors/" + doctor_id +"/doctor_bound_info/verify_password/";
//		map.put("account_num", account_num);
//		map.put("password", account_num);
//		connection = super.httpURLConnectionPOST(urlPath, map);
//		Assert.assertTrue(errorMsg(connection), assertCode(connection));
		Assert.fail("因为验证码需要实时获取后台发送的验证码，暂时无法写入自动化");
	}

}
