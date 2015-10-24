package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

//医生状态 增加苹果余额
public class AccountStatus_AccountBalance extends Helper{
    String announcement_ts;

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
        announcement_ts = "";

        map.put("phone_num", phone_num);
        map.put("announcement_ts", announcement_ts);

       urlPath = "/doctors/" + doctor_id + "/accountstatus/";
       connection = super.httpURLConnectionPOST(urlPath, map);
       Assert.assertTrue(errorMsg(connection), assertCode(connection));
   }

}
