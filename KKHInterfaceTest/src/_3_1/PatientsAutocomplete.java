package _3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//自动补全（新）
public class PatientsAutocomplete extends Helper{

	String keyword;
	String keyword_type;
	String page;
	String page_size;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		
		keyword = "李";
		keyword_type = "DOC";
		page = "1";
		page_size = "20";
		
		urlPath = "/autocomplete/general/?" + "keyword=" + keyword + "&" + "keyword_type=" + "DOC" + "&" + "page=" + page +
				"&" + "page_size=" + page_size + "&";
		connection = super.httpURLConnectionGET(urlPath);
		assertTrue(errorMsg(connection), assertCode(connection));
	}

}
