package _4_2;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//医生添加患者
public class DoctorAddPatient extends Helper {
	String phone_num_list;
	String is_from_contact;

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
		phone_num_list = "["+ "\"" + phone_num + "\"" +"]";
		is_from_contact = "0";
		
		urlPath = "/doctors/" + doctor_id + "/add_patients/";
		
		map.put("phone_num_list", phone_num_list);
		map.put("is_from_contact", is_from_contact);
		
		connection = super.httpURLConnectionPOST(urlPath, map);
		
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
		
	}

}
