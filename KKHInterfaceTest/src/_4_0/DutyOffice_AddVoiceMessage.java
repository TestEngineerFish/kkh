package _4_0;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

public class DutyOffice_AddVoiceMessage extends Helper {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//发送语音附件需要额外处理，暂略过
	@Ignore@Test
	public void test() throws Exception {
		Assert.fail("发送语音附件需要额外处理");
	}

}
