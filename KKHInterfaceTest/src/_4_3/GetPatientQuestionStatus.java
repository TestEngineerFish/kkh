package _4_3;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//[值班室] 获取病人问题的状态（push给了多少个医生，问题是否被医生抢答）
public class GetPatientQuestionStatus extends Helper {
	
	String question_id;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		question_id = "1210";
		urlPath = "/patients/" + patient_id + "/duty_office/questions/" + question_id + "/status/?";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
