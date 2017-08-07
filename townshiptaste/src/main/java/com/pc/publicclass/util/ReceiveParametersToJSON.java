package com.pc.publicclass.util;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * 
 * 接收参数转json
 *
 */
public class ReceiveParametersToJSON {
	
	/*
	 * String转json对象 数据格式："data1:1,data2:2"
	 */
	public static JSONObject stringToJSON(String parameters){
		parameters = parameters.trim();
		String [] strArrs = parameters.split(",");
		JSONObject json = new JSONObject();
		for(int i=0;i<strArrs.length;i++){
			String [] strArr = strArrs[i].split(":");
			try {
				json.put(strArr[0], strArr[1]);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json;
	}
	
	public static void main(String[] args) throws JSONException {
		String s = "data1:1,data2:2";
		JSONObject json = stringToJSON(s);
		System.out.println(json.getString("data2"));
	}
}
