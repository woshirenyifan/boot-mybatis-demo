package com.ryf.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class BeanConfig {
	
	@Bean
	public HttpMessageConverters getHttpMessageConverters(){
		HttpMessageConverters converters = null;
		
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		converter.setFastJsonConfig(fastJsonConfig);
		converters = new HttpMessageConverters(converter);
		return converters;
	}
}
