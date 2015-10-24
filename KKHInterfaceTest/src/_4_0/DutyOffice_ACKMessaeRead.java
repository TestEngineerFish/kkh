package _4_0;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］read ack 消息
public class DutyOffice_ACKMessaeRead extends Helper {

	String question_id;
	String [] id_list = new String[1];
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//post需要传一个数组到后台，暂未实现，先略过
	@Ignore@Test
	public void test() throws Exception {
		question_id = "1085";
		id_list[0] = "3407";
		urlPath = "/duty_office/questions/" + question_id + "/messages/ack/read/";
	}

}
