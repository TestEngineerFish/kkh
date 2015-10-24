package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生获取值班滚动消息
public class DutyOffice_DoctorGetDutyOfficeNews extends Helper {

	String from_user_type;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		from_user_type = "DOC";
		urlPath = "/duty_office/news/?from_user_type=" + from_user_type + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
