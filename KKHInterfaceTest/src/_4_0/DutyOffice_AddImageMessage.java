package _4_0;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.kkh.helper.Helper;

//［值班室］创建图片信息
public class DutyOffice_AddImageMessage extends Helper {
//	from_type:  DOC/PAT，
//	  file:  <pic file type>,
	String from_type;
	String file;
	String question_id;

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
		map.clear();
	}

	//上传图片格式需要额外处理
	@Ignore@Test
	public void test() throws Exception {
		from_type = "PAT";
		file = "http://img2.imgtn.bdimg.com/it/u=3034250819,204003591&fm=21&gp=0.jpg";
		question_id = "1085";
		urlPath = "/duty_office/questions/" + question_id + "/messages/addpic/";
		map.put("from_type", from_type);
		map.put("file", file);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.fail("上传图片格式需要额外处理");
//		Assert.assertTrue(errorMsg(connection), assertCode(connection));
	}

}
