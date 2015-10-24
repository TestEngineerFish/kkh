package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］创建文字信息
public class DutyOffice_AddTextMessage extends Helper {
	String from_type;
	String text;
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
		from_type = "PAT";
		text = "我是患者，我发了一个文本消息";
		question_id = "1210";
		urlPath = "/duty_office/questions/" + question_id + "/messages/addtext/";
		map.put("from_type", from_type);
		map.put("text", text);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
