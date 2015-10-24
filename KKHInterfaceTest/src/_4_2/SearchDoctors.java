package _4_2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//患者搜索医生(返回添加medal_level)
public class SearchDoctors extends Helper {

	String province_pk;
	String hospital_pk;
	String specialty_pk;
	String department_pk;
	String keyword;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		province_pk = "26";// 上海
		hospital_pk = "2366";// 上海中山医院
		specialty_pk = "10"; // 心内科
		department_pk = "2152";
		urlPath = "/searchdocs/?" + "province_pk" + province_pk + "&"
				+ "hospital_pk" + hospital_pk + "&" + "specialty_pk="
				+ specialty_pk + "&" + "department_pk=" + department_pk + "&";
		connection = super.httpURLConnectionGET(urlPath);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
