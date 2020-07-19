package com.rabbitmq.publish.bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

@Data
public class ResourceInfo {

    private String resourceType;
    private String resourceURL;
    private String description;
}
