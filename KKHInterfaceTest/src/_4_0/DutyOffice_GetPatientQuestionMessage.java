package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］病人获取问题会话消息
public class DutyOffice_GetPatientQuestionMessage extends Helper {

	String question_id;
	String after_pk;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		question_id = "1210";
		after_pk = "0";
		urlPath = "/patients/" + patient_id +"/duty_office/questions/" + question_id +"/messages/?" + "after_pk=" + after_pk + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
