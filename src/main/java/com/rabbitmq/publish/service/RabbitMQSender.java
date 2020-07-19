package com.rabbitmq.publish.service;

import com.rabbitmq.publish.bean.ResourceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${test.resource.exchange}")
	private String exchange;
	
	@Value("${test.resource.routingkey}")
	private String routingkey;	
	
	public void publishResource(ResourceInfo resourceInfo) {
		rabbitTemplate.convertAndSend(exchange, routingkey, resourceInfo);
		System.out.println("Resource Information : " + resourceInfo);

	}
}