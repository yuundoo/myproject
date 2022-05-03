package com.devandy.web.vo;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BuyerVO{
	@JsonProperty(value = "idx")
	private int idx;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "phone_number")
	private int phone_number ;
	
}
