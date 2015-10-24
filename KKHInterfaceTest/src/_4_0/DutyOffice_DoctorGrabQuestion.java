package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//[值班室]医生抢问题
public class DutyOffice_DoctorGrabQuestion extends Helper {

	String question_id;

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	// error： 4005, 提前预约才能抢问题哦
	//
	// error： 4006, 审核后才能值班哦
	//
	// error： 4007, 手慢了
	@Test
	public void test() throws Exception {
		question_id = "1210";
		urlPath = "/duty_office/questions/" + question_id + "/grab/";
		map.put("doctor_pk", doctor_id);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
