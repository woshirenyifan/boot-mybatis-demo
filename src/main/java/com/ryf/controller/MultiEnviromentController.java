/**
 * @author ryf
 */
package com.ryf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Administrator
 *
 */
@RestController
public class MultiEnviromentController {

	@Value("${myName}")
	private String name;
	
	@RequestMapping("/multiEnv")
	public String testMultiEnviroment(){
		
		return name;
	}
}
