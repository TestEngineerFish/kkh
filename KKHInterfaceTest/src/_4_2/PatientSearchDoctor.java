package _4_2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

///患者搜索医生(返回添加medal_level)
public class PatientSearchDoctor extends Helper {
	String keyword;
	String keyword_type = "DOC";
	String page = "1";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		keyword = "沙医生";
		urlPath = "/doctors/search/general/?" + "keyword=" + keyword + "&"
				+ "keyword_type=" + keyword_type + "&" + "page=" + page + "&"
				+ "patient_id" + patient_id + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
