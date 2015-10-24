package _4_4;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lifengmei on 15/10/23.
 */
//[二级认证] load account status
public class DoctorGeneralAuthStatus extends Helper{
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

        map.put("phone_num",phone_num);

        urlPath = "/doctors/" + doctor_id + "/accountstatus/";
        connection = super.httpURLConnectionPOST(urlPath, map);
        String message = errorMsg(connection);
        System.out.print(message);
        Assert.assertTrue(message, assertCode(connection));
    }
}
