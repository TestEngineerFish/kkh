package _4_1;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

//获取微信信息(添加医生获取)
public class DoctorGetWXPatientInfo extends Helper {

	String code;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//需要传weixinID，这个需要客户端生成，暂略过
	@Ignore@Test
	public void test() throws Exception {
		code = "omQEit8qdPtjFGqgfXDUVlADt9vs";
		urlPath = "/wxlogin/wxuserinfo/?" + "code=" + code + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.fail("获取微信患者信息用在什么地方？？");
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
