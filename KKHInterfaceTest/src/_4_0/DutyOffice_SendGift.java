package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］发送礼物
public class DutyOffice_SendGift extends Helper {

	String from_type;
	String gift_pk;
	String amount;
	String question_id;

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
		question_id = "1210";
		from_type = "PAT";
		amount = "10";
		urlPath = "/duty_office/questions/" + question_id +"/messages/addgift/";
		map.put("from_type", from_type);
		map.put("gift_pk", gift_id);
		map.put("amount", amount);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
