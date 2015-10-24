package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lifengmei on 15/10/22.
 */
//接受转诊
public class ReceiveTransfers extends Helper{
    String receive_doctor_id;
    String transfer_id;
    @Before
    public void setUp() throws Exception {
        map = new HashMap<String, String>();
    }

    @After
    public void tearDown() throws Exception {
        map.clear();
    }
    @Test
    public void test() throws Exception {
        receive_doctor_id = "300952";
        transfer_id = "488";

        urlPath = "/doctors/" + receive_doctor_id + "/patient_receive/" + transfer_id + "/receive/";
        connection = super.httpURLConnectionPOST(urlPath, null);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }

}
