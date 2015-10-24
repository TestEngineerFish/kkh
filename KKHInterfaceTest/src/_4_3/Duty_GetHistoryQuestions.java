package _4_3;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//[值班室] 获取值班室历史问题
public class Duty_GetHistoryQuestions extends Helper {

	String before_pk;
	String page_size;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		before_pk = "1111";
		page_size = "10";
		urlPath = "/duty_office/history_questions/?" + "doctor_pk=" + doctor_id + "&before_pk=" + before_pk + "&page_size=" + page_size + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
