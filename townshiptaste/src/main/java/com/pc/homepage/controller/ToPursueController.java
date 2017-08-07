package com.pc.homepage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.ToPursueEntity;
import com.pc.homepage.service.ToPursueService;

@Controller
@RequestMapping("/home/toPursue")
public class ToPursueController {
	
	@Resource
	private ToPursueService toPursueService;
	/**
	 * 保存用户追加评论
	 * @param commentId
	 * @param toPursueTime
	 * @param toPursueContent
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/saveTheReview.html",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String saveTheReview(@RequestParam("commentId") int commentId,@RequestParam("toPursueTime") String toPursueTime,
			@RequestParam("toPursueContent") String toPursueContent){
		ToPursueEntity toPursueEntity = new ToPursueEntity();
		JSONObject json = new JSONObject();
		toPursueEntity.setCommentId(commentId);
		toPursueEntity.setToPursueTime(toPursueTime);
		toPursueEntity.setToPursueContent(toPursueContent);
		int success = toPursueService.saveTheReview(toPursueEntity);
		json.put("success", success);
		return json.toString();
		
	}
	
	
}
