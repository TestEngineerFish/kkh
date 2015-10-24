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
//手持工牌认证（添加医生二级认证）
public class AddAuthPicture extends Helper {
    String file;
    String membership_leve;
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

        file = "";
        membership_leve = "GEN";
        //申请认证的等级，'GEN' 表示普通认证，'SNR' 表示高级认证

        map.put("file",file);
        map.put("membership_leve",membership_leve);

        urlPath = "/doctors/" + doctor_id + "/addauthpic/";
        connection = super.httpURLConnectionPOST(urlPath, map);
        String message = errorMsg(connection);
        System.out.print(message);
        Assert.assertTrue(message, assertCode(connection));
    }

}
