package _4_2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//病人获取推荐医生列表（返回添加medal_level）
public class PatientGetCommendDoctors extends Helper {
	String by_specialty = "1";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/recommend/doctors/?" + "by_specialty=" + by_specialty + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
