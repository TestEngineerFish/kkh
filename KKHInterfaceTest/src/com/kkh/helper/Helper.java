package com.kkh.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONTokener;

public class Helper {

	public static String urlPath;
	public static String jsonStr;
	public static HttpURLConnection connection;
	public static String[] name;
	public static int[] tier;
	public static String value;
	public static String printMsg = "返回值错误：";
	public static HashMap<String, String> map;
	public static HashMap<String, String[]> mapArray;
	public static Set<Entry<String, String>> setter;
	public static Object[] parametric;
	
	public static String patient_id = "2528";
	public static String doctor_id = "299150";
	public static String phone_num = "18221891473";
	public static String gift_id = "1";
	//****************************************华丽分隔***********************************************
	public static String to_doctor_pk = "299961";

	/**
	 * 获得解析后的JSON对象值
	 * 
	 * @param urlStr
	 * @return
	 */
	public String getJsonObject(String jsonStr, String[] name, int[] tier,
			int type) {

		JSONTokener jsonTokener = new JSONTokener(jsonStr);
		JSONObject jsonObject;
		String value = null;
		try {
			jsonObject = (JSONObject) jsonTokener.nextValue();

			switch (type) {
			case 0:
				// ->Object
				value = jsonObject.getString(name[tier[0]]);
				break;
			case 1:
				// ->Object->String
				value = jsonObject.getJSONObject(name[tier[0]]).getString(
						name[tier[1]]);
				break;
			case 2:
				// ->Array->Object->String
				value = jsonObject.getJSONArray(name[tier[0]])
						.getJSONObject(tier[0]).getString(name[tier[2]]);
				break;
			case 3:
				// ->Object->Array->Object->String
				value = jsonObject.getJSONObject(name[tier[0]])
						.getJSONArray(name[tier[1]]).getJSONObject(tier[2])
						.getString(name[tier[3]]);
				break;
			default:
				break;
			}

			return value;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;
	}

	/**
	 * 
	 * 接口调用 GET
	 */

	public static HttpURLConnection httpURLConnectionGET(String urlPath) {
		String urlStr = "http://testenv.kangkanghui.com:80" + urlPath + "nomd5";
		try {

			URL url = new URL(urlStr); // 把字符串转换为URL请求地址

			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();// 打开连接

			connection.connect();// 连接会话
			return connection;

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("失败!");

		}
		return null;

	}

	/**
	 * 
	 * 接口调用 POST
	 */

	public static HttpURLConnection httpURLConnectionPOST(String urlPath,
			Map<String, String> parametric) throws Exception {
		String urlStr = "http://testenv.kangkanghui.com:80" + urlPath;
		// ------------------------------------------------------------------------设置参数
		// 获得传入map中的参数，并赋值到StringBuilder参数中，发送到服务器
		StringBuilder part = new StringBuilder();
		if (parametric != null) {
			for (Map.Entry<String, String> entry : parametric.entrySet()) {
				part.append(entry.getKey()).append("=")
						.append(entry.getValue());
				part.append("&");
			}
		}

		part.append("nomd5");
		byte[] head = part.toString().getBytes();
		// ------------------------------------------------------------------------创建连接
		URL url = new URL(urlStr);
		//将url 以 open方法返回的urlConnection连接强转为HttpURLConnection连接  (标识一个url所引用的远程对象连接),此时cnnection只是为一个连接对象,待连接中
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//设置连接主机超时（单位：毫秒）
		connection.setConnectTimeout(2000);
		// 设定请求的方法为"POST"，默认是GET  
		connection.setRequestMethod("POST");
		// 设置连接输出流为true,默认false (post 请求是以流的方式隐式的传递参数)
		connection.setDoOutput(true);
		// 设置请求头里面的各个属性
		//配置本次连接的Content-type，配置为application/x-www-form-urlencoded的 意思是正文是urlencoded编码过的form参数
		connection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		//设置文件长度
		connection.setRequestProperty("Content-Length", head.length + "");

		// ------------------------------------------------------------------------发送参数
		// 建立连接，此处getOutputStream会隐含的进行connect(即：如同调用上面的connect()方法，所以在开发中不调用上述的connect()也可以)
		OutputStream ops = connection.getOutputStream();
		ops.write(head);
		// 关闭连接
		//输出完成后刷新并关闭流
		ops.flush();
		//关闭流
		ops.close();
		return connection;
	}

	/**
	 * 获得接口的返回值内容
	 */
	public static String getJsonArray(HttpURLConnection connection)
			throws Exception {
		// ------------------------------------------------------------------------输出返回内容
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		connection.disconnect();
		return sb.toString();
	}

	/**
	 * 设置map对象
	 */
	public static Object[] setMap(HashMap<String, String> map) throws Exception {
		// 创建map的视图，获得Set对象（ entrySet()&keySet() ）或Collection对象( Values() )
		// setter = map.entrySet();
		// 放进数组中，方便调用
		// parametric = map.entrySet().toArray();
		parametric = map.values().toArray();
		return parametric;
	}

	/**
	 * 获得链接返回的code字段值
	 */
	public static boolean assertCode(HttpURLConnection connection)
			throws Exception {
		if (connection.getResponseCode() != 200) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * 输出连接返回code和连接返回message
	 */
	public static String errorMsg(HttpURLConnection connection) throws Exception {
		String output = "\n" + "返回Code：" + connection.getResponseCode() + "\n"
				+ "返回Message：" + connection.getResponseMessage();
		return output;
	}
	
	/**
	 * 
	 * 接口调用 POST
	 */

	public static HttpURLConnection httpURLConnectionPOSTArray(String urlPath,
			Map<String, String[]> parametric) throws Exception {
		String urlStr = "http://testenv.kangkanghui.com:80" + urlPath;
		// ------------------------------------------------------------------------设置参数
		// 获得传入map中的参数，并赋值到StringBuilder参数中，发送到服务器
		StringBuilder part = new StringBuilder();
		if (parametric != null) {
			for (Map.Entry<String, String[]> entry : parametric.entrySet()) {
				part.append(entry.getKey()).append("=")
						.append(entry.getValue());
				part.append("&");
			}
		}

		part.append("nomd5");
		byte[] head = part.toString().getBytes();
		// ------------------------------------------------------------------------创建连接
		URL url = new URL(urlStr);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(2000);
		connection.setRequestMethod("POST");
		// 设置连接输出流为true,默认false (post 请求是以流的方式隐式的传递参数)
		connection.setDoOutput(true);
		// 设置请求头里面的各个属性
		connection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		connection.setRequestProperty("Content-Length", head.length + "");

		// ------------------------------------------------------------------------发送参数
		OutputStream ops = connection.getOutputStream();
		ops.write(head);
		// 关闭连接
		ops.flush();
		ops.close();
		return connection;
	}
	
	//获得周几
	public int getWeekDay() {
		Date day = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(day);
		//获得是本月的第几周
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		return weekDay - 1;
	}
	//获取系统日期
	public String getDate(String format) {
		String date;
		SimpleDateFormat clock = new SimpleDateFormat(format);
		date = clock.format(new Date());
		return date;
	}
}