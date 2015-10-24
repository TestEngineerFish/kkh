package _3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//患者搜索医生（新）
public class PatientSerachDoctors extends Helper{
	String keyword;
	String keyword_type;
	String page;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		keyword = "沙医生";
		keyword_type = "DOC";
		page = "1";
		
		urlPath = "/doctors/search/general/?" + "keyword=" + keyword + "&" + "keyword_type=" + keyword_type + "&" 
				+ "page=" + page + "&" + patient_id + "&";
		connection = super.httpURLConnectionGET(urlPath);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
