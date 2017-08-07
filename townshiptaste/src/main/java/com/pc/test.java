package com.pc;

import java.text.DateFormat;
import java.util.Date;

import org.apache.ibatis.javassist.expr.NewArray;
import org.json.JSONArray;
import org.json.JSONException;

import com.alibaba.fastjson.JSONObject;

public class test {
	public static void main(String[] args) throws JSONException {
		Date d = new Date();
		 DateFormat d1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		 System.out.println(d1.format(d));
	}
}
