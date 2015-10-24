package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］病人创建关心的人
public class DutyOffice_PatientCreateFamilyMember extends Helper {

	String call_name;
	String age;
	String month;
	String sex;
	String is_selected;
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
		call_name = "朋友";
		age = "25";
		month = "0";
		sex = "M";
		is_selected = "1";
		urlPath = "/patients/" + patient_id + "/family_members/create/";
		map.put("call_name", call_name);
		map.put("age", age);
		map.put("month", month);
		map.put("sex", sex);
		map.put("is_selected", is_selected);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
