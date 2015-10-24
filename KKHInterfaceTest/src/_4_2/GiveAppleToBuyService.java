package _4_2;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

//病人苹果支付医生服务
public class GiveAppleToBuyService extends Helper {
	String source_type = null;
	String source_pk = null;
	

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
	map.clear();
	}
	//需要先调用生成订单接口，该接口才能使用
	@Ignore@Test
	public void test() throws Exception {
		source_type = "CSR";
		
		source_pk = "";
		Assert.fail("需要其他接口配合");
		
	}

}
