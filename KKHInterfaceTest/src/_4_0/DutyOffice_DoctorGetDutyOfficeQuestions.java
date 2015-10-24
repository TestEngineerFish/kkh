package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生获取值班问题（轮询)
public class DutyOffice_DoctorGetDutyOfficeQuestions extends Helper {
	// after_pk=20, # 取 id为20后的问题
	// page_size=5, # 后台默认20，
	String after_pk;
	String page_size;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		after_pk = "0";
		page_size = "20";
		urlPath = "/duty_office/questions/?doctor_pk=" + doctor_id
				+ "&after_pk=" + after_pk + "&page_size=" + page_size + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
