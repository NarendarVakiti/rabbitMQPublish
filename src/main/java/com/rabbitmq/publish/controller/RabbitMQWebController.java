package com.rabbitmq.publish.controller;
import com.rabbitmq.publish.bean.ResourceInfo;
import com.rabbitmq.publish.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@PostMapping(value = "/publishresource")
	public String publishResource(@RequestBody ResourceInfo resourceInfo) {
		rabbitMQSender.publishResource(resourceInfo);
		return "Message sent to the RabbitMQ Successfully";
	}

}