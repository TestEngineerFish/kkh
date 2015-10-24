package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］医生预约值班
public class DutyOffice_DoctorDutyOfficeBook extends Helper {

	String plan_pk;
	String year;
	String month;
	String day;
	int weekDay;

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
		//1、getWeebDay()获得本周几；
		//2、48每天被分成了48个值班时间段；
		//3、后台DutyOfficePlanID从344开始；
		//3、41代表一天中的第41个值班时间段（20:00-20:30）;
		plan_pk = String.valueOf(super.getWeekDay() * 48 + 343 + 41);
		year = super.getDate("yyyy");
		month = super.getDate("MM");
		day = super.getDate("dd");
//		System.out.println(year +"\n" + month +"\n" + day +"\n" + plan_pk);
		urlPath = "/doctors/" + doctor_id + "/duty_office/book/";
		map.put("plan_pk", plan_pk);
		map.put("year", year);
		map.put("month", month);
		map.put("day", day);
		connection = super.httpURLConnectionPOST(urlPath, map);
		if (connection.getResponseCode() == 400) {
			Assert.fail("已经预约了！");
		}
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}
}
