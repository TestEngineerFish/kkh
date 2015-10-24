package _4_1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;
//删除绑定的手机号
public class DeleteDoctorBoundPhone extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//	因删除功能不能重复执行多次，暂未实现自动化
	@Ignore@Test
	public void test() throws Exception {
		Assert.fail("因删除功能不能重复执行多次，暂未实现自动化");
	}

}
