package _4_0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］获取病人关心的人
public class DutyOffice_GetPatientFamilyMembers extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		urlPath = "/patients/" + patient_id + "/family_members/";
		connection = super.httpURLConnectionGET(urlPath);
	}

}
