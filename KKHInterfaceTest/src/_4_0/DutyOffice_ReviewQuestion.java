package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］评论问题
public class DutyOffice_ReviewQuestion extends Helper {
	String rating;
	String review;
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
		rating = "1";//1 差评，5好评
		review = "治疗水平不错，过几天就好了，技术杠杠的！";
		question_id = "1048";
		urlPath = "/duty_office/questions/" + question_id + "/review/create/";
		map.put("rating", rating);
		map.put("review", review);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}
}
