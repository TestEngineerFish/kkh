package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//转诊医生详情
public class ReferralsDoctorDetail extends Helper {
    String transfer_doctor_id = "300980";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        urlPath = "/doctors/" + doctor_id + "/patient_transfer/doctor_intro/" +transfer_doctor_id+"/?";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }

}
