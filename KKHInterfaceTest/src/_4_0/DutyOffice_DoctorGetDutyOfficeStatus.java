package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生值班室状态(获取值班室当前的状态)
public class DutyOffice_DoctorGetDutyOfficeStatus extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/doctors/" + doctor_id +"/duty_office/status/?";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
