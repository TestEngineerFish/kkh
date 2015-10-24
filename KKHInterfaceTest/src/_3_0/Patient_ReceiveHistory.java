package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//病人转诊 （转入） 纪录
public class Patient_ReceiveHistory extends Helper{
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        urlPath = "/doctors/" + doctor_id + "/patient_receive/history/?";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
