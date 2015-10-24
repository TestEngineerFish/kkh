package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］病人创建问题
public class DutyOffice_PatientCreateQuestion extends Helper {
	String specialty_pk;
	String description;
	String member_pk;

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	@Test
	public void test() throws Exception {
		specialty_pk = "1";//眼科
		description = "看不见了，怎么办？";
		member_pk = "265";//自己
		urlPath = "/patients/" + patient_id + "/duty_office/questions/create/";
		map.put("specialty_pk", specialty_pk);
		map.put("description", description);
		map.put("member_pk", member_pk);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
