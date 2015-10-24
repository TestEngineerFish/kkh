package _4_3;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetIncomeEntryList extends Helper {
	String before_ts;
	String page_size;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test() throws Exception {
		
		before_ts = "";
		page_size = "10";
		urlPath = "/doctors/" + doctor_id + "/income_entry_list/?"+"&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
