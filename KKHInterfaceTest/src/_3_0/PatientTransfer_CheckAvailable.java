package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//检查是否允许病人转诊
public class PatientTransfer_CheckAvailable extends Helper {
    String patient_pk;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        patient_pk = "2858";
        urlPath = "/doctors/" + doctor_id + "/patient_transfer/check_available/?" + "patient_pk" + patient_pk + "&";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
