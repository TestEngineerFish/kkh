package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/22.
 */
//搜索转诊医生
public class SearchReferralDoctors extends Helper {

    String patient_pk;
    String doctor_name;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test() throws Exception {

        patient_pk = "2904";
        doctor_name = "宝宝";

        urlPath = "/doctors/" + doctor_id +"/patient_transfer/search_doctors/?" + "doctor_name=" + doctor_name + "&patient_pk=" + patient_pk + "&";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
