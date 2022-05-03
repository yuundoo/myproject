package com.devandy.web.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InfoVO{
	@JsonProperty(value = "idx")
	private int idx;
	@JsonProperty(value = "pro_info")
	private String pro_info;
	@JsonProperty(value = "buyer")
	private String buyer ;
	@JsonProperty(value = "cost")
	private int cost;
	@JsonProperty(value = "buy_date")
	private Date buy_date;
	@JsonProperty(value = "buy_number")
	private String buy_number;
}
