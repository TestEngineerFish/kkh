package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生获取抢问题结果（轮询）
public class DutyOffice_DoctorCheckGrabStatus extends Helper {

	String question_id;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		question_id = "1211";
		urlPath = "/duty_office/questions/" + question_id + "/check_grab_status/?" + "doctor_pk=" + doctor_id + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
