package _4_3;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//[值班室] 获取值班室最近的消息［合并到conversation］
public class GetDutyOfficeLatestMessages extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/patients/" + patient_id + "/duty_office/messages/latest/?";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
