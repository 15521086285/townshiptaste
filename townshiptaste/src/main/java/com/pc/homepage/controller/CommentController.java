package com.pc.homepage.controller;

import java.text.DateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.ProductReviewsEntity;
import com.pc.homepage.service.ProductReviewsService;

/**
 * 评论控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/home/comment")
public class CommentController {
	
	@Resource
	private ProductReviewsService productReviewsService;
	/**
	 * 保存评论
	 * @param userId            用户id
	 * @param oderNumber  		订单编号
	 * @param commodityId       商品id
	 * @param commentTime		评论时间
	 * @param commenContent     评论内容
	 * @param imagePath         图片路径
	 * @param merchandiseCompliance 商品符合度
	 * @param storeAttitude    店家态度
	 * @param logisticsSpeed   物流速度
	 * @param dispatcherAttitude  配送员态度
	 * @return int 是否评论成功
	 */
	@RequestMapping(method=RequestMethod.GET,value="/usreComment.html",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String usreComment(@RequestParam("userId") int userId,@RequestParam("oderNumber") int oderNumber,
			@RequestParam("commodityId") int commodityId,@RequestParam("commenContent") String commenContent,
			@RequestParam("imagePath") String imagePath,@RequestParam("merchandiseCompliance") int merchandiseCompliance,
			@RequestParam("storeAttitude") int storeAttitude,@RequestParam("logisticsSpeed") int logisticsSpeed,
			@RequestParam("dispatcherAttitude") int dispatcherAttitude){
		ProductReviewsEntity productReviewsEntity = new ProductReviewsEntity();
		JSONObject json = new JSONObject();
		productReviewsEntity.setUserId(userId);
		productReviewsEntity.setCommodityId(commodityId);
		productReviewsEntity.setOderNumber(oderNumber);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);		
		productReviewsEntity.setCommentTime(dateFormat.format(date));
		productReviewsEntity.setCommenContent(commenContent);
		productReviewsEntity.setImagePath(imagePath);
		productReviewsEntity.setMerchandiseCompliance(merchandiseCompliance);
		productReviewsEntity.setStoreAttitude(storeAttitude);
		productReviewsEntity.setLogisticsSpeed(logisticsSpeed);
		productReviewsEntity.setDispatcherAttitude(dispatcherAttitude);
		int success = productReviewsService.saveComment(productReviewsEntity);
		json.put("success", success);
		return json.toString();
		
	}
}
