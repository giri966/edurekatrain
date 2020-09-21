package com.example.demo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.JSR_Annotations;

public class JSR_Annotationstest {
	
	@Test
	public void PracticeJSRannotations() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.demo");
		JSR_Annotations jsr_annotation = applicationContext.getBean(JSR_Annotations.class);
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		jsr_annotation.m1();
		
		Assertions.assertThat(jsr_annotation).isNotNull();
		Assertions.assertThat(jsr_annotation.isInitCalled()).isTrue();
	}

}
