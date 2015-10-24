package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生获取值班列表
public class DutyOffice_DoctorGetDutyOfficePlan extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/duty_office/plans/?doctor_pk=" + doctor_id + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
		
	}

}
