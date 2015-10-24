package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoctorCircle_UpdatePossibleFriends extends Helper{
    String page;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test() throws Exception {
        page="3";
        urlPath = "/doctors/"+ doctor_id+"/doctor_circle/possible_friends/?" + "page=" + page + "&";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
