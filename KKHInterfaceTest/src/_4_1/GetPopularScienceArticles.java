package _4_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kkh.helper.Helper;

//获取科普文章
public class GetPopularScienceArticles extends Helper {
	String need_recommend_articles = "1";
	String before_pk = "0";
	String page_size = "20";

	@Before
	public void setUps() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_SmokeTest() throws Exception {
		urlPath = "/popular_science/articles/?" + "need_recommend_articles="
				+ need_recommend_articles + "&" + "patient_pk=" + patient_id
				+ "&" + "before_pk=" + before_pk + "&" + "page_size="
				+ page_size + "&";
		connection = super.httpURLConnectionGET(urlPath);

	}

}
