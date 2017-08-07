
package com.pc.homepage.controller;

import java.text.DateFormat;

import javax.annotation.Resource;

import org.apache.tools.ant.types.resources.selectors.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.MerchantReplyEntity;
import com.pc.homepage.service.MerchantReplyService;
/**
 * 商户追评控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/home/merchantReply")
public class MerchantReplyController {
	
	@Resource
	private MerchantReplyService merchantReplyService;
	/**
	 * 保存商户追评信息
	 * @param commentId        评论id 
	 * @param commentContent   追评内容
	 * @return int  是否保存成功
	 */
	@RequestMapping(method=RequestMethod.GET,value="/saveBusinessReply.html",produces="text/html;charset=UTF-8")
	public String saveBusinessReply(@RequestParam("commentId") int commentId,@RequestParam("commentContent") String commentContent){
		MerchantReplyEntity merchantReplyEntity = new MerchantReplyEntity();
		JSONObject json = new JSONObject();
		Date  date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //获取精确时间 格式：2017-8-3 17:20:56
		merchantReplyEntity.setCommentId(commentId);
		merchantReplyEntity.setCommentTime(dateFormat.format(date));
		merchantReplyEntity.setCommentContent(commentContent);
		int success = merchantReplyService.saveBusinessReply(merchantReplyEntity);
		json.put("success", success);
		return json.toString();
	}
}





















