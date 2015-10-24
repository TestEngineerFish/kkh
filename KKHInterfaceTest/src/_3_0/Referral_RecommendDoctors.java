package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

/**
 * Created by lifengmei on 15/10/22.
 */
//转诊推荐医生
public class Referral_RecommendDoctors extends Helper {
    String patient_pk;
    String page;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test() throws Exception {

        patient_pk = "2904";
        page = "3";

        urlPath = "/doctors/" + doctor_id + "/patient_transfer/recommend_doctors/?";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
