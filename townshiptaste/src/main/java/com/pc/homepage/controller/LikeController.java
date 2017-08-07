package com.pc.homepage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.LikeEntity;
import com.pc.homepage.service.LikeService;
/**
 * 点赞控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/home/like")
public class LikeController {
	
	@Resource
	private LikeService likeService;
	/**
	 * 保存点赞
	 * @param userId
	 * @param commentId
	 * @return int 1表示成功
	 */
	@RequestMapping("savePointsPoRemember.html")
	@ResponseBody
	public String savePointsPoRemember(@RequestParam("userId") int userId,@RequestParam("commentId") int commentId){
		LikeEntity likeEntity = new LikeEntity();
		JSONObject json = new JSONObject();
		likeEntity.setUserId(userId);
		likeEntity.setCommentId(commentId);
		int success = likeService.savePointsPoRemember(likeEntity);
		json.put("success", success);
		return json.toString();
		
	}
}
