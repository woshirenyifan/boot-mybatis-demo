/**
 * @author ryf
 */
package com.ryf.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 *
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lombok {

	private Integer no;
	private String name;
	private Date birth;
	
	public static void main(String[] args) {
		
		Lombok lombok = new Lombok(1,"Allen",new Date());
		log.info(lombok.toString());
		System.out.println(lombok.toString());
	}
}
