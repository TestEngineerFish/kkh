package _4_2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

public class GetDoctorDetailToDoctor extends Helper {

	String toDoctor_id;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		toDoctor_id = doctor_id;
		urlPath = "/doctorsfordoctor/"+ doctor_id + "/?" + "doctor_id=" + toDoctor_id + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
