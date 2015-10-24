package _4_1;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//获取医生绑定验证码
public class GetDoctorBoundPhoneVerifyPassword extends Helper {

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
		urlPath = "/doctors/" + doctor_id + "/doctor_bound_info/verification_code/";
		map.put("account_num", phone_num);
		connection = super.httpURLConnectionPOST(urlPath, map);
		//因为这个手机号已经被绑定了，所以后台会返回400，表明该手机号已被其他用户绑定
		Assert.assertTrue(errorMsg(connection), connection.getResponseCode() == 400);
	}

}
