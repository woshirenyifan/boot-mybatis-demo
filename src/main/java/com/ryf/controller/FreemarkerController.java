/**
 * @author ryf
 */
package com.ryf.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *
 */
/**
 * freemarker 默认的文件在resources 文件夹下的 templates 文件夹
 * @author Administrator
 *
 */
@Controller
public class FreemarkerController {

	@RequestMapping("/freemarker")
	public String freemarker(Map<String,Object> map){
		
		map.put("name", "Allen");
		map.put("age", "30");
		map.put("sex","male");
		
		return "freemarker";
	}
	
	@RequestMapping("/freemarker/order")
	public String order(Map<String,Object> map){
		
		map.put("name", "Allen");
		map.put("age", "30");
		map.put("sex","male");
		
		return "/order/freemarker";
	}
}
