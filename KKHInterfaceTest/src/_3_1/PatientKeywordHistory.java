package _3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//热门搜索词条
public class PatientKeywordHistory extends Helper{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		urlPath = "/keyword_history/hot_keywords" + "&";
		connection = super.httpURLConnectionGET(urlPath);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
