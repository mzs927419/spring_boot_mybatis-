/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Contact mengzs.java@qq.com
 */
package com.mzs.costom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author mengzs 
 * @Email mengzs.java@qq.com
 * @Phone 13211786302
 * @Date 2017年9月4日
 */
@RequestMapping("/")
@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	
}
