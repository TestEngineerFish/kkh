package _4_1;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//收藏科普文章
public class FavoritePopularScienceArticles extends Helper {
	
	String articles_id;

	@Before
	public  void setUp() throws Exception {
		map = new HashMap<String, String>();
	}

	@After
	public  void tearDown() throws Exception {
		map.clear();
	}

	@Test
	public void test_SmokeTest() throws Exception {
		articles_id = "50";
		urlPath = "/popular_science/articles/" + articles_id + "/favorite/create/";
		map.put("patient_pk", patient_id);
		connection = super.httpURLConnectionPOST(urlPath, map);
		Assert.assertTrue(errorMsg(connection), assertCode(connection));
		
	}

}
