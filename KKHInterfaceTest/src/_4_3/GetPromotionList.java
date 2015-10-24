package _4_3;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//获取活动列表（消息列表）
public class GetPromotionList extends Helper {

	String message_show;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		message_show = "true";
		urlPath = "/doctors/" + doctor_id + "/promotions/?" + "message_show=" + message_show + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}
//	确认返回的都是与当前医生相关且已开启的活动

}
